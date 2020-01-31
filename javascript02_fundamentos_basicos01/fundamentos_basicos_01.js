/*1. Obtener del 1 al 255*/

function getTo() {
	var x = [];
	for(i=1;i<=255;i++) {
		x.push(i);
	}
	console.log(x);
}
getTo();


/*2. Conseguir pares hasta 1000*/

function getPares() {
	for(i=0; i<=1000; i++) {
		if (i % 2 == 0){
	       console.log(i);
	    }
	}
}
getPares();


/*3. Suma impares hasta 5000*/

function sumImpar() {
	var sum=0;
	for(i=1;i<=5000;i++) {
		if (i % 2 != 0){
			sum+=i;
		}    
	}
	console.log(sum);
}
sumImpar();


/*4. Itera un array (suma los valores del array)*/

function sum(input){
	if (toString.call(input) !== "[object Array]")
    	return false;
      
    	var total =  0;
    	for(var i=0;i<input.length;i++){                  
        	if(isNaN(input[i])){
            		continue;
        	}
        	total += Number(input[i]);
    	}
    	return total;
}
console.log(sum([1,2,5,15]));


/*5. Encuentra el mayor (max)*/

function getMax(y) {
	x=Math.max.apply(null, y);
	console.log(x);
}
getMax([-3,3,5,7]);


/*6. Encuentra el promedio (avg)¨*/

function getAvg(x) {
	var sum = 0;
	for(var i = 0; i<x.length; i++){
	    sum += parseInt( x[i], 10 );
	}
	var avg = sum/x.length;
	console.log(avg);
}
getAvg([1,3,5,7,20]);


/*7. Array de impares entre 1 y 50 (push)*/

function getImparTo() {
	var x=[];
	for(i=1;i<=50;i++) {
		if (i % 2 == 0){
			continue;
		}
		x.push(i);
	}
	console.log(x);
}
getImparTo();


/*8. Mayor que Y*/

function getGreaterThan(y, numbers) {
	var numbers = [1,3,5,7];
	var counter = 0;
	for (var i = 0; i < numbers.length; i++) {
		if (numbers[i] > y) {
		    counter +=1;
		}
	}
	return counter;
}
console.log(getGreaterThan(3));
	

/*9. Cuadrados*/

function getSquare(y) {
	var square = y.map(function(x) {
		return x*x;
	});
	console.log(square);
}
getSquare([1,5,10,-2]);


/*10.Negativos*/

function numReplace(x) {
	for (var i = 0; i < x.length; i++) {
		if (x[i] < 0) {
			x[i] = 0;
		}
	}

	console.log(x);
}
numReplace([523, -3452, -334, 31, 5346]);


/*11.Max/Min/Avg*/

function getValues(z) {
	x=Math.max.apply(null, z);
	y=Math.min.apply(null, z);

	var sum = 0;
	for(var i = 0; i<z.length; i++){
		sum += parseInt( z[i], 10 );
	}

	var avg = sum/z.length;
	console.log([x,y,avg]);
}
getValues([1,2,-3,-5,5]);


/*12.Intercambia Valores*/

function valueSwap() {
	var arr = [1,5,10,-2];

	for (var i = 0; arr.length >= 2; i++) {
		[arr[0], arr[arr.length - 1]] = [arr[arr.length - 1], arr[0]];
    	return arr;
	}
}
valueSwap();

// Otra opción

function valueSwap(x) {
	for (var i = 0; x.length >= 2; i++) {
		[x[0], x[x.length - 1]] = [x[x.length - 1], x[0]];
    	return x;
	}
}
valueSwap([1,5,10,-2]);


/*13.De Número a String*/

function stringReplace(x) {
	var items = [-1,-3,2];
	var index = items.indexOf(x<0);

	for (var i = 0; i < items.length; i++) {
		if (items[i] < 0) {
			items[i] = 'Dojo';
		}
	}

	console.log(items);
}
stringReplace();

//Otra opción

function stringReplace(x) {
	for (var i = 0; i < x.length; i++) {
		if (x[i] < 0) {
			x[i] = 'Dojo';
		}
	}

	console.log(x);
}
stringReplace([-1,-3,2]);
