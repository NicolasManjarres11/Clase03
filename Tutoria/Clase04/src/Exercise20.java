public class Exercise20 {

    public static void main(String[] args) {


        int filas = 8;
        int columnas = 8;

        for(int i=0;i<filas;i++){
            for(int j = 0; j<columnas;j++){
                if((i+j)%2 == 0 && j < columnas){

                    //Cuando el iterativo de la fila es par y lo sumamos con una columna par, imprimira B
                    //De lo contrario, imprimirá N

                    System.out.print("| B ");
                } else{
                    System.out.print("| N ");
                }
                
            } 
            System.out.println("|");
        }




/*         for (int i = 0; i<4;i++){
            System.out.println("| B | N | B | N | B | N | B |");
            System.out.println("| N | B | N | B | N | B | N |");
        } */
/*         System.out.println("| B | N | B | N | B | N | B |");
        System.out.println("| N | B | N | B | N | B | N |"); */


    }

}
