/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.io.File;   
import java.io.FileNotFoundException;   
import java.util.Scanner;



//import sun.io.Converters;   
  
import java.text.SimpleDateFormat;

public class MeApagueSERIO {
    private  static String codigo,descricao,preco;
   
    public static void main(String[] args) {
        
       File arquivoCSV = new File("TabelaSimples.txt") ;
        try {
            
            String LinhaDoArquivo = new String();
            
            Scanner leitor = new Scanner(arquivoCSV);
            
            while(leitor.hasNext()){
            
                LinhaDoArquivo = leitor.nextLine();
                System.out.print(LinhaDoArquivo);
            }
            
            
        } catch (FileNotFoundException e) {
        }
        
        
    String dataAtualFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
                                    .format(System.currentTimeMillis());

    //Seta valores da data
    String dataString = dataAtualFormatada.substring(0,10);

    //Seta valores do horário
    String horario = dataAtualFormatada.substring(11,19);
        System.out.println(dataString+" "+horario);


   /*     try {
			//abre o arquivo
			FileReader fr = new FileReader("newNEW.txt");
			BufferedReader br = new BufferedReader(fr);
			String temp;
			//A cada interação, é uma linha do arquivo e atribui-a a temp
			while ((temp = br.readLine()) != null)
			{
				//Aqui gera a sua "lista". No caso, imprimi cada linha na tela.
				String[] a = temp.split(";");
				int i=0;
				for(String each : a)
				{
					if(i==0){
						codigo=each;							
						System.out.println(codigo);
					}
						if(i==1){
							descricao=each;
							System.out.println(descricao);
						} 
						if(i==2){
							preco=each;
							i=-1;
							System.out.println(preco);
						}
						i++;
					}						
				}
		}
		catch (FileNotFoundException el)
		{
			System.out.println("Arquivo não Encontrado!");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
        
        
        
      /*try {   
                //abre o arquivo   
                FileReader fr = new FileReader("newNEW.txt");   
                BufferedReader br = new BufferedReader(fr);   
                String temp;   
                //A cada interação, é uma linha do arquivo e atribui-a a temp   
                while ((temp = br.readLine()) != null)   
                {   
                    //Aqui gera a sua "lista". No caso, imprimi cada linha na tela.   
                    String[] a = temp.split(";");   
                    for( String each : a )
                           System.out.println(each);   
                }   
                   
                /*Scanner ler = new Scanner (new File("D:\Meus Documentos\Algoritmos em JAVA\Teste\lista.txt"));  
                while(ler.hasNext())  
                {  
                    String aux = ler.next();  
                    String[] a = aux.split(";");  
                        for( String each : a )
                            System.out.println(each);  
                }   
           /* }   
            catch (FileNotFoundException el)   
            {   
                System.out.println("Arquivo não Encontrado!");   
            }   
            catch (IOException e)   
            {   
                e.printStackTrace();   
            }*/
}
}

