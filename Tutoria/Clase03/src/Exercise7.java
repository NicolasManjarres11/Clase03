import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        //la suma de dos de sus lados debe ser mayor a la longitud del tercer lado
        //Tambien pueden medir lo mismo

        System.out.println("¿Se puede hacer un triangulo?");

        System.out.println("Ingrese la longitud del primer lado");
        int side1 = sc.nextInt();

        System.out.println("Ingrese la longitud del segundo lado");
        int side2 = sc.nextInt();

        System.out.println("Ingrese la longitud del tercer lado");
        int side3 = sc.nextInt();

        if(side1+side2 > side3 || side1+side2 == side3 ){
            System.out.println("Si se puede hacer un triangulo");
        } else{
            System.out.println("No es posible hacer un triangulo");
        }

        sc.close();

    }
}
