
package metodos;

import java.awt.Desktop;
import java.net.URI;

public class MetodoAbrirLink {

    
    public static void main(String[] args) {
        try {
            String numero = "5583998692594";
            String texto = "é+a+hora+da+putaria";
            
            URI link = new URI("https://api.whatsapp.com/send?phone="+numero+"&text="+texto);
            Desktop.getDesktop().browse(link);
            
            
        } catch (Exception erro) {
            System.out.println(erro);
        }
    }
    
}
