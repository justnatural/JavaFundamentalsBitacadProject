package com.bitacad.main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public abstract class Publicatie extends Item implements Imprumutabil {

    protected String autor;
    protected String titlu;
    protected String categorie;
    protected LocalDate dataImprumut;
    protected LocalDate dataRetur;


    @Override
    public void imprumuta(LocalDate dataImprumut) throws Exception {
        if (disponibil==true) {
            disponibil=false;
            this.dataImprumut = dataImprumut;

        } else {
            throw new Exception("Publicatia "+ getId() +" nu se poate imprumuta pentru este deja imprumutata!");
        }
    }

    @Override
    public void returneaza(LocalDate dataRetur) throws Exception {
        if (disponibil==false) {
            disponibil=true;
            this.dataRetur = dataRetur;
            //dataImprumut+ TERMEN_IMPRUMUTsăptămâni < dataRetur
            if(ChronoUnit.DAYS.between(dataImprumut, dataRetur) > (getTermenImprumut()*7)) {
                System.out.println("Termen de returnare depășit cu "+(ChronoUnit.DAYS.between(dataImprumut, dataRetur) - (getTermenImprumut()*7))+ " zile pentru publicatia " +getId());
                //Penalizare  X  lei”în cazul în care termenul a fost depășit ;  numărul de zile după termenul de împrumut * PENALIZARE
                System.out.println("Penalizare "+ (ChronoUnit.DAYS.between(dataImprumut, dataRetur) - (getTermenImprumut()*7)) * getPenalizare() +" lei");
            }

        } else {
            throw new Exception("Nu se poate returna publicatia cu id-ul "+ getId() +" pentru ca nu a fost imprumutata!");
        }
    }

    @Override
    public double calculPenalizare(LocalDate dataRetur) {
        return 0;
    }

    public boolean isDisponibil() {
        return true;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitlu() {
        return titlu;
    }



    public String getCategorie() {
        return categorie;
    }

    protected abstract int getTermenImprumut() ;

    protected abstract double getPenalizare() ;





}
