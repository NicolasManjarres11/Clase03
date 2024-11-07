import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Positivo o negativo");
        int num;

        do { 
            System.out.println("\nIngresa un numero");
            num = sc.nextInt();
            if(num>0){
                System.out.printf("El numero %d es positivo\n", num);
            } else if(num<0) {
                System.out.printf("El numero %d es negativo\n", num);
            } else {
                System.out.println("\nCerrando programa");
            }

        } while (num != 0);

        sc.close();

    }
}
