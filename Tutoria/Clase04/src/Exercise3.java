import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);


        System.out.println("Par o impar");
        System.out.println("ingresa el numero a comprobar");

        //Solicitud del numero

        int num = sc.nextInt();

        //Comprobación de si es par o impar

        if (num%2 == 0) {
            System.out.printf("%d es un numero par", num);
        } else{
            System.out.printf("%d es un numero impar", num);

        sc.close();
        }

    }
}
