package service;

import javax.ejb.*;
import javax.jms.*;

@MessageDriven(mappedName = "uneBALMonimmo")
public class MessageBean implements MessageListener {

    public MessageBean() {
    }


    public void onMessage(Message inMessage) {
        TextMessage msg = null;

        try {
            if (inMessage instanceof TextMessage) {
                msg = (TextMessage) inMessage;

                System.out.println("Publication recu : " + msg.getText());

            } else {
                System.out.println("Message of wrong type: " + inMessage.getClass().getName());
            }
        } catch (JMSException e) {
            e.printStackTrace();
        } catch (Throwable te) {
            te.printStackTrace();
        }
    }
}

