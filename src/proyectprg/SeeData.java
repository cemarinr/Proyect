/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectprg;

import java.util.Scanner;


/**
 *
 * @author STIVEN
 */
public class SeeData implements ProxyInterface {
        Scanner rkeyboard = new Scanner(System.in);
       public void showList() {
        for (FactConfData e : list) {
            System.out.println(e.showData());
        }
       
    }

    @Override
    public void updata() {
    }
}