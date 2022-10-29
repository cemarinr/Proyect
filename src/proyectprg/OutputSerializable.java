/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectprg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author STIVEN
 */
public class OutputSerializable implements ProxyInterface {

    FileOutputStream file;
    ObjectOutputStream fileOuput;

    public void abrir() throws IOException {
        file = new FileOutputStream("clientes.ser");
        fileOuput = new ObjectOutputStream(file);
    }

    public void escribir(ProxyInterface contacto)
            throws IOException {
        if (fileOuput != null) {
            fileOuput.writeObject(ProxyInterface.list);
        }
    }

    @Override
    public void updata() {
          }

    void escribir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


