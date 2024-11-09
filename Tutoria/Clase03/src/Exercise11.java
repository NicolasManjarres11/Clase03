import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        
        numbers();

    }

    private static void numbers(){

        var sc = new Scanner(System.in);

        System.out.println("Numeros");
        System.out.println("Ingresa el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Ingresa el tercer numero");
        int num3 = sc.nextInt();


         if(num1 < num2 && num1 < num3 && num2 < num3){
            System.out.println(String.valueOf(num1+""+num2+""+num3));
        }else if(num2 < num1 && num2 < num3 && num3 < num1){
            System.out.println(String.valueOf(num2+""+num3+""+num1));
        }else if(num3 < num1 && num3 < num2 && num1 < num2){
            System.out.println(String.valueOf(num3+""+num1+""+num2));
        }else if(num1 < num3 && num3 < num2 && num1 < num2){
            System.out.println(String.valueOf(num1+""+num3+""+num2));
        }else if(num2 < num1 && num2 < num3 && num1 < num3){
            System.out.println(String.valueOf(num2+""+num1+""+num3));
        }else if(num3 < num1 && num2 < num1 && num1 < num2){
            System.out.println(String.valueOf(num3+""+num1+""+num2));
        }
         else {
            System.out.println(String.valueOf(num1+""+num2+""+num3));
        }

        

        sc.close();

    }
}
