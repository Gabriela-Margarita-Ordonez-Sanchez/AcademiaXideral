public class ExcepcionUnchecked {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        try {
            System.out.println("Valor en la posición 5: " + numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Error: Indice fuera del rango del arreglo.");
        }
    }
}
