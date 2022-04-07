package edu.fpdual.ejemplo.ejerciciosArrays;

public class ej2{
public ej2(){

}
public boolean contiene2o3(int[] arreglo){
for(int i = 0;i<arreglo.length;i++){
	if(arreglo[i] == 2 | arreglo[i] == 3){
		return true;
	}
}return false;
}

public static void main(String[] args){

}
}