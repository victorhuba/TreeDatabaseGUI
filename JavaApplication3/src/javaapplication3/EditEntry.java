
package javaapplication3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class EditEntry extends JFrame{
    public  EditEntry() {
    
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        getContentPane().add(new DataUi());
         setSize(600,400);
        setVisible(true);
}
    
}
