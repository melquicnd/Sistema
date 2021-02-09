/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author henrique matheus
 */


public class Lanches {
    private String Nome;
    private String Descriçao;
    private String valor;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescriçao() {
        return Descriçao;
    }

    public void setDescriçao(String Descriçao) {
        this.Descriçao = Descriçao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    /**
     *
     * @return
     */
    public String sauvar(){
                try {   
            FileWriter fw = new FileWriter("lanches.txt",true); //o true seve para as infomações não apague ao adicionar outras 
            PrintWriter pw = new PrintWriter(fw);
            pw.println(this.Nome +","); //Nome
            pw.println(this.Descriçao+","); //Descriçâo
            pw.println(this.valor+","); //valor 

            pw.flush();
            pw.close(); 
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Lanches.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "cadastrado com sucesso";
    }
    void setNasc(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
    
    
    /**
     * @param args the command line arguments
     */
   
