/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author gulza
 */
public class View implements ActionListener {
    private BeeList beeList;
    private JFrame frame;
    private JLabel[] text;
    private JPanel panel;
    
    public void Build_GUI(BeeList bees){
        frame = new JFrame();
        beeList = bees;
        
        JButton dmgCalculate  = new JButton("Damage");
        dmgCalculate.addActionListener(this);
        //creates button to damge bees
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(5,7));
        panel.setBorder(BorderFactory.createEmptyBorder(40,40,40,40));
        //sets up a grid to dipslay all values
        
        text = new JLabel[30];
        //holds all bee values
        Set_Labels(text,beeList,panel);        
        
        panel.add(dmgCalculate);
        //adds the button after all the labels
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //closes application when window is closed
        frame.setTitle("HESA code solution Ali Gulzar");
        frame.pack();
        frame.setVisible(true);
    }

    private void Set_Labels(JLabel [] text,BeeList bees,JPanel panel) {
        //assigns the inital values to each label
       for (int i = 0; i<30; i++){
            text[i] = new JLabel();
            text[i].setText(beeList.Get_Bee_Info(i));
            panel.add(text[i]);
        }
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //method executed when button pressed
        beeList.Damage_Bee();
        //damtges all bees
        for (int i = 0 ;i<30;i++){
            //updates all values to lables
            text[i].setText(beeList.Get_Bee_Info(i));
        }
    }
    
}
