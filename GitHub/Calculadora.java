import java.util.Scanner;

public class Calculadora {

    public static void suma(int num1, int num2) {
        int suma = num1 + num2;
        System.out.println("El total de la suma entre " + num1 + " y " + num2 + " es: " + suma);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introducel el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("introducel el segundo numero: ");
        int num2 = sc.nextInt();

        suma(num1, num2);
    }
}