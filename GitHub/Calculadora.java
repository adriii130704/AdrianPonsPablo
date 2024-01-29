import java.util.Scanner;

public class Calculadora {

    public static void sumayResta(int num1, String simbolo, int num2) {
        // ehh cambiado la suma por un if para elegir entre suma y resta
        switch (simbolo) {
            case "+":
                System.out.println("la suma entre " + num1 + " y " + num2 + " es: " + (num1 + num2));
            case "-":
                System.out.println("la resta entre " + num1 + " y " + num2 + " es: " + (num1 - num2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introducel el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Pon simbolo suma(+) o resta(-): ");
        String simbolo = sc.nextLine();
        sc.nextLine();
        System.out.print("introducel el segundo numero: ");
        int num2 = sc.nextInt();
        sumayResta(num1, simbolo, num2);
        sc.close();
    }
}
