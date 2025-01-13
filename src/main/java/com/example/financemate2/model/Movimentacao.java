package com.example.financemate2.model;

abstract class Movimentacao {
    String data;
    Categoria categoria;
    float valor;
    int idMov;

    public String getData() {
    return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getIdMov() {
        return idMov;
    }

    public void setIdMov(int idMov) {
        this.idMov = idMov;
    }
    
}
