package com.bitacad.main;

public abstract class Item {

    private int id;
    protected boolean disponibil = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
