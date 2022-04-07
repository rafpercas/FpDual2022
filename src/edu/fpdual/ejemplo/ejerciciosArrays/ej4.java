package edu.fpdual.ejemplo.ejerciciosArrays;

import java.util.Arrays;

public class ej4{
public ej4(){

}
public int[] reverseArray(int[] arreglo){
	int[] resultado = new int[arreglo.length];
	for(int i = 0;i<arreglo.length;i++){
	resultado[i] = arreglo[arreglo.length-i-1];
	}
	return resultado;
}

public static void main(String[] args){
	int[] array = new int[]{1,2,3,4,5,6};
	ej4 p1 = new ej4();
	System.out.println(Arrays.toString(p1.reverseArray(array)));
}
}