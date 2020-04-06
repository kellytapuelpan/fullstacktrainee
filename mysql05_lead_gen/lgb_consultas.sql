/*1. ¿Qué consulta ejecutaría para obtener los ingresos totales para marzo de 2012?*/

SELECT MONTHNAME(charged_datetime) AS month, SUM(amount) AS revenue FROM billing
WHERE charged_datetime >= '2012/03/01' AND charged_datetime < '2012/03/31'
GROUP BY MONTHNAME(charged_datetime);


/*2. ¿Qué consulta ejecutaría para obtener los ingresos totales recaudados del cliente con una identificación de 2?*/

SELECT client_id, SUM(amount) AS total_revenue FROM billing
WHERE client_id=2;


/*3. ¿Qué consulta ejecutaría para obtener todos los sitios que posee client = 10?*/

SELECT domain_name AS website, client_id FROM sites
WHERE client_id=10;


/*4. ¿Qué consulta ejecutaría para obtener el número total de sitios creados por mes por año para el cliente con una 
identificación de 1? ¿Qué pasa con el cliente = 20?*/

SELECT client_id, COUNT(domain_name) AS number_of_websites, MONTHNAME(created_datetime) AS month_created, YEAR(created_datetime) AS year_created FROM sites
WHERE client_id=1
GROUP BY created_datetime;

SELECT client_id, COUNT(domain_name) AS number_of_websites, MONTHNAME(created_datetime) AS month_created, YEAR(created_datetime) AS year_created FROM sites
WHERE client_id=20
GROUP BY created_datetime;


/*5. ¿Qué consulta ejecutaría para obtener el número total de clientes potenciales generados para cada uno de los 
sitios entre el 1 de enero de 2011 y el 15 de febrero de 2011?*/

SELECT s.domain_name as website, COUNT(l.leads_id) AS number_of_leads, DATE_FORMAT(l.registered_datetime,'%M %d, %Y') AS date_generated FROM sites s
INNER JOIN leads l ON s.site_id=l.site_id 
WHERE l.registered_datetime BETWEEN '2011/01/01' and '2011/02/15' 
GROUP BY leads_id;


/*6. ¿Qué consulta ejecutaría para obtener una lista de nombres de clientes y el número total de clientes potenciales 
que hemos generado para cada uno de nuestros clientes entre el 1 de enero de 2011 y el 31 de diciembre de 2011?*/

SELECT CONCAT(c.first_name," ", c.last_name) AS client_name, COUNT(l.leads_id) AS number_of_leads FROM clients c
INNER JOIN sites s ON c.client_id=s.client_id 
INNER JOIN leads l ON s.site_id=l.site_id 
WHERE l.registered_datetime BETWEEN '2011/01/01' AND '2011/12/31'
GROUP BY client_name
ORDER BY number_of_leads DESC;


/*7. ¿Qué consulta ejecutaría para obtener una lista de nombres de clientes y el número total de clientes potenciales 
que hemos generado para cada cliente cada mes entre los meses 1 y 6 del año 2011?*/

SELECT CONCAT(c.first_name," ", c.last_name) AS client_name, COUNT(l.leads_id) AS number_of_leads, MONTHNAME(l.registered_datetime) AS month_generated FROM clients c
INNER JOIN sites s ON c.client_id=s.client_id 
INNER JOIN leads l ON s.site_id=l.site_id 
WHERE l.registered_datetime BETWEEN '2011/01/01' AND '2011/06/30'
GROUP BY l.leads_id
ORDER BY number_of_leads DESC;


/*8. ¿Qué consulta ejecutaría para obtener una lista de nombres de clientes y el número total de clientes potenciales 
que hemos generado para cada uno de los sitios de nuestros clientes entre el 1 de enero de 2011 y el 31 de diciembre de 2011? 
Solicite esta consulta por ID de cliente. Presente una segunda consulta que muestre todos los clientes, los nombres del sitio 
y el número total de clientes potenciales generados en cada sitio en todo momento.*/

SELECT CONCAT(c.first_name," ", c.last_name) AS client_name, domain_name, COUNT(*) AS number_of_leads FROM leads l
INNER JOIN sites s ON l.site_id = s.site_id
INNER JOIN clients c ON s.client_id = c.client_id
WHERE registered_datetime >= '2011/01/01' AND registered_datetime <= '2011/12/31'
GROUP BY s.client_id, l.site_id
ORDER BY number_of_leads DESC;

SELECT CONCAT(c.first_name," ", c.last_name) AS client_name, domain_name, COUNT(*) AS number_of_leads FROM leads l
INNER JOIN sites s ON l.site_id = s.site_id
INNER JOIN clients c ON s.client_id = c.client_id
GROUP BY s.client_id, l.site_id
ORDER BY client_name DESC, number_of_leads DESC;


/*9. Escriba una sola consulta que recupere los ingresos totales recaudados de cada cliente para cada mes del año. 
Pídalo por ID de cliente.*/

SELECT CONCAT(c.first_name, " ", c.last_name) AS client_name, SUM(b.amount) AS total_revenue, MONTHNAME(b.charged_datetime) aASmonth_charge, YEAR(b.charged_datetime) as year_charge FROM clients c
LEFT JOIN billing b ON c.client_id=b.client_id 
GROUP BY c.client_id, YEAR(b.charged_datetime), MONTHNAME(b.charged_datetime)
ORDER BY client_name, month_charge, year_charge;


/*10. Escriba una sola consulta que recupere todos los sitios que posee cada cliente. 
Agrupe los resultados para que cada fila muestre un nuevo cliente. 
Se volverá más claro cuando agregue un nuevo campo llamado 'sitios' que tiene todos los sitios que posee el cliente. 
(SUGERENCIA: use GROUP_CONCAT)*/

SELECT CONCAT(c.first_name," ",c.last_name) AS client_name, GROUP_CONCAT(s.domain_name SEPARATOR ' / ') AS sites FROM clients c
LEFT JOIN sites s ON c.client_id=s.client_id 
GROUP BY c.client_id;


/**/