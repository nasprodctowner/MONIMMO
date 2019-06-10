import importservice.AddPojo;
import importservice.AddPojoService;
import service.session.MonimmoItf;

import javax.jms.*;
import javax.naming.InitialContext;
import java.util.Scanner;

public class Client {

    private static MonimmoItf monimmoItf ;
    static AddPojoService service;

    public static void main(String[] args) {


        try {

            InitialContext ctx = new InitialContext();
            monimmoItf = (MonimmoItf) ctx.lookup("Monimmo");
        } catch (Exception ex) {
            System.err.println("erreur dans le lookup");
            ex.printStackTrace();
        }

            Scanner scanner = new Scanner(System.in);

            System.out.println("Quel est votre nom ? ");
            String s2 = scanner.nextLine();

            System.out.println("Bonjour "+s2);

            System.out.println("votre numéro de mandat est : "+monimmoItf.engagerVente(s2));


            System.out.println("Si vous souhaitez signer, entrez le numéro de votre mandat ");
            int s3 = scanner.nextInt();

            monimmoItf.signer(s3);

            // pour la derniere question j'ai fait ça avec le webservice soap additionneur, il suffit de remplacer par le ws de l'exam
            //premiere étape :  cd src et wsimport -d ../build -s . "http://localhost:8080/PublieurBeanService/PublieurBean?wsdl" -p importservice
            // on chope le lien dans la balise location du wsdl et on rajoute ?wsdl

            //deuxieme étape :
            service = new AddPojoService();
            // service = new PublieurBeanService
            System.out.println("Retrieving the port from the following service: "+ service);

            //troisieme étape :
            AddPojo port = service.getAddPojoPort();
            // PublieurBean port = service.getPublieurBeanPort
            System.out.println("Invoking the echo operation on the port.");

            //quatrieme étape : invocation
            System.out.println("ws : "+port.addTwo(1,1));
            //et donc : port.publier(annonce) => car elle prend un argument String




    }
}
