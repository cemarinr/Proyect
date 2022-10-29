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
public final class AdapMenuNew extends AdapMenu {

    int opc;

    public static Scanner rkeyboard = new Scanner(System.in);

    public void callOptions() {
        System.out.println("Select Option\n 1. Inventory\n 2. Report\n 3. Exit");
        opc = rkeyboard.nextInt();
        if (opc == 3) {
            System.out.println("Exiting the system");
        } else {
            swTest(opc);
        }

    }

    public void testLogin() {
        TemplCredenUser oTU = new TemplCredenUser();
        TemplCredenPass oTP = new TemplCredenPass();
        oTU.ousername();
        oTU.setUser(rkeyboard.next());
        oTP.opass();
        oTP.setPassword(rkeyboard.next());
        System.out.println("Username correct?:\n" + oTU.getUser() + "\n 1=Yes 2=No");
    }

    public void switchLogin() throws InterruptedException {
        opc = rkeyboard.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Loading....");
                Thread.sleep(1000);
                System.out.println("-");
                Thread.sleep(1000);
                System.out.println("-");
                callOptions();
                break;
            case 2:
                testLogin();
                break;
            default:
                System.out.println("Option Incorrect");
                testLogin();
                ;
        }
    }

    public void swInvent() {
        System.out.println("1- Enter data");
        System.out.println("2- Delete data");
        System.out.println("3- Back");
        opc = rkeyboard.nextInt();
        switchInvent(opc);
    }

    public void swReport() {
        System.out.println("1- Show Data");
        System.out.println("2- Inventory calculation");
        System.out.println("3- Back");
        opc = rkeyboard.nextInt();
        switchReport(opc);
    }

    public void swTest(Integer opc) {
        do {
            switch (opc) {
                case 1:
                    swInvent();
                    break;
                case 2:
                    swReport();
                    break;
                case 3:
                    AdapMenuNew oBack = new AdapMenuNew();
                    oBack.callOptions();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            break;

        } while (opc > 3);
    }
    /*
     public static void switchP(Integer opc) {
     do {
     switch (opc) {
     case 1:
     System.out.println("1- Enter data");
     System.out.println("2- Delete data");
     System.out.println("3- Back");
     opc = rkeyboard.nextInt();
     switchInvent(opc);
     break;

     case 2:
     System.out.println("1- Show Data");
     System.out.println("2- Inventory calculation");
     System.out.println("3- Back");
     opc = rkeyboard.nextInt();
     switchReport(opc);
     break;

     case 3:
     AdapMenuNew oBack = new AdapMenuNew();
     oBack.callOptions();
     break;
     default:
     System.out.println("Invalid option");
     break;
     }
     break;

     } while (opc > 3);
     }
     */

    public static void switchInvent(Integer opc) {
        do {
            DeleteData oDe = new DeleteData();
            AdapMenuNew oAN = new AdapMenuNew();
            switch (opc) {
                case 1:
//Muestra del patron strategy
                    ProxyInterface Strategy;
                    String typeofmenu = "complete";

                    if (typeofmenu.equals("complete")) {
                        Strategy = new StrategyUpData1();
                        Strategy.updata();
                    } else {
                        Strategy = new StrategyUpData2();
                        Strategy.updata();
                    }

                        oAN.swInvent();
                        break;
                    
                    case 2:
                    oDe.deleteData();
                    oAN.swInvent();
                    break;
                case 3:
                    AdapMenuNew oBack = new AdapMenuNew();
                    oBack.callOptions();
                    break;
            }
            break;

            }
            while (opc != 3);
        }
        

    public static void switchReport(Integer opc) {
        AdapMenuNew oAN = new AdapMenuNew();
        do {
            ProCalcuData oCal = new ProCalcuData();
            SeeData oSeD;
            oSeD = new SeeData();
            //////

            switch (opc) {
                case 1:
                    oSeD.showList();
                  //  OutputSerializable of = new OutputSerializable();
                //   of.escribir(of.escribir(oCal));
                    oAN.swReport();
                    opc = rkeyboard.nextInt();
                    break;
                case 2:
                    oCal.calcuData();
                    oAN.swReport();
                    opc = rkeyboard.nextInt();
                    break;
                case 3:
                    AdapMenuNew oBack = new AdapMenuNew();
                    oBack.callOptions();
                    break;
            }
            break;

        } while (opc > 3);
    }
}
