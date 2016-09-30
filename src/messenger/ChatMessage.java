/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;

/**
 *
 * @author DG
 */
import java.io.*;


public class ChatMessage implements Serializable {

 

    protected static final long serialVersionUID = 1112122200L;

    static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;

    private int type;

    private String message;

    // constructor

    ChatMessage(int type, String message) {

        this.type = type;

        this.message = message;

    }

     

    // getters

    int getType() {

        return type;

    }

    String getMessage() {

        return message;

    }

}
