/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jonathan et Niels (modification effectu�e depuis le compte de Niels)
 */
public class HelloWorldWithGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Accueil
            System.out.print("Quel est votre nom? ");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String joueur = input.readLine();
            System.out.println("Niels et Jonathan vous passe le bonjour, " + joueur + "!");
            // Petit jeu
            System.out.print("Voulez vous jouer à un jeu? (o/n) ");
            String var = input.readLine();
            if(var.toLowerCase().equals("o")){
                initJeuJustePrix();
            }
            System.out.println("Au revoir, " + joueur + "!");
            joyeuxAnniversaire();
        } catch (IOException ex) {
            Logger.getLogger(HelloWorldWithGitHub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Ligne commentaire ajoutée pour le test
    private static void joyeuxAnniversaire(){
        System.out.println("Joyeux anniversaire Kenova!");
    }

    private static void initJeuJustePrix() {
        try {
            Random randomGenerator = new Random();
            long range = (long)30000 - (long)10000 + 1;
            // compute a fraction of the range, 0 <= frac < range
            long fraction = (long)(range * randomGenerator.nextDouble());
            int randomNumber =  (int)(fraction + 10000);
            
            int nbCoups = 1, var = 0;
            System.out.print("Trouvez le juste prix (entre 10000€ et 30000€ : ");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            var = Integer.parseInt(input.readLine());
            while (randomNumber != var){
                if(randomNumber > var)
                    System.out.print("C'est plus : ");
                else
                    System.out.print("C'est moins : ");
                var = Integer.parseInt(input.readLine());
                nbCoups++;
            }
            System.out.print("Bravo! Vous avez trouvé le juste prix en "+nbCoups + " coups!\nRejouer? (o/n) ");
            String rejouer = input.readLine();
            if(rejouer.toLowerCase().equals("o"))
                initJeuJustePrix();
        } catch (IOException ex) {
            Logger.getLogger(HelloWorldWithGitHub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
