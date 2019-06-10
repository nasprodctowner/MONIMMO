package service.entity;

import javax.persistence.*;

@Entity
@Table(name = "test.Vendeur")
public class Vendeur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;


    public Vendeur() {
    }

    public Vendeur(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



}
