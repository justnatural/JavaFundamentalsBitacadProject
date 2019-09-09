package com.bitacad.main;

public class AlbumMuzica extends Media {
    protected String artist;
    protected String titlu;
    protected String gen;

    public AlbumMuzica(String suport, String artist, String titlu, String gen){}

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("artist : ").append(this.artist).append("\n");
        sb.append("titlu : ").append(this.titlu).append("\n");
        sb.append("gen : ").append(this.gen).append("\n");
        return sb.toString();
    }


}
