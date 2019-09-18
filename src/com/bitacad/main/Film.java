package com.bitacad.main;

public class Film extends Media {

    protected String titlu;
    protected int an;
    protected String gen;
    protected String regizor;

    public Film(String suport, String titlu, int an, String gen, String regizor) {
        this.titlu = titlu;
        this.an = an;
        this.gen = gen;
        this.regizor = regizor;
        setSuport(suport);

    }

    @Override
    public String toString(){
      /*
        StringBuilder sb = new StringBuilder();
        sb.append("artist : ").append(this.artist).append("\n");
        sb.append("titlu : ").append(this.titlu).append("\n");
        sb.append("gen : ").append(this.gen).append("\n");
        return sb.toString();
        */
      if (getSuport() == "DVD") {
          return getId()+". " +getSuport()+"      "+ titlu +"  "+ an + "  " + gen + "  " + regizor ;
      } else if (getSuport() == "HDDVD"){
          return getId()+". " +getSuport()+"    "+ titlu +"  "+ an + "  " + gen + "  " + regizor ;
      } else {
          return getId()+". " +getSuport()+"  "+ titlu +"  "+ an + "  " + gen + "  " + regizor ;
      }

    }


    @Override
    public void consulta() {

    }

    @Override
    public void elibereaza() {

    }
}
