package com.bitacad.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Articol extends Publicatie {
    public static int TERMEN_IMPRUMUT =2;
    public static double PENALIZARE =0.1;
    protected String publicatie;
    protected LocalDate dataPublicatiei;

    public Articol(String autor, String titlu, String categorie, String publicatie, LocalDate dataPublicatiei) {
        this.autor = autor;
        this.titlu =titlu;
        this.categorie=categorie;
        this.publicatie=publicatie;
        this.dataPublicatiei=dataPublicatiei;
    }

    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("TERMEN_IMPRUMUT : ").append(this.TERMEN_IMPRUMUT).append("\n");
//        sb.append("PENALIZARE : ").append(this.PENALIZARE).append("\n");
//        sb.append("publicatie : ").append(this.publicatie).append("\n");
//        sb.append("dataPublicatiei : ").append(this.dataPublicatiei).append("\n");
//        return sb.toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        String dataPublicatieiFormatata = formatter.format(dataPublicatiei);


        return getId()+". " + autor + " " + titlu +  " " + publicatie + " " + dataPublicatieiFormatata  ;
    }
}
