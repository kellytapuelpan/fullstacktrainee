function burbuja(arreglo) {
	//recorremos todos los elementos hasta n-1
	for(i = 0; i < arreglo.length - 1 ; i++) {
		//recorremos todos los elementos hasta n-1
		for(j = 0; j < arreglo.length -1 ; j++){
			if(arreglo[j] > arreglo [j+1]) {
				aux = arreglo[j];
				arreglo[j] = arreglo[j+1];
				arreglo[j+1] = aux;
			}
		}
		return arreglo;
	}
}


arreglo([3,2,1])