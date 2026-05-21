import java.util.Scanner;

public class Practica {

    public static void mstrTemp(double[] temps) {
        System.out.println("\n--- Temperaturas registradas ---");
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Días " + (i + 1) + ": " + temps[i] + " °C");
        }
    }

    public static double calcProm(double[] temps) {
        double suma = 0;
        for (int i = 0; i < temps.length; i++) {
            suma += temps[i];
        }
        return suma / temps.length;
    }

    public static double tempMax(double[] temps) {
        double max = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > max) {
                max = temps[i];
            }
        }
        return max;
    }

    public static double tempMin(double[] temps) {
        double min = temps[0];
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < min) {
                min = temps[i];
            }
        }
        return min;
    }

    public static int contCalurosos(double[] temps) {
        int contador = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] >= 30) {
                contador++;
            }
        }
        return contador;
    }

    public static int contFrios(double[] temps) {
        int frios = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] < 27) {
                frios++;
            }
        }
        return frios;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[7];

        System.out.println("Ingrese las temperaturas de los 7 días:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }
        sc.close();

        mstrTemp(temperaturas);

        System.out.println("\nPromedio: " + calcProm(temperaturas) + " °C");
        System.out.println("Temperatura más alta: " + tempMax(temperaturas) + " °C");
        System.out.println("Temperatura más baja: " + tempMin(temperaturas) + " °C");
        System.out.println("Días calurosos (por encima de los 30°C o igual): " + contCalurosos(temperaturas)+" días");
        System.out.println("Días fríos (por debajo de los 27°C): " + contFrios(temperaturas)+" días");
    }
}