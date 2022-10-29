/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectprg;

/**
 *
 * @author STIVEN
 */
public final class TemplCredenPass extends TemplCred{
public void opass(){
      System.out.println("Enter Password:");
    }

    public void setPassword(String password) {
        this.password = password;
    }

  public String getPassword() {
        return password;
    }

}
