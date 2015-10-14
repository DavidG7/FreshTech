package CustomUI;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;



public class CustomPieChart extends JPanel {

  private static final long serialVersionUID = 1L;
  ChartPanel chartPanel;
  JFreeChart chart;

  public CustomPieChart(String applicationTitle, String chartTitle) {
       
        // This will create the dataset 
        PieDataset dataset = createDataset();
        // based on the dataset we create the chart
        chart = createChart(dataset, chartTitle);
        // we put the chart into a panel
        chartPanel = new ChartPanel(chart);
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(450, 300));

        this.add(chartPanel);
        // add it to our application
        //setContentPane(chartPanel);

    }
    
    
/**
     * Creates a sample dataset 
     */

    private  PieDataset createDataset() {
        DefaultPieDataset result = new DefaultPieDataset();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        String[] seasons = new String[] {"Spr","Sum","Au","Win"};
        	for(int i = 0; i < 4; i++){
        		Random rand = new Random();
        		int randNum = rand.nextInt(100 - 1 + 1) + 1;
        		count += randNum;
        		list.add(randNum);
       
        	
        	}
        	
        	   for(int i = 0;i<4;i++){
        		   
        		    double asPercent = list.get(i)*(100/(double)count);
        		    System.out.println(count);
        			result.setValue(seasons[i], (int)asPercent);
               }
       return result;
  }
    
    
/**
     * Creates a chart
     */

    private JFreeChart createChart(PieDataset dataset, String title) {
        
        JFreeChart chart = ChartFactory.createPieChart3D(title,          // chart title
            dataset,                // data
            true,                   // include legend
            true,
            false);

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
        
    }
    
    

    	public void refreshChart() {
    	    this.removeAll();
    	    
    	    this.revalidate(); // This removes the old chart 
    	    PieDataset dataset = createDataset();
            // based on the dataset we create the chart
            JFreeChart chart = createChart(dataset, "Sales");
            // we put the chart into a panel
            ChartPanel chartPanel = new ChartPanel(chart);
            // default size
            chartPanel.setPreferredSize(new java.awt.Dimension(450, 300));

            this.add(chartPanel);
    	   
    	}
        
    
} 