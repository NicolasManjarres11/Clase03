import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("En que etapa de encuentas");
        System.out.println("Ingresa tu edad");
        int age = sc.nextInt();

        if(age<5){
            System.out.println("Estas en la primera infancia");
        } else if(age > 5 && age <12){
            System.out.println("Estas en la infancia");
        } else if(age > 11 && age < 19){
            System.out.println("Estas en la adolescencia");
        } else if(age > 18 && age < 27){
            System.out.println("Estas en la juventud");
        } else if( age >26 && age < 60){
            System.out.println("Estas en la adultez");
        } else {
            System.out.println("Eres una persona mayor");
        }

        sc.close();

    }
}
