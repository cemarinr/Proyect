/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectprg;

import java.util.Scanner;
import static proyectprg.ProxyInterface.list;

/**
 *
 * @author STIVEN
 */
public class StrategyUpData2 extends FactData implements ProxyInterface  {
   

    Scanner rkeyboard = new Scanner(System.in);
    
    @Override
    public void updata() {
        System.out.println("Enter number :");
        cProd = rkeyboard.nextInt();
        for (int i = 0; i < cProd; i++) {
            System.out.println("Id of data: " + i);
            list.add(new FactConfData(rkeyboard.nextInt(), rkeyboard.next(), rkeyboard.nextInt(), rkeyboard.next()));
        }
    }
}

