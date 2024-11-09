import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("El cubo de un numero");

        boolean isPositive = true;

        do { 
            System.out.println("Ingrese el numero para ver el cubo");
            System.out.println("(Si ingresas un numero falso, se cierra el programa)");
            double num = sc.nextInt();
            sc.nextLine();

            if(num > 0){
                double cube = Math.pow(num, 3);
                System.out.printf("El resultado es %s\n", cube);
            } else {
                System.out.println("Cerrando programa...");
                isPositive= false;
            }

        } while (isPositive);

        sc.close();
    }
}
