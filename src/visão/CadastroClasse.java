/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


/**
 *
 * @author henrique matheus
 */
public class CadastroClasse {
    
    public byte[] LeerFoto(File ruta) {
        try {
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
        } catch (Exception ex) {
            return null;
        }
        return null;
    
    
    }
    
}
