import java.util.Scanner;

public class Exercise10{
    public static void main(String[] args) {
        
        System.out.println("¿Cuantos dias tiene un mes?");
        daysOfMonth();


    }

    private static void daysOfMonth(){

        var sc = new Scanner(System.in);

        System.out.println("Inserta el numero del mes");
        int month = sc.nextInt();

        switch (month) {
            case 1,3,5,7,8,10,12:
                System.out.println("El mes tiene 31 días");
                break;
            case 4,6,9,11:
                System.out.println("El mes tiene 30 dias");
                break;
            case 2:
                System.out.println("El mes tiene 28 dias");
                break;
            default:
                System.err.println("Opcion invalida");
        }

        sc.close();
    }



}