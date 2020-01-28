package com.example.recicleview.model;

public class Filme {

    private String tituloFilme;
    private String genero;
    private String ano;

    public Filme(){
    }

    public Filme(String tituloFilme, String genero, String ano) {
        this.tituloFilme = tituloFilme;
        this.genero = genero;
        this.ano = ano;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public String getGenero() {
        return genero;
    }

    public String getAno() {
        return ano;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
