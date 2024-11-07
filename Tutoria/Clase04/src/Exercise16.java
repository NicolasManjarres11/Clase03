import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        int count = 0;
        boolean isNegative = true;

        System.out.println("Contador de numeros negativos");

        do { 

            System.out.println("Ingresa un numero negativo");   
            int num = sc.nextInt();

            if(num<0){
                count++;
            }else{
                System.out.println("Cerrando programa...");
                System.out.println("La cantidad de numeros negativos ingresados es de "+count);
                isNegative = false;
            }
        } while (isNegative);

        sc.close();
    }
}
