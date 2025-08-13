
import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero1, numero2;
        System.out.println("Ingrese el primer numero: ");
        numero1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese el segundo numero: ");
        numero2 = entrada.nextDouble();
        entrada.nextLine();

        double suma, resta, multiplicacion, modulo, division;
        suma = sumar(numero1, numero2);
        resta = restar (numero1, numero2);
        multiplicacion = multiplicar(numero1, numero2); 
        modulo = modulo(numero1, numero2);
        division = division(numero1, numero2);

         System.out.println("El resultado de la suma es:" + suma);
         System.out.println("El resultado de la resta es:" + resta);
         System.out.println("El resultado de la multiplicacion es:" + multiplicacion);
         System.out.println("El resultado del modulo es:" + modulo);
         System.out.println("El resultado de la division es:" + division);

    }

    public static double sumar(double a, double b) {
        double suma = a + b;
        return suma;
    }

    public static double restar(double a, double b) {
        double resta = a - b;
        return resta;
    }

    public static double multiplicar(double a, double b) {
        double multiplicacion = a * b;
        return multiplicacion;
    }

    public static double modulo(double a, double b) {
        double modulo = a % b;
        return modulo;
    }

    public static double division(double a, double b) {
        double division = a / b;
        return division;
    }

}