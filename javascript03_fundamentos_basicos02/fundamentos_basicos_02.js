/*1.Tamaño Grande - Dado un array, escribe una función que cambie todos los números positivos en él, por el string 'big'. 
Ejemplo: grande([-1,3,5,-5]) devuelve [-1, 'grande', 'grande', -5].*/

function replacePos(x) {
	for(i=0;i<x.length;i++){
		if(x[i]>0) {
			x[i] = 'grande';
		}
	}
	console.log(x);
}
replacePos([-1,3,5,-5]);


/*2.Imprime (print) el menor, devuelve (return) el mayor - Crea una función que tome un array de números. 
La función debería imprimir (print) el valor menor del array, y devolver (return) el mayor.*/

function getValues(z) {
	x=Math.max.apply(null, z);
	y=Math.min.apply(null, z);

	console.log(y);
	return x;
}
getValues([1,34,-20,-5,5]);

// Otra opción (para sacar mayor)

function getValues(z) {
	var x = z[0];
	for(var i=0; i<z.length; i++) {
		if(x<z[i]){
			x=z[i];
		}
	}
	return x;
}
getValues([1,34,-20,-5,5]);


/*3.Imprime (print) uno, devuelve (return) otro- Crea una función para un array de números. 
La función debería imprimir (print) el penúltimo valor y devolver (return) el primer valor impar.*/

function getNum(x) {
	p = x[x.length -2];
	console.log(p);
	for(var i=0; i<x.length; i++) {
		if (x[i] !== x[0] && x[i]%2 !=0) {
			impar = x[i];
			return impar;
		}	
	}
}
getNum([14,21,3,8,14,78]);


/*4.Doble Visión - Dado un array (similar a decir 'tomado un array'), 
crea una función que devuelva un nuevo array donde cada valor se duplique. 
Entonces, doble([1,2,3]) debiera devolver [2, 4, 6] sin cambiar el array original.*/

function getDoble(y) {
	var doble = y.map(function(x) {
		return x*2;
	});
	console.log(y);
	console.log(doble);
}
getDoble([1,2,3]);


/*5.Contar Positivos -  Dado un array de números, crea una función para reemplazar el último valor con el número de valores positivos 
encontrados en el array. Ejemplo, contarPositivos([-1,1,1,1]) cambia el array original y devuelve [-1,1,1,3].*/

function countPos(y) {
	var counter = 0;
	for (var i = 0; i < y.length; i++) {
		if (y[i] > 0 && y[i] != y[y.length -1]) {
		    counter +=1;
		}
		y[y.length - 1] = counter;
	}
	console.log(y);
}
countPos([2,6,5,7,-1,-4,7,-3]);


/*6. Pares e Impares - Crea una función que acepte un array. Cada vez que ese array tenga 3 valores impares seguidos, 
imprime (print) '¡Qué imparcial!', y cada vez que tenga 3 pares seguidos, imprime (print) '¡Es para bien!'.*/

function replaceExp(x){
	for(var i = 0; i < x.length-2; i++){
		if(x[i]%2==0 && x[i+1]%2==0 && x[i+2]%2==0){
		    console.log("¡Es para bien!");
		}

		else if(x[i]%2!=0 && x[i+1]%2!=0 && x[i+2]%2!=0){
		    console.log("¡Qué imparcial!");
		}
	}
}
replaceExp([3,4,8,12,7,9,11,17,29]);


/*7. Incrementa los Segundos - Dado un array de números arr, agrega 1 a cualquier otro elemento, específicamente a aquellos 
cuyo índice es impar (arr[1], arr[3], arr[5], etc). Luego, console.log cada valor del array y devuelve arr.*/

function addSec(x) {
	for(i=0; i < x.length; i++) {
		if(i % 2 != 0) {
			x[i] = x[i] + 1; 
		}
	}
	return x;
}
addSec([3,6,4,2,10]);


/*8. Longitudes previas - Pasado un array (similar a decir 'tomado un array' o 'dado un array') que contiene strings, 
reemplaza cada string con un número de acuerdo cantidad de letras (longitud) del string anterior. Por ejemplo, longitudesPrevias
(['programar','dojo', 'genial']) debería devolver ['programar',9, 4]. Pista: ¿For loops solo puede ir hacia adelante?*/

