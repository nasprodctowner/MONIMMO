package service.session;
import service.entity.Mandat;
import service.entity.Vendeur;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.jms.*;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//On choisit stateless car il y a un aspect conversationnel entre le vendeur et l'agence ?
@Stateful(mappedName = "Monimmo")


public class MonimmoBean implements MonimmoItf{


    @Resource(mappedName="UneConnectionFactoryMonimmo")
    private ConnectionFactory connectionFactory;
    @Resource(mappedName="uneBALMonimmo")
    private Queue queue = null;

    private Session session = null;
    private MessageProducer messageProducer = null;
    private Connection connection = null;
    private TextMessage message = null;



    @PostConstruct
    public void onPostConstruct() {
        try {
            connection = connectionFactory.createConnection();
            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            messageProducer = session.createProducer(queue);
            message = session.createTextMessage();
        } catch (JMSException e) {
            e.printStackTrace();
        }


    }

    @PreDestroy
    public void onPreDestroy(){
        try {
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

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
        Mandat m = entityManager.find(Mandat.class,numMandat);
        m.setSignature(true);
        entityManager.flush();
        String annonce = "Annonce numéro "+m.getNumMandat();

        try {
            message.setText(annonce);
            messageProducer.send(message);
        } catch (JMSException e) {
            e.printStackTrace();
        }


    }

}
