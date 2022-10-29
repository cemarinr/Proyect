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
public abstract class FactData {
    public Integer cProd;
    public Integer codPro;
    public String nameProd;
    public Integer quantity;
    public String date;
    
     public String showData() {
        return "Th: " + codPro + " name es: " + nameProd + " cantida: " + quantity + " y fecha: " + date;
    }
    
}
 
