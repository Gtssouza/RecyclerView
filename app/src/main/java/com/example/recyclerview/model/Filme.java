package com.example.recyclerview.model;

public class Filme {

    private String titulo;
    private String ano;
    private String categoria;

    public Filme(){

    }

    public Filme(String titulo, String ano, String categoria) {
        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
