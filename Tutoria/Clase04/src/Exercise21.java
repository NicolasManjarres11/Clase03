import java.util.Scanner;

public class Exercise21 {
    
    public static void main(String[] args) {
        //1 mila = 1.60934 km
        //1 km = 0.621371 millas

        int option;

        do{
            var sc = new Scanner(System.in);

            System.out.println("\nConversor de millas y kilometros");
            System.out.println("");
            System.out.println("1. Convertir de millas a kilometros");
            System.out.println("2. Convertir de kilomtetros a millas");
            System.out.println("3. salir del programa");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Ingrese las millas a convertir");
                    float miles = sc.nextFloat();
                    float milesToKm = miles * 1.60934f;
                    System.out.printf(miles + " millas equivale a %.5f kilometros.\n",milesToKm);
                    break;
                case 2:
                    System.out.println("Ingrese los kilometros a convertir");
                    float km = sc.nextFloat();
                    float kmToMiles = km / 1.60934f;
                    System.out.printf(km +" kilometros equivale a %.5f millas.\n",kmToMiles);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    sc.close();
                    break;
                default:
                    System.err.println("Opcion invalida");
                    break;
            }
        } while(option != 3);
    }

}
