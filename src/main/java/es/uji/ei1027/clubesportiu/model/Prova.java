package es.uji.ei1027.clubesportiu.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prova {


    private String nom;
    private String descripcio;
    private String tipus;
    private LocalDate data;
    public Prova() {
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Prova{" +
                "nom='" + nom + '\'' +
                ", descripcio='" + descripcio + '\'' +
                ", tipus='" + tipus + '\'' +
                ", data=" + data +
                '}';
    }
}
