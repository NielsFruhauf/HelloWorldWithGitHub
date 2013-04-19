/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldwithgithub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonathan et Niels depuis le compte de Niels
 */

// Classe HelloWorldWithGitHub
public class HelloWorldWithGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.print("Quel est votre nom? ");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String var = input.readLine();
            System.out.println("Bonjour " + var + "!");
        } catch (IOException ex) {
            Logger.getLogger(HelloWorldWithGitHub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
