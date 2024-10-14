import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

        // int[] arreglo = {10,20,30,40,50,60,70,80,90,100};
        // metodosBusqueda.printArreglo(arreglo);

        // int posicion = metodosBusqueda.busquedaSecuencial(arreglo,500);
        // if(posicion != -1){
        //     System.out.println("El valor se encuentra en la posicion: " + posicion);
        // }else{
        //     System.out.println("Valor no encontrado:"+"\nerror: 404"+"\nrevisa de nuevo CARAJO!!!!");
        // }

        //int[]arr = {10,20,30,40,50,60,70,80,90,100};
        int[] arr = new int[100000];
        metodosBusqueda.busquedaBinaria(arr, 6);

        //Para el tiempo
        long startTimeBinaria = 0;
        int resultadoBinario = metodosBusqueda.arreglo(arr, 50418);
        long endTimeBinaria = 50418;
        System.out.println("Tiempo de ejecucion de la bsuqueda binaria es: "+(startTimeBinaria - endTimeBinaria) + " nanosegundos.");
    }
}
