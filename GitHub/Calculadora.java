import java.util.Scanner;

public class Calculadora {

    public static void sumayResta(int num1,/*dato añadido por mi */String simbolo, int num2) {
        //ehh cambiado la suma por un if para elegir entre suma y resta
        if(simbolo=="+"){
        int suma = num1 + num2;
        System.out.println("El total de la suma entre " + num1 + " y " + num2 + " es: " + suma);
        }else if(simbolo=="-"){
        int resta = num1 - num2;
        System.out.println("El total de la resta entre " + num1 + " y " + num2 + " es: " + resta);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introducel el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Pon simbolo suma(+) o resta(-)");
        String simbolo = sc.nextLIne();
        System.out.print("introducel el segundo numero: ");
        int num2 = sc.nextInt();

        sumayResta(num1,simbolo, num2);
    }
}
