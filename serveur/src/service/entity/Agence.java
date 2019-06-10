package service.entity;

import javax.persistence.*;

@Entity
@Table(name = "test.AGENCE")
public class Agence {


    private int id;
    private int nom;

    public Agence() {
    }

    public Agence(int nom) {
        this.nom = nom;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }
}
