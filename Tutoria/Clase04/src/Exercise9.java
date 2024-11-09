import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        System.out.println("Tienda de camisas");
        System.out.println("¿Cuantas camisas deseas comprar?");
        int count = sc.nextInt();

        if(count > 1 && count < 51){
            System.out.println("El precio por unidad es de $50.000 pesos");
        } 
        else if(count > 49 && count < 101 ){
            System.out.println("El precio por unidad es de $45.000 pesos");
        }
        else if(count > 99 && count < 151 ){
            System.out.println("El precio por unidad es de $40.000 pesos");
        }
        else if(count > 149 && count < 201 ){
            System.out.println("El precio por unidad es de $35.000 pesos");
        }
        else if(count > 199 ){
            System.out.println("El precio por unidad es de $25.000 pesos");
        } else {
            System.out.println("Ingrese una cantidad validq");
        }

        sc.close();

    }
}
