package org.java.lessons.geometria;

import java.util.Scanner;

//Creare una classe Main contenente il metodo main(), nel quale chiedete all’utente di inserire, da console,
// i valori di base e di altezza con cui istanziare un nuovo Rettangolo. Dopo averlo istanziato, stampate a video
// il perimetro e l’area.
public class Main {
    public static void main(String[] args) {
        //Inizializzamo lo scanner
        Scanner scan = new Scanner (System.in);

        //Chiediamo i valori all'utente
        System.out.print("Benvenuto! Per primo inserisca la base del suo rettangolo: ");
        int baseInput = Integer.parseInt(scan.nextLine());

        System.out.println("Inserisca anche l'altezza del suo rettangolo!");
        int heightInput = Integer.parseInt(scan.nextLine());

        //Creo un nuovo oggeto Rettangolo
        Rettangolo rettangoloUno = new Rettangolo(baseInput, heightInput);


        //Chiedo di calcolare l'area
        System.out.println("Area del rettangolo: " + rettangoloUno.getArea());

        //Chiedo di calcolare il perimetro
        System.out.println("Perimetro del rettangolo: " + rettangoloUno.getPerimetro());

        //Chiudo lo scan
        scan.close();


    }
}
