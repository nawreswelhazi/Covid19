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
public class User {
    private int id;
    private String mail;
    private String username;
    private String session;
    private String mdp;

    public User(int id, String mail, String username, String session, String mdp) {
        this.id = id;
        this.mail = mail;
        this.username = username;
        this.session = session;
        this.mdp = mdp;
    }
    

    public int getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public String getUsername() {
        return username;
    }

    public String getSession() {
        return session;
    }

    public String getMdp() {
        return mdp;
    }
    
    
}
