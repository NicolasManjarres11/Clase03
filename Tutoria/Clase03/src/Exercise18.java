
import java.util.Random;

public class Exercise18 {

    public static void main(String[] args) {
        Random random = new Random();

        int positiveNumbers = 0;
        int positiveCounter = 0;
        int negativeNumber = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        for (int i = 0; i < 121; i++) {
            int num = random.nextInt(-100, 100);
            if (num > 0) {
                positiveNumbers += num;
                positiveCounter++;
            } else if (num < 0) {
                negativeNumber += num;
                negativeCounter++;
            } else {
                zeroCounter++;
            }

            if (i == 120) {
                System.out.println("Suma de positivos: " + positiveNumbers);
                System.out.println("Media de positivos: " + (positiveNumbers / positiveCounter));
                System.out.println("");
                System.out.println("Suma de Negativos: " + negativeNumber);
                System.out.println("Media de positivos: " + (negativeNumber / negativeCounter));
                System.out.println("");
                System.out.println("Cantidad de ceros: " + zeroCounter);
            }
        }

    }
}
