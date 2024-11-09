import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;

        System.out.println("Serie de Fibonacci");
        System.out.println("Ingrese un número");
        int serie = sc.nextInt();
        System.out.printf("Estos son los primeros %d numeros de la serie\n", serie);
        System.out.println("0");
        System.out.println("1");

        for (int i = 0; i <= serie - 3; i++) {

            int sumaFibonacci;

            if (num1 > 1) {
                sumaFibonacci = num1 + num2;
                num2 = num1;
                num1 = sumaFibonacci;
            } else {
                sumaFibonacci = num1 + num2;
                num1 = sumaFibonacci;
            }

            System.out.println(sumaFibonacci);

        }

        /*
         * for(int i = 0; i < serie ; i++){
         * if(i == 0){
         * System.out.println("0");
         * } else if(i == 1){
         * System.out.println("1");
         * } else {
         * int fibonacci = (i-1)+(i-2);
         * System.out.println(fibonacci);
         * }
         * }
         */

        sc.close();

    }

}