/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex.colis;

import java.util.ArrayList;

/**
 *
 * @author Kheira
 */
public class Pointdelivraison {
    private String nom;
    private ArrayList<Colis> listecolis;
    private Adresse adresse;
    
    public Pointdelivraison(String nom, Adresse adresse){
        this.nom = nom;
       this.listecolis = new ArrayList<Colis>();
        this.adresse = adresse;
}
public void ajoutercolis(Colis colis){ 
    listecolis.add(colis);
    
    
}}
