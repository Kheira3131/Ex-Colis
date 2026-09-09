/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex.colis;

/**
 *
 * @author Kheira
 */
public class Adresse {
    private String voie;
    private String codepostal;
    private String ville;
    private String pays;
    
    public Adresse(String voie, String codepostal, String ville, String pays){
        this.voie = voie;
        this.codepostal = codepostal;
        this.ville = ville;
        this.pays = pays;
   }

    public boolean estenFrance() {
        if  (this.pays.equals("France")) {
            return true;
        } else {
                return false;
            }
}    
}


