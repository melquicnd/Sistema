/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

//import com.sun.org.apache.xml.internal.resolver.Catalog;
//import java.util.Locale;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.JFreeChart;
import visão.Pessoa;
import java.awt.Dimension;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author henrique matheus
 */
public class GraficoDeBarra_1 {
    
    //Criar  o dataset
    public CategoryDataset createDataset(ArrayList<Pessoa> listaDePessoas){
    
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for(Pessoa pessoa : listaDePessoas) {
            dataSet.addValue(pessoa.getIdade(), pessoa.getNome(), "");
        
        }
        return dataSet;
    } 
    
    

    //Criar o grafico  de barra
    public JFreeChart createBarChart(CategoryDataset dataSet){
     
        JFreeChart graficoBarras = ChartFactory.createBarChart(
                "volor gasto por cada cliente",
                "lista",
                "valor",
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                false,
                false);
        
        return graficoBarras;
    } 

    
    //Criar o grafico completo
    public ChartPanel criarGrafico(ArrayList<Pessoa> listaPessoas){
    
        CategoryDataset dataSet = this.createDataset(listaPessoas);
        
        JFreeChart grafico = this.createBarChart(dataSet);
        
        ChartPanel painelDoGrafico = new ChartPanel(grafico);
        painelDoGrafico.setPreferredSize(new Dimension(400, 400));
        
        return painelDoGrafico;
    }
}
