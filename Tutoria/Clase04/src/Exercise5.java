import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);

        String vocal = "aeiou";
        System.out.println(vocal.length());

        System.out.println("Vocal o consonante");
        System.out.println("Ingresa una letra");

        char letter = sc.next().toLowerCase().charAt(0);

        for (int i = 0; i < vocal.length(); i++) {
            if (letter == vocal.charAt(i)) {
                System.out.println("Es una vocal");
            } else if(vocal.charAt(i) == 'u' && letter != vocal.charAt(i)){
                System.out.println("Es una consonante");
            }
        }

        sc.close();
    }
}
