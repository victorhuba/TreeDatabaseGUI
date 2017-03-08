
package javaapplication3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoadSession extends JFrame {

    private JButton load;
    //private JLabel greeting;
    private JPanel loadpanel;
    private JMenuBar menu;
    private JMenu file;
    private JMenuItem open;
    
    
    public LoadSession() {
    super("TreeApp");   
    
    this.setLayout(new BorderLayout());
    
    menu = new JMenuBar();
    file = new JMenu("File"); 
    load = new JButton("Load");
    open = new JMenuItem("Open File");
    loadpanel = new JPanel();
    
    //Menu
    setJMenuBar(menu);
    menu.add(file);
    file.add(open);
    
    loadpanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
    loadpanel.add(load);
    this.add(loadpanel,BorderLayout.SOUTH);
    
    load.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e){
           Display display = new Display();
           dispose();
        }
    });
    
    
    
    setSize(600,400);
    setVisible(true);
    }
}
   

