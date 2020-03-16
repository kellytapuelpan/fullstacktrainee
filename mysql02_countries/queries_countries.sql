/*1. ¿Qué consulta harías para obtener todos los países que hablan esloveno? Tu consulta debe devolver el nombre del país, el idioma y el porcentaje de idioma. Tu consulta debe organizar el resultado por porcentaje de idioma en orden descendente.*/

SELECT name, language, percentage FROM languages l
INNER JOIN countries c ON c.id = l.country_id
WHERE language = 'Slovene'
ORDER BY percentage DESC;


/*2. ¿Qué consulta ejecutarías para mostrar el número total de ciudades para cada país? Su consulta debe devolver el nombre del país y el número total de ciudades. Tu consulta debe organizar el resultado por el número de ciudades en orden descendente.*/

SELECT p.name, COUNT(country_id) AS cities_qty FROM cities c 
INNER JOIN countries p ON c.country_id = p.id
GROUP BY p.name
ORDER BY cities_qty DESC;


/*3. ¿Qué consulta harías para obtener todas las ciudades de México con una población de más de 500,000? Tu consulta debe organizar el resultado por población en orden descendente.*/

SELECT name, population FROM cities
WHERE country_id = 136 AND population >= 500000;
ORDER BY population DESC;


/*4. ¿Qué consulta ejecutarías para obtener todos los idiomas en cada país con un porcentaje superior al 89%? Tu consulta debe organizar el resultado por porcentaje en orden descendente.*/

SELECT name, language, percentage FROM languages l
INNER JOIN countries c ON c.id = l.country_id
WHERE percentage >= 89;
ORDER BY percentage DESC;


/*5. ¿Qué consulta haría para obtener todos los países con un área de superficie inferior a 501 y una población superior a 100,000?*/

SELECT name, surface_area, population FROM countries
WHERE surface_area < 501
AND population > 100000;


/*6. ¿Qué consulta harías para obtener países con solo Monarquía Constitucional con un capital superior a 200 y una esperanza de vida superior a 75 años? */

SELECT name, life_expectancy, government_form FROM countries
WHERE government_form = 'Constitutional Monarchy'
AND life_expectancy > 75
AND capital > 200;


/*7. ¿Qué consulta harías para obtener todas las ciudades de Argentina dentro del distrito de Buenos Aires y tener una población superior a 500,000? La consulta debe devolver el nombre del país, el nombre de la ciudad, el distrito y la población.*/

SELECT cities.name, district, cities.population FROM cities
INNER JOIN countries c ON c.id = cities.country_id
WHERE c.name = 'Argentina'
AND district = 'Buenos Aires';


/* 8. ¿Qué consulta harías para resumir el número de países en cada región? 
La consulta debe mostrar el nombre de la región y el número de países. 
Además, la consulta debe organizar el resultado por el número de países en orden descendente.*/

SELECT region, COUNT(region) AS country_qty
FROM countries
GROUP BY region
ORDER BY country_qty DESC;


/**/