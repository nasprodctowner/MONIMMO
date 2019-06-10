package service.entity;

import javax.persistence.*;

@Entity
@Table(name = "test.AGENCE")
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int nom;

    public Agence() {
    }

    public Agence(int nom) {
        this.nom = nom;
    }


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
