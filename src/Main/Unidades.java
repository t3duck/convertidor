package Main;
import  java.util.Scanner;
public class Unidades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        double valor;

        System.out.println("Ingrese una opcion: ");
        System.out.println("1. Convertir pulgadas a centimetros");
        System.out.println("2. Convertir pies a metros");
        System.out.println("3. Convertir millas a kilometros");
        System.out.println("4. Convertir libras a kilogramos");
        System.out.println("5. Convertir galones a litros");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el valor en pulgadas: ");
                valor = sc.nextDouble();
                System.out.println(valor + " pulgadas son " + (valor * 2.54) + " centimetros.");
                break;
            case 2:
                System.out.print("Ingrese el valor en pies: ");
                valor = sc.nextDouble();
                System.out.println(valor + " pies son " + (valor * 0.3048) + " metros.");
                break;
            case 3:
                System.out.print("Ingrese el valor en millas: ");
                valor = sc.nextDouble();
                System.out.println(valor + " kilometros son " + (valor * 1.60934) + " kilometros.");
                break;
            case 4:
                System.out.print("Ingrese el valor en libras: ");
                valor = sc.nextDouble();
                System.out.println(valor + " libras son " + (valor * 0.453592) + " kilogramos.");
                break;
            case 5:
                System.out.print("Ingrese el valor en galones: ");
                valor = sc.nextDouble();
                System.out.println(valor + " galones son " + (valor * 3.78541) + " litros.");
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }

        sc.close();
    }
}