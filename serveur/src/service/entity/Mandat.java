package service.entity;

import javax.persistence.*;


@Entity
@Table(name = "test.MANDAT")
public class Mandat {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numMandat;
    private boolean signature = false;

    public Mandat() {
    }


    public Mandat(boolean signature) {
        this.signature = signature;
    }

    public int getNumMandat() {
        return numMandat;
    }

    public void setNumMandat(int numMandat) {
        this.numMandat = numMandat;
    }

    public boolean isSignature() {
        return signature;
    }

    public void setSignature(boolean signature) {
        this.signature = signature;
    }

}
