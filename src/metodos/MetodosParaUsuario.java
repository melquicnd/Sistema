/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MetodosParaUsuario {
    
   // String[] combo = {};
    
    
    
    public void  cboSelect (JComboBox edades) {
    edades.removeAllItems();
    
    for(int x =1; x < 100 ; x++){
            edades.addItem(x);
    }
    }
    
      
        
    
}
    
    
    

//RENDER TO OUR IMGS AND TEXT TO COMBOBOX
/*class MImagesTextRenderer extends JLabel implements ListCellRenderer
{
    @Override
    public Component getListCellRendererComponent(JList list, Object val,
         int index, boolean selected, boolean focused) {
        ImagesNText it = (ImagesNText)val;
        
        //SET VALUES
        setIcon(it.getImg());
        setText(it.getName());
        
        if(selected)
        {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        }else
        {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        
        setFont(list.getFont());
        
        return this;

}
}*/