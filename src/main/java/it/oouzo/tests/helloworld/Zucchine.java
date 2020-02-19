/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.oouzo.tests.helloworld;

import java.util.Objects;

/**
 *
 * @author daniele
 */
public class Zucchine {
    
    int lunghezza;
    int peso;
    int colore;
    String stato;

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getColore() {
        return colore;
    }

    public void setColore(int colore) {
        this.colore = colore;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.lunghezza;
        hash = 47 * hash + this.peso;
        hash = 47 * hash + this.colore;
        hash = 47 * hash + Objects.hashCode(this.stato);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Zucchine other = (Zucchine) obj;
        if (this.lunghezza != other.lunghezza) {
            return false;
        }
        if (this.peso != other.peso) {
            return false;
        }
        if (this.colore != other.colore) {
            return false;
        }
        if (!Objects.equals(this.stato, other.stato)) {
            return false;
        }
        return true;
    }
    
    
    
}
