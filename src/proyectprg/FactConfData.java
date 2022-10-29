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
 * @author STIVEN public void readDataConsole(){ Scanner keyboard=new
 * Scanner(System.in); } }
 *
 */
public class FactConfData extends FactData{
    
Scanner rkeyboard = new Scanner(System.in);

//Realizo constructor para guardar datos en el arraylist
    public FactConfData(Integer codPro, String nameProd, Integer quantity, String date) {
        this.codPro = codPro;
        this.nameProd = nameProd;
        this.quantity = quantity;
        this.date = date;
    }
    public void setcProd(Integer cProd) {
        this.cProd = cProd;
    }

    public void setCodPro(Integer codPro) {
        this.codPro = codPro;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getcProd() {
        return cProd;
    }

    public Integer getCodPro() {
        return codPro;
    }


   public String showData() {
        return "The product code is: " + codPro + "; Product name is: " + nameProd + "; Product Quantity: " + quantity + "; and Expiration date: " + date;
    }

}
