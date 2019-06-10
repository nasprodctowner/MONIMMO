package service.session;
import service.entity.Mandat;
import service.entity.Vendeur;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//On choisit stateless car il y a pas d'aspect conversationnel entre le vendeur et l'agence ?
@Stateless(mappedName = "Monimmo")
public class MonimmoBean implements MonimmoItf{

    @PersistenceContext(unitName = "monimmoPU")
    private EntityManager entityManager;

    @Override
    public int engagerVente(String nom) {
        Mandat mandat = new Mandat(false);
        Vendeur vendeur = new  Vendeur(nom);

        entityManager.persist(mandat);
        entityManager.persist(vendeur);

        entityManager.flush();

        return mandat.getNumMandat();
    }

    @Override
    public void signer(int numMandat) {
        entityManager.find(Mandat.class,numMandat).setSignature(true);
    }

}
