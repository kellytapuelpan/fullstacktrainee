/*1.Configura un array para que los valores negativos se transformen en 0. Por ejemplo, resetNegativos([1,2,-1,-3]) 
debiera dar como resultado [1,2,0,0].*/

function negToCero(x) {
	for(var i=0; i<x.length; i++) {
		if(x[i]<0) {
			x[i] = 0;
		}
	}
	console.log(x);
}
negToCero([1,2,-1,-3]);


/*2.Dado un array, mueve todos los valores un espacio de derecha a izquierda eliminando el primer valor y dejando un 0 
para el último valor. Por ejemplo, moverAdelante([1,2,3]) debiera dar como resultado [2,3,0].*/

function moveToLeft(x) {
  	for(i=0; i<x.length; i++){
    	var y = x.shift();
    	var z = x.push(0);
    	console.log(x);
  	}
}
moveToLeft([1, 2, 3, 4]);


/*3.Configura un array para que el resultado sean los valores en el orden contrario. Por ejemplo, returnReverso([1,2,3]) 
debe dar [3,2,1].*/

function reverseArr(x) {
	rev = x.reverse();
	console.log(rev);
}
reverseArr([1,2,3]);

//Otra opción

function reverseArray(x) {
  	var newArray = [];
  	for (var i = x.length - 1; i >= 0; i--) {
    	newArray.push(x[i]);
  	}
  	return newArray;
}
reverseArray([1,2,3]);


/*4.Crea una función que cambie un array repitiendo sus valores originales (manteniendo el mismo orden). 
Por ejemplo, repetirValores([4,”Ulysses”, 42, false]) debiera dar [4,4, “Ulysses”, “Ulysses”, 42, 42, false, false].*/

function repeatValues(x) {
	y = [];

	for(var i = 0; i< x.length;++i){
	  	y.push(x[i]);
	  	y.push(x[i]);
	}
	x = y;
	console.log(x);
}
repeatValues([4,'Ulysses', 42, false]);



