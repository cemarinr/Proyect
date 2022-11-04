/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectprg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author STIVEN
 */
public class StrategyUpData1 extends FactData implements ProxyInterface {

    
    Scanner rkeyboard = new Scanner(System.in);

    @Override
    public void updata() {
        System.out.println("Enter number of producer types to upload:");
        cProd = rkeyboard.nextInt();
        for (int i = 0; i < cProd; i++) {
            System.out.println("Data structure for upload:\n"
                    + "1 Product Code\n"
                    + "2 Product Name\n"
                    + "3 Quantity of product\n"
                    + "4 Expiration date");
            System.out.println("Id of data: " + i);
            list.add(new FactConfData(rkeyboard.nextInt(), rkeyboard.next(), rkeyboard.nextInt(), rkeyboard.next()));
        }
        System.out.println("Successful data upload");
    }
}
