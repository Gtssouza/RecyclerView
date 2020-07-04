package com.example.recyclerview.model;

public class Filme {

    private String genero;
    private String ano;
    private String categoria;

    public Filme(){

    }

    public Filme(String genero, String ano, String categoria) {
        this.genero = genero;
        this.ano = ano;
        this.categoria = categoria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
