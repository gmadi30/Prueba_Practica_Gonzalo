package repaso_arrays_gonzalo;

public class repaso {

	public static void main(String[] args) {
		
		int array1[] = {1, 3, 4 ,7};
		int array2[] = {5, 9, 1, 2, 3};
		
		int array3[] = fusion2(array1, array2);
		
		mostrarArray(array3);
		System.out.println();
		
		ordenacionBurbuja(array1);
		ordenacionBurbuja(array2);
		ordenacionBurbuja(array3);
		
		mostrarArray(array1);
		System.out.println();
		mostrarArray(array2);
		System.out.println();
		mostrarArray(array3);
		System.out.println();
		
		media(array1);
		parImpar(array1);
	

	}
	
	
	public static int[] insertar(int dato, int pos, int[] array) {
		
		for(int i = array.length - 1; i > pos - 1; i--) {
			
			array[i] = array[i-1];
		}
		
		array[pos - 1] = dato;
		
		return array;
	}
	
	

	//Metodo de busqueda binaria
	
	
	public static int busquedaBinaria(int valor, int[] array) {
		
		int inicio = 0;
		int ultimo = array.length - 1;
		int central;
		
		
		do {
			central = (inicio + ultimo )/2;
			
			if(valor > array[central]) {
				inicio = central + 1;
				
			} else if (valor < array[central]) {
				ultimo = central - 1;
				
			}
			
		}while(inicio <= ultimo && array[central] != valor);
		
		if(valor == array[central]) {
			
			return central;
			
		} else {
			return -1;
		}
	}
	
	
	//Metodo que fusiona dos arrays
	
	
	public static int[] fusionArray(int[] array1, int[] array2) {
		
		
		int array3[] = new int[array1.length + array2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while( i < array1.length && j < array2.length) {
			
			if(array1[i] < array2[j]) {
				array3[k] = array1[i];
				i++;
				k++;
			} else {
				array3[k] = array2[j];
				j++;
				k++;
			}
		}
		
		
		while(i < array1.length) {
			array3[k] = array1[i];
			i++;
			k++;
		}
		
		while(j < array2.length) {
			array3[k] = array2[j];
			j++;
			k++;
		}
		
		return array3;
		
	}

	 
	public static void mostrarArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " " );
		}
	}
	
	public static int busquedaSecuencial(int[] array, int valor) {
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == valor) {
				return i;
			}
		}
		return -1;
	}
	
	public static int busquedaSecuencial2(int[] array, int valor) {
		int pos = 0;
		boolean salir = false;
		
		while(!salir && pos < array.length) {
			if(array[pos] == valor) {
				salir = true;
			}
			pos++; 
		}
		if(salir == true) {
			return pos -1; //De vuelve la posicion del valor buscado en el array;
		}
		return -1;
	}
	
	public static int[] fusion2(int[] array1, int[]array2) {
		
		int[] array3 = new int[array1.length + array2.length];
		
		int i = 0;
		int j = 0;
		int z = 0;
		
		while (i < array1.length) {
			array3[z] = array1[i];
			i++;
			z++;
		}
		while(j < array2.length) {
			array3[z] = array2[j];
			j++;
			z++;
		}
		
		return array3;
	}
	
	public static void ordenacionBurbuja(int[] array) {
		
		boolean hayIntercambio;
		do {
			hayIntercambio = false;
			for(int i = 0; i < array.length - 1; i++) {
				int aux;
				if(array[i] > array[i+1]) {
					aux = array[i];
					array[i] = array[i+1];
					array[i+1] = aux;
					hayIntercambio = true;
				}
			}
			
		}while(hayIntercambio);
	}
	
	public static void media(int[] array) {
		int acomulador = 0;
		int contador = 0;
		float media = 0;
		
		for (int i = 0; i < array.length; i++) {
			acomulador += array[i];
			contador++;
		}
		
		media = (float)acomulador / contador;
	
		
		System.out.println(media);
		
	}
	
	public static void parImpar(int[] array) {
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("El array tiene " + par + " numeros par y " + impar + " numeros impares.");
	}
	
	
	
	
}

