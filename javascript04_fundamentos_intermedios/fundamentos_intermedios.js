/*1.Sigma - Implementa una función sigma(num) que, dado un número, devuelve la suma de todos los enteros positivos 
(incluyendo el número dado). Ej: sigma(3) = 6 (1+2+3); sigma(5) = 15 (1+2+3+4+5).*/

function sigma(x) {
	var sum=0;
	for(i=0;i<=x;i++) {
		sum+=i;  
	}
	console.log(sum);
}
sigma(3);


/*2.Factorial - Escribe una función factorial(num) que, dado un número, devuelva el producto (multiplicación) de todos 
los enteros positivos (incluyendo el número dado). Por ejemplo: factorial(3) = 6 (1*2*3); factorial(5) = 120 (1*2*3*4*5).*/

function factorial(x){
	return (x != 1) ? x * factorial(x - 1) : 1;
}
factorial(3);

// con For
function factorialFor(x) {
	if (x === 0 || x === 1)
	    return 1;
	for (var i = x - 1; i >= 1; i--) {
	    x *=i;
	}
	return x;
}
factorialFor(3);

// con recursividad
function factorialRec(x) {
  	if (x < 0) {
        return -1;
  	}
  	else if (num == 0) {
      	return 1;
  	}
  	else {
      	return (num * factorial(num - 1));
  	}
}
factorialRec(5);


/*3. Fibonacci - Crea una función para generar números de Fibonacci. En esta famosa secuencia matemática, 
cada número es la suma de las dos anteriores, partiendo con los valores 0 y 1. Tu función debería aceptar un argumento, 
un índice en la secuencia (donde 0 corresponde al valor inicial, 4 corresponden al valor cuatro más tarde, etc). 
Ejemplos: fibonacci(0) = 0 (dado), fibonacci(1) = 1 (dado), 
fibonacci(2) = 1 (fib(0)+fib(1), o 0+1), fibonacci(3) = 2 (fib(1) + fib(2)3, o 1+1), 
fibonacci(4) = 3 (1+2), fibonacci(5) = 5 (2+3), fibonacci(6) = 8 (3+5), fibonacci(7) = 13 (5+8). Haz esto primero sin usar recursión. 
Si no sabes qué es una recursión, no te preocupes puesto que vamos a introducir este concepto en la Parte 2 de esta actividad.*/

function fibonacci(num){
	var x = 1, y = 0, temp;

	while (num >= 0){
	    temp = x;
	    x = x + y;
	    y = temp;
	    num--;
	}
	return y;
}
fibonacci(8);

//Con recursividad
function fibonacci(num) {
  	if (num <= 1) {
  		return 1;
  	}
  	y = fibonacci(num - 1) + fibonacci(num - 2);
  	return y;
}
fibonacci(7);


/*4.Array: Penúltimo: Devuelve el penúltimo elemento del array. Dado [42,true,4,'Liam', 7] devuelve 'Liam'. 
Si el array es muy pequeño, devuelve null.*/

function almostLast(x) {
	for(var i = 0; i<x.length; i++){
		if(x.length<=2){
			return null;
		} else {
			y = x[x.length-2];
		}
	}
	console.log(y);
}
almostLast([42,true,4,'Liam',7]);


/*5.Array: “N” último: Devuelve el elemento “N” último. Dado ([5,2,3,6,4,9,7],3], devuelve 4. 
Si el array es muy pequeño, devuelve null.*/

function getNum(x,num) {
	for(var i = 0; i<x.length; i++){
		if(x.length<=2 || x.length<num){
			return null;
		} else {
			y = x[x.length-num];
		}
	}
	console.log(y);
}
getNum([5,2,3,6,4,9,7],3);


/*6.Array: Segundo más grande: Devuelve el segundo elemento más grande de un array. Dado [42,1,4,3.14,7], devuelve 7.  
Si el array es muy pequeño, devuelve null.*/

function getSecondHighest(x){
    var first=0;
    var second=0;
    for(var i=0;i<x.length;i++){
        if(x[i] > first){
            second = first;
            first = x[i];
        }
        else if(x[i]>second && x[i]<first){
            second = x[i];
       	} 
    }
    return second;
}
getSecondHighest([42,1,4,3.14,7]);


/*7.Doble Problema: Crea una función que cambie un array dado duplicando cada uno de sus elementos y manteniendo el orden original. 
Convierte [4, 'Ulysses', 42, false] a [4,4, 'Ulysses', 'Ulysses', 42, 42, false, false].*/

function repeatValues(x) {
	y = [];

	for(var i = 0; i<x.length; i++){
	  	y.push(x[i]);
	  	y.push(x[i]);
	}
	x = y;
	console.log(x);
}
repeatValues([4,'Ulysses', 42, false]);


//PARTE 2
/*1. Crea una función Fib(n) que devuelve el enésimo número Fibonacci. Usa recursión para esto.*/

function fib(n) {
  	if (n <= 1) {
  		return 1;
  	}
  	y = fib(n - 1) + fib(n - 2);
  	return y;
}
fib(11);


/*2.Relleno recursivo - Función se debe agregar al HTML entregado, al finals*/
function fill(x,y,original_color, color){
	if(y<0 || y>=world.length || x<0 || x>=10) {
		return false;
	}
			
	if(world[y][x] != original_color){
		return false;
	}
				
	world[y][x] = color;
	fill(x,y-1,original_color, color);
	fill(x,y+1,original_color, color);
	fill(x-1,y,original_color, color);
	fill(x+1,y,original_color, color);
	drawWorld();
}






