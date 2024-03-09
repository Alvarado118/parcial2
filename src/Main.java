public class Main {
    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            int valorMedio = arreglo[medio];

            if (valorMedio == elemento) {
                return medio;  // Se encontró el elemento, devolvemos el índice
            } else if (valorMedio < elemento) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;  // Si no se encuentra el elemento, devolvemos -1
    }

    public static void main(String[] args) {
        int[] miArreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elementoABuscar = 7;

        int resultado = busquedaBinaria(miArreglo, elementoABuscar);

        if (resultado != -1) {
            System.out.println("El elemento " + elementoABuscar + " se encuentra en el índice " + resultado + ".");
        } else {
            System.out.println("El elemento " + elementoABuscar + " no se encuentra en el arreglo.");
        }
    }
}


