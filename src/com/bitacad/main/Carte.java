package com.bitacad.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Carte extends Publicatie {


    public static int TERMEN_IMPRUMUT =4;
    public static double PENALIZARE =0.5;
    protected int anPublicatie;

    public Carte(String autor, String titlu, int anPublicatie, String categorie) {
        this.autor = autor;
        this.titlu = titlu;
        this.anPublicatie = anPublicatie;
        this.categorie=categorie;

    }



    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("TERMEN_IMPRUMUT : ").append(this.TERMEN_IMPRUMUT).append("\n");
//        sb.append("PENALIZARE : ").append(this.PENALIZARE).append("\n");
//        sb.append("anPublicatie : ").append(this.anPublicatie).append("\n");
//        return sb.toString();
        /*
        String anPublicatieString = Integer.toString(anPublicatie);
        LocalDate anPublicatieFormatat = LocalDate.parse(anPublicatieString,
                DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        */
        return getId()+". " + autor + " " + titlu + " " + anPublicatie + " " + categorie ;
    }

    @Override
    public int getTermenImprumut() {
        return this.TERMEN_IMPRUMUT;
    }

    @Override
    public double getPenalizare() {
        return this.PENALIZARE;
    }

}
