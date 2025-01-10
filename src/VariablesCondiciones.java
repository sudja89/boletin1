import java.util.Scanner;

public class VariablesCondiciones {
    public static Scanner entradaEscaner = new Scanner(System.in);

    //1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.
    public static void coeficientes(double a, double b, double c) {

//        double a, b, c;
        double x1, x2, d;

        System.out.println("Introduce el coeficiente a:");
        a = Main.entradaEscaner.nextDouble();
        System.out.println("Introduce el coeficiente b:");
        b = Main.entradaEscaner.nextDouble();
        System.out.println("Introduce el coeficiente c:");
        c = Main.entradaEscaner.nextDouble();

        //calcula determinante
        d = ((b * b) - 4 * a * c);
        if (d < 0) System.out.println("No existen soluciones reales");
        else {
            // si a es un division por cero
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("solución: " + x1);
            System.out.println("solución: " + x2);
        }
    }

    // 2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
    public static void areaCirculo(double r) {
        double a;

        System.out.println("introduce el radio");
        r = Main.entradaEscaner.nextDouble();

        a = Math.PI * (r * r);

        System.out.println("El área del circulo con radio " + r + " es: " + a);
    }

    //    3. Pedir el radio de una circunferencia y calcular su longitud.
    public static double longitudCirculo(double r) {
        double l;
        System.out.print("Introduce el radio círculo: ");
        r = entradaEscaner.nextDouble();
        l = 2 * Math.PI * r;

        return l;

    }

    //    4. Pedir dos números y decir si son iguales o no.
    public static String numerosIguales(double a, double b) {
        System.out.print("Introduce número uno: ");
        a = entradaEscaner.nextDouble();
        System.out.print("Introduce número dos: ");
        b = entradaEscaner.nextDouble();

        if (a == b) return "Los números son iguales.";
        else if (a > b) return "El " + a + " es más grande que " + b;
        else return "El " + b + " es más grande que " + a;

    }

    //    5. Pedir un número e indicar si es positivo o negativo.
    public static String numerosPositivos(double a) {
        System.out.print("Introduce número: ");
        a = entradaEscaner.nextDouble();

        if (a >= 0) return "Es positivo";
        else return "Es negativo";
    }
}