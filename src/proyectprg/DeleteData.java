/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectprg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author STIVEN
 */
public class DeleteData implements ProxyInterface{
        Scanner rkeyboard = new Scanner(System.in);
  public void deleteData() {
        System.out.println("Enter ID to delete:\n");
        int dDelete = rkeyboard.nextInt();
        list.remove(dDelete);
        System.out.println("Record deleted successfully");
    }

    @Override
    public void updata() {
    }

}