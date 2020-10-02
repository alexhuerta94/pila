package sumadepilas;
//Alejandro Huerta Gonzalez
//Grupo 3S11
import java.util.Random;
import java.util.Scanner;
//para crear aleatorio int aleatorio = (int) (Math.random()*20)+1;
// numeros aleatorios Random rnd = new Random();aleatorios 10 a 20 (rnd.nextInt(20-10+1)+10); 
public class Sumadepilas {

    Scanner sc = new Scanner(System.in);
    public static int tope;
    // se crean las variables dek tamaño y las pilas
    Random rnd = new Random();
    public int tamaño = sc.nextInt();
    public int pilaA[] = new int[tamaño];
    public int pilaB[] = new int[tamaño];
    public int pilaC[] = new int[tamaño];

    // creamos el metodo de llenar las pilas A y B  
    // en la primer pila generara numeros aleatorios entre 1 y 100
    public void llenar() {
            for (int a = 0; a < tamaño; a++) {
                pilaA[a] = (rnd.nextInt(100) + 1);
                tope++;
                // en la segunda nos generara numeros entre 100 y 200
                for (int b = 0; b < tamaño; b++) {
                    pilaB[b] = (rnd.nextInt(200 - 100 + 1) + 100);
                    tope++;
                }
            }
        }
    
    //creamos el metodo que mostrara los numeros generados en las pilas A y B

    public void mostrar() {
        if (tope > 0) {
            System.out.print("La pila A contiene los valores: \n");
            for (int a = 0; a < tamaño; a++) {
                System.out.print(pilaA[a] + " ");
            }
            System.out.print("\nLa pila B contiene los valores: \n");
            for (int b = 0; b < tamaño; b++) {
                System.out.print(pilaB[b] + " ");
            }
        } else {
            System.out.println("Pilas Vacias, llene las pilas");
        }
    }
    //Creamos el metodo que sumara los valores de A y B en la pila C

    public void unirenc() {
        if (tope > 0) {
            for (int a = 0; a < tamaño; a++) {
                pilaC[a] = pilaA[a] + pilaB[a];
                tope++;
            }
            System.out.println("Se han unido satisfactoriamente las pilas A y B");
        } else {
            System.out.println("No se encontraron valores por unir, primero llene las pilas");
        }
    }
    //metodo que nos mostrara la suma de A y B

    public void mostrarc() {
        if (tope > 0) {
            for (int j = 0; j < tamaño; j++) {
                System.out.println("La suma de las pilas A y B es:" + pilaC[j] + "");
            }
        } else {
            System.out.println("No hay valores por mostrar, llena las pilas A y B");
        }
    }
    //metodo que borrara los datos en las pilas A,B y C

    public void vaciarpilas() {
        if (tope > 0) {
            for (int a = 0; a < tamaño; a--) {
                tope--;
            }
            for (int b = 0; b < tamaño; b++) {
                tope--;
            }
            for (int j = 0; j < tamaño; j++) {
                tope--;
            }
            System.out.println("Las pilas se han vaciado");
        } else {
            System.out.println("No hay datos por vaciar las pilas ya se encuentran sin datos");
        }
    }

    public static void main(String[] args) {
        //Solicitamos el valor de las pilas A y B (sera el mismo)
        System.out.println("Ingresa el tamaño de la pilas A y B");
        Scanner sc = new Scanner(System.in);
        //Creamos la variable para llamar a los metodos y creamos la variable para las opciones
        //del menu
        Sumadepilas tam = new Sumadepilas();
        int opc;
        //creamos el menu desde el cual llamaremos a los metodos
        do {
            System.out.print("\n"
                    + "\n 1-Llenar las pilas A y B."
                    + "\n 2-Mostrar valores de las pilas A y B."
                    + "\n 3-Unir las pilas en C."
                    + "\n 4-Mostrar la pila C."
                    + "\n 5-Vaciar las pilas."
                    + "\n 6-Salir.\n");
            switch (opc = sc.nextInt()) {
                //llamamos a los metodos para cada caso del menu     
                case 1:
                    tam.llenar();
                    System.out.print("Las pilas se han llenado de manera exitosa");
                    break;
                case 2:
                    tam.mostrar();
                    break;
                case 3:
                    tam.unirenc();
                    break;
                case 4:
                    tam.mostrarc();
                    break;
                case 5:
                    tam.vaciarpilas();
                    break;
            }
        } while (opc != 6);
    }
}
