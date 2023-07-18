package org.java.lessons.geometria;
//una classe Rettangolo con due attributi interi: base e altezza. Aggiungere un opportuno costruttore con parametri.
// Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, l’area e il
// perimetro del rettangolo.
public class Rettangolo {
    //CAMPI base e altezza
    int base;
    int height;



    //COSTRUTTORI con parametri
    Rettangolo (int base, int height){
        this.base = base;
        this.height = height;
    }

    //METODI = Calcola area e Calcola perimetro
    int getArea(){
        //calcoliamo l'area del rettangolo
            //dichiariamo variabili per base e altezza
            int baseArea = base;
            int heightArea = height;

            //calcolo l'area
            int areaRet= baseArea * heightArea;
        return areaRet;
    }
    int getPerimetro (){
        int basePerimetro=base;
        int heightPerimetro = height;

        //calcolo il perimetro
        int perimetroRet = (2 * basePerimetro) + (2 * heightPerimetro);
        return perimetroRet;
    }



}
