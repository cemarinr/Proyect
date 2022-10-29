/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectprg;

import javax.sound.midi.Soundbank;

/**
 *
 * @author STIVEN
 */
public final class TemplCredenUser extends TemplCred{
  public void ousername(){
      System.out.println("Enter User:");
    }
   public void setUser(String user) {
        this.user = user;
    }
      public String getUser() {
        return user;
    }

   


}
