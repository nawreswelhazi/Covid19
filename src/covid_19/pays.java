/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid_19;

/**
 *
 * @author asus
 */
public class pays {
    private String nom;
    private int nbCas;
    private int nbDeces;
   //date system

    public pays(String nom, int nbCas, int nbDeces) {
        this.nom = nom;
        this.nbCas = nbCas;
        this.nbDeces = nbDeces;
    }
    
    

    public String getNom() {
        return nom;
    }

    public int getNbCas() {
        return nbCas;
    }

    public int getNbDeces() {
        return nbDeces;
    }
    
}
