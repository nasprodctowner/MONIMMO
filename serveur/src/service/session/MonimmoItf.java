package service.session;

import javax.ejb.Remote;

@Remote
public interface MonimmoItf {

    public int engagerVente(String nom);
    public void signer(int numMandat);
}
