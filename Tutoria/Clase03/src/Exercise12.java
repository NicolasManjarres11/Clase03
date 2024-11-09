import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        
        watermelon();

    }

    private static void watermelon(){

        var sc= new Scanner(System.in);

        System.out.println("¿Se podra dividir el peso en numeros pares?");
        System.out.println("Ingresa el peso de la sandia: ");
        int weight = sc.nextInt();

        if(weight % 2 == 0){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        sc.close();

    }
}
