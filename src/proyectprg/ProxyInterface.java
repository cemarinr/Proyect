/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectprg;

import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author STIVEN
 */
public interface ProxyInterface extends Serializable {

    public ArrayList<FactConfData> list = new ArrayList<FactConfData>();

    void updata();
}
