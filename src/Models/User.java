/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author josepgrs
 */
public class User {
    private String email,nome,password;
    private int userID;

    
    public User(String email, String password,int id,String nome) {
        this.email = email;
        this.password = password;
        this.nome = nome;
        this.userID = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
   public Boolean passwordValida(String pass){
       return this.password.equals(pass);
   }
    
   
   public String getNome(){
        return this.nome;
   }
   
   public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
}
