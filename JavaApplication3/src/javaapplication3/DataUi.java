
package javaapplication3;

import java.awt.*;
import javax.swing.*;
public class DataUi extends JPanel {
    private JTextField idField =  new JTextField(10);
    private JTextField name =  new JTextField(10);
    private JTextField species =  new JTextField(10);
    private JTextField disc =  new JTextField(150);
    private JButton delete = new JButton("Delete");
    private JButton cancel = new JButton("Cancel");
    
    
    //private DataBean bean = new DataBean();
    public DataUi() {
       
        setLayout(new BorderLayout(5, 5));
        add(initFields(), BorderLayout.NORTH);
        add(initButtons(), BorderLayout.CENTER);
    }
    
   private JPanel initButtons() {
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3));
      panel.add(delete);
      panel.add(cancel);
     // delete.addActionListener(new ButtonHandler());
      //cancel.addActionListener(new ButtonHandler());
      return panel;
   }

   private JPanel initFields() {
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
      panel.add(new JLabel("ID"), "align label");
      panel.add(idField, "wrap");
      idField.setEnabled(false);
      panel.add(new JLabel("Name"), "align label");
      panel.add(name, "wrap");
      panel.add(new JLabel("Species"), "align label");
      panel.add(species, "wrap");
      panel.add(new JLabel("Bried Description"), "align label");
      panel.add(disc, "wrap");
      return panel;
   }
}
