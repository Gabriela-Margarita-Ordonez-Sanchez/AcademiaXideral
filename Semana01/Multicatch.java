public class Multicatch {
    public static void main(String[] args) {
        try {
            int[] arreglo = new int[2];
            System.out.println(arreglo[5]);
            int division = 10 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Se produjo una excepcion " + e.getMessage());
        }
    }
}
