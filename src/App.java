import java.util.Scanner;

public class App {
    public static int obtenerEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int valor = scanner.nextInt();
        return valor;

    }

    public static void generarValores() {
        Scanner scanner = new Scanner(System.in);
        int n = obtenerEntrada();
        int conteo = 0;
        while (conteo < n) {
            conteo = conteo + 1;
            System.out.println(conteo);
        }
    }

    public static void generarValorespPares() {
        int n = obtenerEntrada();
        int conteo = 0;
        while (conteo < n) {
            if (conteo % 2 == 0) {
                System.out.println(conteo);
            }
            conteo++;

        }

    }
    public static void generarRandom () {
        int n = (int) (Math.random() * 3500);
        int conteo = 0;
        while (conteo < n) {
            conteo = conteo + 5;
            System.out.println(conteo);

        }
    }

    public static void main(String[] args) {
        generarRandom();
    }
}
