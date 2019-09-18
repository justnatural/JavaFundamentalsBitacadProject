package com.bitacad.main;

public abstract class Media extends Item implements Consultabil {


    protected String suport;


    public String getSuport() {
        return suport;
    }

    public void setSuport(String suport) {
        this.suport = suport;
    }

    public String getSuportFormatat() {
        return suport + "     ";
    }

    //marchează elementul ca fiind indisponibil. În cazul în care este  deja indisponibil nu se întâmplă nimic.
    @Override
    public void consulta() {
        if (disponibil == true) {
            disponibil = false;
        }
    }

    @Override
    public void elibereaza() {
        if (disponibil == false) {
            disponibil = true;
        }
    }


}
