/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.colis;

/**
 *
 * @author Kheira
 */
public class ExColis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adresse adresse1 = new Adresse ("31","31100"," Toulouse", "France");
        System.out.println(adresse1.estenFrance());
        
        Adresse adresse2 = new Adresse ("31", "21", "Alger", "Algerie");
        System.out.println(adresse2.estenFrance());
    }
}
