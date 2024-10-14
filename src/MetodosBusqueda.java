public class MetodosBusqueda {

    public int busquedaSecuencial(int[] arreglo, int valorBuscado){
        //int pos = -1;
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == valorBuscado){
                //pos = i;
                return i;
            }
        }
        //return pos;
        return -1;
    }

    public int busquedaBinaria(int[] arr, int value){
        int inicio = 0;
        int fin = arr.length -1;

        while(inicio <= fin){
            int medio = inicio + (fin - inicio) / 2;
            
            if(arr[medio] == value){
                //Elemento econtrado
                return medio;
            }

            if(arr[medio] < value){

                inicio = medio+1;//Buscar en la mitad de la derecha
            }else{
                fin = medio -1;//Buscar en la mitad de la izquierda
            }
        }
        return -1;
    }
    

    public void printArreglo(int[]arreglo){
        for(int elem : arreglo){
            System.out.println(elem + " ");
        }
    }


    public int arreglo(int[] arr, int valor){
        int numero = 0;
        for(int i = 0; i <= arr.length  ; i++){
            if(arr[i] == valor){
                numero++;
                return i;
            }
        }
        System.out.println(numero);
        return -1;
    }
}