function changeString(x) {
	for(var i = x.length -1; i > 0; i--) {
		x[i] = x[i-1].length;
	}
	return x;
}
changeString(['programar','dojo','genial']);


/*9.Agrega Siete - Construye una función que acepte un array. Devuelve un nuevo array con todos los valores del original, 
pero sumando 7 a cada uno. No alteres el array original. Por ejemplo, agregaSiete([1,2,3) debería devolver [8,9,10] en un nuevo array.*/

function addSeven(y) {
	var seven = y.map(function(x) {
		return x+7;
	});
	console.log(y);
	console.log(seven);
}
addSeven([8,22,5,4]);


/*10.Array Inverso - Dado un array, escribe una función que invierte sus valores en el lugar. 
Ejemplo: invertir([3,1,6,4,2)) devuelve el mismo array pero con sus valores al revés, es decir [2,4,6,1,3]. 
Haz esto sin crear un array temporal vacío. (Pista: necesitarás intercambiar (swap) valores).*/

function reverseArr(x) {
	rev = x.reverse();
	console.log(rev);
}
reverseArr([2,5,6,7,8,9,23]);

//Otra opción

function reverseArray(x) {
  	var newArray = [];
  	for (var i = x.length - 1; i >= 0; i--) {
    	newArray.push(x[i]);
  	}
  	return newArray;
}
reverseArray([2,5,6,7,8,9,23]);


/*11.Perspectiva: Negativa - Dado un array crear y devuelve uno nuevo que contenga todos los valores del array original, 
pero negativos (no simplemente multiplicando por -1). Dado [1,-3,5], devuelve [-1,-3,-5].*/

function getNeg(y) {
	var neg = y.map(function(x) {
		return -x;
	});
	console.log(neg);
}
getNeg([8,14,10]);


/*12.Siempre hambriento - Crea una función que acepte un array e imprima (print) 'yummy' 
cada vez que alguno de los valores sea 'comida'. Si ningún valor es 'comida', entonces imprime 'tengo hambre' una vez.*/

function getFood(x) {
	var counter = 0;
	for(var i=0; i<x.length; i++) {
		if(x[i] == 'comida') {
			counter += 1;
			if(counter > 0) {
				console.log("yummy");
			}
		}
		else {
			if(counter == 0) {
				console.log("I'm hungry");
				break;
			}
		}
	}
}
getFood(['comida','naranja','pera']);
	 

/*13.Cambiar hacia el centro -  Dado un array, cambia el primer y último valor, el tercero con el ante penútimo, etc. 
Ejemplo: cambiaHaciaElCentro([true, 42, 'Ada', 2, 'pizza']) cambia el array a ['pizza', 42, 'Ada', true]. 
cambiaHaciaElCentro([1,2,3,4,5,6]) cambia el array a [6,2,4,3,5,1]. No es necesario devolver (return) el array esta vez.*/

function centerRep(x) {
	temp = 0;
	swap = 0;

	if(x.length % 2 == 0) {
		for(var i=1; i<=x.length-3; i++) {
			temp = x[i-1];
			swap = x[x.length + (i*-1)];

			x[i-1] = swap;
			x[x.length + (i*-1)] = temp;
		}
	}
	else {
		for(var i=1; i<=x.length-2; i++) {
			temp = x[i-1];
			swap = x[x.length + (i*-1)];

			x[i-1] = swap;
			x[x.length + (i*-1)] = temp; 
		}
	}
	return x;
}
centerRep([17,8,23,4,5,6]);


/*14. Escala el Array - Dado un array arr y un número num, multiplica todos los valores en el array arr por el número num, 
y devuelve el array arr modificado. Por ejemplo, escalaArray([1,2,3], 3] debería devolver [3,6,9].*/

function getEsc(y,num) {
	var multi = y.map(function(x) {
		return x*num;
	});
	console.log(multi);
}
getEsc([1,2,3],5);
