import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Mayuscula o minuscula");
        System.out.println("Ingresa una letra");

        char letter = sc.next().charAt(0);
        
        

        if (Character.isUpperCase(letter)) {
            System.out.println("La letra es mayuscula");
        } else{
            System.out.println("La letra es minuscula");
        }


        sc.close();


    }
}
