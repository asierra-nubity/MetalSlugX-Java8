import java.awt.Color;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TestGlass extends Frame {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
        TestGlass mf = new TestGlass();
        
        Panel p = new Panel(null);
        mf.add(p);
        p.setPreferredSize(new java.awt.Dimension(400,400));
		Canvas c = new Canvas(){public void paint(Graphics g){
			g.setColor(Color.BLACK);
			g.drawRect(20,20,100,100);}};
		
		c.setBounds(0,0,200,200);
        
        Panel conf = new PanelConfMST(new ConfiguracionMST());
        System.out.println(conf.getPreferredSize());
        //conf.setBounds(100,100,280,272);
        
        p.add(conf);
        p.add(c);
        mf.pack();
        mf.setVisible(true);
        
        
        //~mf.setSize(400, 400);
        //~mf.setLocationRelativeTo(null);
        //~mf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       //~// mf.setGlassPane(new JPanel());
       //~java.awt.Canvas c = new java.awt.Canvas();
       //~c.setPreferredSize(new java.awt.Dimension(200,200));
		//~mf.add(c, java.awt.BorderLayout.EAST);
        //~JLabel l = new JLabel();
        //~l.setText("Hello");
        //~l.setBorder(new LineBorder(Color.BLACK, 1));
        //~l.setBounds(10, 10, 50, 20);
        //~l.setBackground(Color.RED);
        //~l.setOpaque(true);
        //~l.setPreferredSize(l.getSize());
//~JPanel p = new JPanel();
//~p.setOpaque(true);
//~p.add(l);
        //~//mf.add(l);
        //~((JPanel)mf.getGlassPane()).add(new PanelConfMST(new ConfiguracionMST()));
        //~mf.getGlassPane().setVisible(true);
//~
        //~mf.setVisible(true);
    }
}
