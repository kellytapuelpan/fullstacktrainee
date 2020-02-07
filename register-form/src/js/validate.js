function validateDv(rut) {
	elemento = document.getElementById('rut');
	var valor = elemento.value.replace('.','');
	valor = valor.replace('-','');
	numero = valor.slice(0,-1);
    dv = valor.slice(-1).toUpperCase();

    rut.value = numero + '-'+ dv;

    if(numero.length < 7) {
	   	rut.setCustomValidity('Su RUT esta incompleto'); 
	    return false;
	} else if(numero.length == 0 || isNaN(rut)){
		return false;
	} else if(numero.length > 11) {
		rut.setCustomValidity('Ingrese un RUT valido'); 
	    return false;
	}

	var suma	= 0;
	var multi   = 2;
	
	for(i=1;i<=numero.length;i++) {
		index = multi * valor.charAt(numero.length - i);
        suma = suma + index;
        if(multi < 7) { 
        	multi = multi + 1; 
        } else { 
        	multi = 2; 
        }
	}

	dvValido = 11 - (suma % 11);
    dv = (dv == 'K')?10:dv;
    dv = (dv == 0)?11:dv;
    
    if(dvValido != dv) {
    	rut.setCustomValidity('El RUT ingresado no es valido'); 
    	return false; 
    } else {
    	rut.setCustomValidity('Su RUT es valido');
    }
}
