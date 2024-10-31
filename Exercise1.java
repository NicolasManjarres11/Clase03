import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Ingresa un número real");
        int num = sc.nextInt();

        if(num>0){
            System.out.printf("El numero %d es un numero positivo", num);
        }
        else if(num<0){
            System.out.printf("El numero %d es un numero negativo", num);
        } 
        else{
            System.out.println("El numero ingresado es un 0");
        }

        sc.close();

    }
}