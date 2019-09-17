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
        this.publicatiiDisponibile.add(publicatie);
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
        System.out.println("Publicatii disponibile: ");
        for (Publicatie publicatie: publicatiiDisponibile) {
            System.out.println(publicatie);
        }

    }

    public void publicatiiImprumutate() {
        System.out.println("Publicatii imprumutate: ");
        for (Publicatie publicatie: publicatiiImprumutate) {
            System.out.println(publicatie);
        }

    }

    //afișează lista tuturor publicațiilor care sunt dincategoria pasată ca parametru. Lista este precedată de eticheta „Publicatii din categoria X:”
    public void consultarePublicatieDupaCategorie(String categorie) {
        System.out.println("Publicatii din categoria: "+ categorie);
        for (Publicatie publicatie: publicatii) {
            if(publicatie.getCategorie() == categorie) {
                System.out.println(publicatie);
            }

        }

    }

    //afișează lista tuturor publicațiilor care au autorul pasat ca parametru.Lista este precedată de eticheta „Publicatii scrise de X:”
    public void consultarePublicatieDupaAutor(String autor) {
        System.out.println("Publicatii scrise de : "+ autor);
        for (Publicatie publicatie: publicatii) {
            if(publicatie.getAutor() == autor) {
                System.out.println(publicatie);
            }

        }
    }

    public void imprumutaPublicatie(int id, LocalDate dataImprumut) {
        boolean idExists = false;
        for (Publicatie publicatie: publicatii) {

            if (id == publicatie.getId() ) {
                try {
                    publicatie.imprumuta(dataImprumut);
                    publicatiiImprumutate.add(publicatie); // se adauga publicatia imprumutata in lista de publicatii imprumutate
                    publicatiiDisponibile.remove(publicatie); // se scoate publicatia imprumutata din lista de publicatii disponibile
                    System.out.println("Publicatia "+ id + " a fost imprumutata la data de " + dataImprumut);
                    idExists = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    idExists = true;
                }
            }
        }
        if (idExists == false) {
            System.out.println("Publicatia " + id + " nu se poate imprumuta pentru ca nu a fost gasita in evidentele bibliotecii");
        }

    }

    public void returneazaPublicatie(int id, LocalDate dataRetur) {
        boolean idExists = false;
        for (Publicatie publicatie: publicatii) {
            if (id == publicatie.getId()) {
                try {
                    publicatie.returneaza(dataRetur);
                    publicatiiImprumutate.remove(publicatie); // se scoate publicatia imprumutata din lista de publicatii imprumutate
                    System.out.println("Publicatia "+ id + " a fost returnata la data de " + dataRetur);
                    idExists = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    idExists = true;
                }
            }
        }
        if (idExists == false) {
            System.out.println("Publicatia " + id + " nu se poate returna pentru ca nu a fost gasita in evidentele bibliotecii");
        }
    }

    public void consultaMedia(int id) {
    }

    public void elibereazaMedia(int id) {
    }


}
