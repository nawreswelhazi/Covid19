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
public class Gouvernorat {
    private String nom;
    private int nbCas;
    private int nbCasVieux;
    private int nbCasAdultes;
    private int nbCasjeunes;
    private int nbCasFemmes;
    private int nbCasHommes;
     private int nbdecesVieux;
    private int nbdecesAdultes;
    private int nbdecesjeunes;
    private int nbdecesFemmes;
    private int nbdecesHommes; 
    //ye jme3a date 7otouha fel base bel Sysdate ma3ana menzamrou biha houni

    public Gouvernorat(String nom, int nbCas, int nbCasVieux, int nbCasAdultes, int nbCasjeunes, int nbCasFemmes, int nbCasHommes, int nbdecesVieux, int nbdecesAdultes, int nbdecesjeunes, int nbdecesFemmes, int nbdecesHommes) {
        this.nom = nom;
        this.nbCas = nbCas;
        this.nbCasVieux = nbCasVieux;
        this.nbCasAdultes = nbCasAdultes;
        this.nbCasjeunes = nbCasjeunes;
        this.nbCasFemmes = nbCasFemmes;
        this.nbCasHommes = nbCasHommes;
        this.nbdecesVieux = nbdecesVieux;
        this.nbdecesAdultes = nbdecesAdultes;
        this.nbdecesjeunes = nbdecesjeunes;
        this.nbdecesFemmes = nbdecesFemmes;
        this.nbdecesHommes = nbdecesHommes;
    }
    
    

    public String getNom() {
        return nom;
    }

    public int getNbCas() {
        return nbCas;
    }

    public int getNbCasVieux() {
        return nbCasVieux;
    }

    public int getNbCasAdultes() {
        return nbCasAdultes;
    }

    public int getNbCasjeunes() {
        return nbCasjeunes;
    }

    public int getNbCasFemmes() {
        return nbCasFemmes;
    }

    public int getNbCasHommes() {
        return nbCasHommes;
    }

    public int getNbdecesVieux() {
        return nbdecesVieux;
    }

    public int getNbdecesAdultes() {
        return nbdecesAdultes;
    }

    public int getNbdecesjeunes() {
        return nbdecesjeunes;
    }

    public int getNbdecesFemmes() {
        return nbdecesFemmes;
    }

    public int getNbdecesHommes() {
        return nbdecesHommes;
    }
    
    
    
}
