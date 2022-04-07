package edu.fpdual.ejemplo.ejerciciosArrays;

public class ej4{
public ej4(){

}
public int[] devuelveIntermedios(int[] arreglo){
	int[] resultado = new int[arreglo.length];
	for(int i = 0;i<arreglo.length;i++){
	resultado[i] = arreglo[arreglo.length-i-1];
	}
	return resultado;
}

public static void main(String[] args){

}
}