package Pilaaleatoriaabecedario;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Alejandro Huerta González
 * Grupo: 3S11
 */
public class Pilalaeatoriaabecedario {

    public static void main(String[] args) {
        Pilalaeatoriaabecedario a = new Pilalaeatoriaabecedario();
        Scanner sc = new Scanner(System.in);
        int opt;
        do {
            System.out.println(
                    "\n1 Llenar de menera aleatoria\n"
                    + "2 Mostrar el contenido de la pila\n"
                    + "3 Eliminar\n"
                    + "4 Agregar una nueva letra\n"
                    + "5 Ordenar de manera alfabetica\n"
                    + "6 Salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    System.out.println("La pila se lleno de manera aleatoria");
                    a. llenarpila();
                    break;
                case 2:
                    System.out.println("Los datos almacenados en la pila son: ");
                    a.mostrarpila();
                   
                    break;
                case 3:
                    a.eliminar();
                    break;
                case 4:
                    System.out.println("Ingrese la letra");
                    char d = sc.next().charAt(0);
                    a.AgregarPila(d);
                    break;
                case 5:
                    a.ordenamiento();
                    break;
                
            }
        } while (opt != 6);
    }

    Scanner entrada = new Scanner(System.in);
    //DECLARAMOS EL TAMAÑO DE LA PILA
    public char pilaleatoria[] = new char[26];
   //CREAMOS LAS VARIABLES
    int tope = 0; 
    Random rnd = new Random();
    public char abecedario[] = new char[26];
    
    
   //CREAMOS EL METODO DE LLENADO DE PILA
    public void llenarpila() { 
        Random letra = new Random();
        for (int i = 0; i < 26; i++) {
            char c = (char) (letra.nextInt(26) + 'A');
            pilaleatoria[tope] = c;
            c++;
            tope++;
          
        }
       
    }
  //CREAMOS EL METODO DE MOSTRAR LOS DATOS DE LA PILA EN CUALQUIER MOMENTO
    public void mostrarpila() {
     
        for (int i = tope - 1; i >= 0; i--) {
            System.out.print(" " + pilaleatoria[i]);
        }
       
        }
    
  //METODO PARA ELIMINAR EL ULTIMO DATO INGRESADO DE LA PILA

    public void eliminar() {
        tope--;
        System.out.println("Letra eliminada");
    }
    //METODO PARA AGREGAR UN NUEVO DATO  

    public void AgregarPila(char d) {
        if (tope <= 26) {

            pilaleatoria[tope] = d; 
            tope++;
            System.out.println("Letra Agregada");

        }
        else 
            System.out.println("La Pila se encuentra llena");
        }

    //METODO PARA ORDENAR LAS LETRAS ALFABETICAMENTE        

    public void ordenamiento() {
        int i, j, apoyo;
        for (j = 0; j < pilaleatoria.length; j++) {
            for (i = j + 1; i < pilaleatoria.length; i++) {
                if (pilaleatoria[i] < pilaleatoria[j]) {
                    apoyo = pilaleatoria[i];
                    pilaleatoria[i] = pilaleatoria[j];
                    pilaleatoria[j] = (char) apoyo;
                }
            }
        }
        System.out.print("Las letras se ordenaron alfabeticamente:\n");
        for (i = 0; i < pilaleatoria.length; i++) {
            System.out.print(" "+ pilaleatoria[i] + "");
        }
    }

}
