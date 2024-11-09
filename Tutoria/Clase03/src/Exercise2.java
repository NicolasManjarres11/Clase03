import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Numero mayor");

        System.out.println("Ingresa el primer numero");
        int num1 = sc.nextInt();

        System.out.println("Ingresa el segundo numero");
        int num2 = sc.nextInt();

        System.out.println("Ingresa el tercer numero");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3 ){
            System.out.printf("El primer numero es mayor: %d",num1);
        } else if(num2> num1 && num2 > num3){
            System.out.printf("El segundo numero es mayor: %d",num2);
        } else{
            System.out.printf("El tercer numero es mayor: %d", num3);
        }
        sc.close();
    }
}
