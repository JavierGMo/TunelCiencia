package com.morajavier.tunelraza;

public class Descripciones {
    private int idImage;
    private String descripcion;


    Descripciones(int idImage, String descripcion){
        this.idImage = idImage;
        this.descripcion = descripcion;
    }
    public int getImage(){
        return this.idImage;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public int getPosition(){
        return this.idImage;
    }
}
