package edu.fpdual.ejemplo.ejerciciosArrays;

import java.util.Arrays;

public class ej3{
public ej3(){

}

public static int[] devuelveIntermedios(int[] arreglo){
	int[] resultado = new int[2];
	if(arreglo.length % 2 ==0){ 
	resultado[1] = arreglo[arreglo.length/2];
	resultado[0] = arreglo[(arreglo.length/2)-1];
	}else{
	System.out.println("Arreglo no valido.");
	}
	return resultado;
}
public static void main(String[] args){
	int[] numeros = {2,4,6,8,10,12};
	
	System.out.println(Arrays.toString(devuelveIntermedios(numeros)));
}

}