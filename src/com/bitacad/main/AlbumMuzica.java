package com.bitacad.main;

public class AlbumMuzica extends Media {
    protected String artist;
    protected String titlu;
    protected String gen;

    public AlbumMuzica(String suport, String artist, String titlu, String gen){
        this.artist = artist;
        this.titlu = titlu;
        this.gen = gen;
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
          return getId()+". "+getSuport()+"      " + artist + "  " + titlu  ;
      } else if (getSuport() == "HDDVD") {
          return getId() + ". " + getSuport() + "    " + artist + "  " + titlu  ;
      } else {
          return getId()+". "+getSuport()+"  " + artist + "  " + titlu  ;
      }


    }


}
