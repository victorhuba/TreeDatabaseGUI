package javaapplication3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;





public class Display extends JFrame  {
    
    private JButton go;
    private JButton addtree;
    private JButton view;
    private JButton delete;
    private JLabel findtree;
    private JLabel example;
    private JTextField search;
    private JPanel loadpanel;
    private JMenuBar menu;
    private JMenu file;
    private JMenu session;
    private JMenuItem open;
    private JMenuItem save;
    private JMenuItem exit;
    
    public Display() {
      
    
    
    super("TreeApp");   
    
    this.setLayout(new BorderLayout());
    
    menu = new JMenuBar();
    file = new JMenu("File"); 
    session = new JMenu("Session");
    go = new JButton("Go");
    addtree = new JButton("Add New Tree");
    open = new JMenuItem("New Tree");
    save = new JMenuItem("Save");
    exit = new JMenuItem("Exit");
    loadpanel = new JPanel();
    search = new JTextField(5);
    findtree = new JLabel("Find Tree: ");
    example = new JLabel("#01234");
    view =  new JButton("View");
    delete = new JButton("Delete");
    
    
    //Menu
    setJMenuBar(menu);
    menu.add(file);
    menu.add(session);
    file.add(open);
    file.add(save);
    session.add(exit);
    
    loadpanel.add(findtree);
    loadpanel.add(search);
    loadpanel.add(go);
    loadpanel.add(addtree);
    loadpanel.add(example);
    loadpanel.add(view);
    loadpanel.add(delete);
    
   example.setBounds(110,100,80,20);
    loadpanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
    this.add(loadpanel,BorderLayout.CENTER);
        
    go.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e){
           EditEntry edit = new EditEntry();
           dispose();
        }
    });
       
        setSize(600,400);
        setVisible(true);
   
        
    }
}
