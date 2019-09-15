package com.bitacad.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Publicatie extends Item implements Imprumutabil {

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



}
