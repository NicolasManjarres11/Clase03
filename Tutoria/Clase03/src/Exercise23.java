import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Inserte el numero de diamantes (Debe ser un numero impar entero positivo)");
        int sizeOption = sc.nextInt();
        sc.nextLine();

        if( sizeOption%2 == 0){

            System.out.println("Debe ser un numero impar, no par.");

        } else if (sizeOption <= 0){

            System.out.println("Debe ser un numero mayor a 0");

        } else {

            int half = sizeOption/2;

            for (int i = 0; i <= half; i++) {
                for (int j = 0; j < half - i; j++) {
                    System.out.print(" ");
                }
                 for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println(); 
            }

            for(int i = half - 1; i>=0;i--){
                for (int j = 0; j < half - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        sc.close();

    }
}





/*             for(int i = half - 1; i>=0;i--){
                for (int j = 0; j < half - 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            } */
