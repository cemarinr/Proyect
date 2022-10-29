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
public class ProCalcuData implements ProxyInterface{
    public void calcuData(){
        System.out.println("La cantidad de registros es:");
        System.out.println(list.size());
    }

    @Override
    public void updata() {
    }
}
