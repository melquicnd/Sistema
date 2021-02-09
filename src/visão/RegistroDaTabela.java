/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RegistroDaTabela {
    
   private String valorTotal;
   private String quantida;
   private String quantia;

    public String getQuantida() {
        return quantida;
    }

    public void setQuantida(String quantida) {
        this.quantida = quantida;
    }

    public String getQuantia() {
        return quantia;
    }

    public void setQuantia(String quantia) {
        this.quantia = quantia;
    }

   
    public String getValorTotal() {
        return valorTotal;
        
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
    
       public String sauvado(){
        try {
          FileWriter fw = new FileWriter("C:\\Arquivos do programa/ControleDaTabela.txt", true);
            PrintWriter pw = new PrintWriter(fw);
           // pw.print("Valor1,Valor2,Valor3,Valor4,Valor,5,Valor6");
           // pw.print(this.valorTotal+".");
           // pw.print(this.quantida+".");
            pw.print(this.quantia+";");
            pw.print(this.quantida+";");
            pw.flush();
            pw.close();
            fw.close();
        } catch (Exception ex) {
            Logger.getLogger(RegistroDeCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "sauvo com sucesso";
}
}