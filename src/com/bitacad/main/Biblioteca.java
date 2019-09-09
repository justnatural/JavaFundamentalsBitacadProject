package com.bitacad.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    int  idPublicatie = 1;
    private List<Publicatie> publicatii = new ArrayList<>();
    private List<Publicatie> publicatiiImprumutate = new ArrayList<>();
    private List<Publicatie> publicatiiDisponibile = new ArrayList<>();
    private List<Media> media  = new ArrayList<>();

    public void adaugaPublicatie(Publicatie publicatie) {
        publicatie.setId(idPublicatie++);
        this.publicatii.add(publicatie);

    }

    public void adaugaMedia(Media media) {
    }

    public void catalogPublicatii() {
        System.out.println("Catalog Publicatii: ");
        for (Publicatie publicatie: publicatii) {
            System.out.println(publicatie);
        }
    }

    public void catalogMedia() {
    }

    public void publicatiiDisponibile() {
        publicatiiDisponibile.addAll(publicatii);

        System.out.println("Publicatii disponibile: ");
        System.out.println(publicatiiDisponibile);

        for (int i =0 ; i< publicatiiDisponibile.size(); i++) {
            for  (int j =0 ; j< publicatiiImprumutate.size(); j++) {
                if (publicatiiDisponibile.get(i).getTitlu() == publicatiiImprumutate.get(j).getTitlu()) {
                    System.out.println("compar " + publicatiiDisponibile.get(i).getId()+publicatiiDisponibile.get(i).getTitlu() + " cu "+  publicatiiImprumutate.get(j).getId() + publicatiiImprumutate.get(j).getTitlu());
                    publicatiiDisponibile.remove(publicatiiDisponibile.get(i));

                }
            }

        }
        System.out.println(publicatiiDisponibile);


    }

    public void publicatiiImprumutate() {
        System.out.println("Publicatii imprumutate: ");
        for (Publicatie publicatie: publicatiiImprumutate) {
            System.out.println(publicatie);
        }

    }

    public void consultarePublicatieDupaCategorie(String categorie) {
    }

    public void consultarePublicatieDupaAutor(String autor) {
    }

    public void imprumutaPublicatie(int id, LocalDate dataImprumut) {

        for (Publicatie publicatie: publicatii) {
            if (id == publicatie.getId()) {
                try {
                    publicatie.imprumuta(dataImprumut);
                    publicatiiImprumutate.add(publicatie); // se adauga publicatia imprumutata in lista de publicatii imprumutate
                    System.out.println("Publicatia "+ id + " a fost imprumutata la data de " + dataImprumut);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
           // System.out.println(publicatie);
        }
    }

    public void returneazaPublicatie(int id, LocalDate dataRetur) {
        for (Publicatie publicatie: publicatii) {
            if (id == publicatie.getId()) {
                try {
                    publicatie.returneaza(dataRetur);
                    publicatiiImprumutate.remove(publicatie); // se scoate publicatia imprumutata din lista de publicatii imprumutate
                    System.out.println("Publicatia "+ id + " a fost returnata la data de " + dataRetur);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
            // System.out.println(publicatie);
        }
    }

    public void consultaMedia(int id) {
    }

    public void elibereazaMedia(int id) {
    }


}
