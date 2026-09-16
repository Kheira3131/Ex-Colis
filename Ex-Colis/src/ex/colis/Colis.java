/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex.colis;

/**
 *
 * @author Kheira
 */
public class Colis {
    private float poids;
    private String nom;
    private Adresse adresse;
    private Pointdelivraison pointdelivraison;
            
      public Colis (float poids,String nom,Adresse adresse, Pointdelivraison pointdelivraison){
      this.poids = poids;
      this.nom = nom;
      this.adresse = adresse;
      this.pointdelivraison = pointdelivraison;
      this.pointdelivraison.ajoutercolis(this);
      }
      public float caculprix(){
        float prix = 0;
          if (poids < 50){
                prix = 1.99f;
          }
          else if (poids < 2000){
                prix=3.99f;
          }
          else if (poids <5000){
                prix=5.99f;
          }
          else{
                 prix=8.99f;
          }
            
        if (!adresse.estenFrance()){
            prix=prix+6;
        }
        return prix;
      
              
      
              
            
    
            
            
    
}
