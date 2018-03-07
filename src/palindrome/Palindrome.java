/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author ludo
 */
public class Palindrome {

  public static void main(String[] args)
    {   //Entre le mot a tester
        Scanner sc = new Scanner(System.in);
        String mot  = sc.nextLine();
        //variable du mot case par case 
        String chaine_1 = "";
       
       //Boucle commence a la premiere lettre jusqu'a la derniere.
        for (int lettre =0;lettre < mot.length();lettre++)
        {
            
            //Regarde si le mot a des d'espace ,des virgule et des \ entre chaque lettre avec charAt
            if (mot.charAt(lettre) != ' ' && mot.charAt(lettre) != ','
                && mot.charAt(lettre) != '\'')
                {
                    chaine_1 += mot.charAt(lettre);
            //  apres chaque lettre passe a la suivante pour verifier la boucle et recréer le mot lettre par lettre(chaine_1)
                }
        }
         
   
       
         
        //comparaison des chaines de caractères le tout en minuscule le reverse met le mot a l'enver en minuscule
        //il retourne un booleen si vrai ou faux.
        if (chaine_1.toLowerCase().compareTo(new StringBuffer(chaine_1).reverse().toString().toLowerCase()) == 0)
        
            
            //Affiche la phrase si vrai ou faux
            System.out.println("Cette phrase est un palyndrome");
            else
            System.out.println("Cette phrase n'est pas un palyndrome");
    }
}
