
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        
        System.out.println("¿Cual hermano llegara tarde?");
        System.out.println("El numero 1 es para el hermano mayor");
        System.out.println("El numero 2 es para el hermano del medio");
        System.out.println("El numero 3 es para el hermano del medio");

        System.out.println("Ingresa al primer hermano que llego");

        int firstToArrive = sc.nextInt();

        System.out.println("Ingresa al primer segundo que llego");

        int secondToArrive = sc.nextInt();

        if(firstToArrive > 3 || secondToArrive > 3){
            System.out.println("Ingresa un numero valido");
        }
        else if (firstToArrive < 2 && secondToArrive < 2 ){
            System.out.println("1");
        } else if(firstToArrive != 2 && secondToArrive != 2){
            System.out.println("2");
        } else if (firstToArrive < 3 && secondToArrive < 3) {
            System.out.println("3");
        }

        sc.close();
        

    }
}
