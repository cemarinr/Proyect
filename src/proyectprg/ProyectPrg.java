package proyectprg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import proyectprg.AdapterMenu;
import proyectprg.AdapMenuNew;

/**
 *
 * @author STIVEN
 */
public class ProyectPrg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        //creo objeto para leer datos de usuario
        //creo objeto de la clase adaptada y de la nueva clase que se requiere adaptar
       AdapMenuNew obAdaNew = new AdapMenuNew();
        AdapMenu obAdap = new AdapterMenu();
        obAdap.callOptions();
        obAdaNew.testLogin();
        obAdaNew.switchLogin();
       
    }
}