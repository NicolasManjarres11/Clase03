import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Divisible por 5 y por 7");
        System.out.println("Escriba un numero");
        int num = sc.nextInt();

        if(num%2 == 0 && num%7 == 0){  
            System.out.println("El numero es divisible por 2 y 7");
        } else{
            System.out.println("El numero no es divisible por 2 y 7");
        }

        sc.close();

    }
}
