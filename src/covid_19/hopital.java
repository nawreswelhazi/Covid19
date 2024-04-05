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
public class hopital {
    private String nom;
    private String gouvernorat;
    private int litDispo;
    private int casHospitalise;
    private String besoin;
    private int nbTest;

    public hopital(String nom, String gouvernorat, int litDispo, int casHospitalise, String besoin, int nbTest) {
        this.nom = nom;
        this.gouvernorat = gouvernorat;
        this.litDispo = litDispo;
        this.casHospitalise = casHospitalise;
        this.besoin = besoin;
        this.nbTest = nbTest;
    }

    public String getNom() {
        return nom;
    }

    public String getGouvernorat() {
        return gouvernorat;
    }

    public int getLitDispo() {
        return litDispo;
    }

    public int getCasHospitalise() {
        return casHospitalise;
    }

    public String getBesoin() {
        return besoin;
    }

    public int getNbTest() {
        return nbTest;
    }
    
    
    
    
}
