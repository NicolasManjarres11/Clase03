import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        char player1;
        char player2;
        boolean continueGame = true;
        var sc = new Scanner(System.in);

        System.out.println("¡PIEDRA, PAPEL O TIJERA!");
        System.out.println("");
        System.out.println("Para jugar, ten en cuenta que estas son las opciones a ingresar");
        System.out.println("Ingresa P para piedra");
        System.out.println("Ingresa L para papel");
        System.out.println("Ingresa T para tijera");
        System.out.println("");

        do { 
            System.out.println("Ingresa tu jugada!!!");
            System.out.println("");
            System.out.print("Turno del jugador 1: ");
            player1 = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Turno del jugador 2: ");
            player2 = sc.next().charAt(0);
            sc.nextLine();

            if(player1 == player2 ){
                System.out.println("Es un empate");
            } else if(player1 == 'P' && player2 == 'T' || 
                    player1 == 'L' && player2 == 'P' ||
                    player1 == 'T' && player2 == 'L'){
                System.out.println("El jugador 1 gana la ronda");
            }   else {
                System.out.println("El jugador 2 gana la ronda");
            }

            System.out.println("¿Deseas volver a jugar?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            int option = sc.nextInt();
            sc.nextLine();

            if( option == 1){
                continueGame = true;
            } else{
                System.out.println("Saliendo del juego");
                continueGame = false;
                sc.close();
            }
        } while (continueGame);
    }
}
