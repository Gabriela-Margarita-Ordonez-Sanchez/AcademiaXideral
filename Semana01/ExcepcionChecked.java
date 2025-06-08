import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcepcionChecked {
    public static void main(String[] args) {
        try {
            File archivo = new File("archivo.txt"); //Intenta abrir el archivo
            Scanner lector = new Scanner(archivo);
            System.out.println("Archivo leído correctamente.");
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
