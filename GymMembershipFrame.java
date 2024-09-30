/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author DELL
 */
public class GymMembershipFrame extends JFrame{
    
    
    private JPanel headingPnl;
    private JPanel   clientPnl;
    private JPanel namePn1;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel contractsPnl;
    private JPanel personalTrainerOptionPnl;
    private JPanel membershipPnl;
    private JPanel commentPnl;
    private JPanel headingClientCombinedPnl;
    private JPanel membershipCommentsPnl;
    private JPanel btnaPnl;
    private JPanel mainPnl;
    
    
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNolbn;
    private JLabel genderLbn;
    private JLabel personalTranerLbn;
    private JLabel contractsLbn;
    
    
    //textfields
    private JTextField nameTextFld;
    private JTextField surnameTxtFld;
    private JTextField idnoTxtfld; 
    //textArea
    private JTextArea commentsArea;
    
    //checkBox
    private JCheckBox personTrainerchdkx;
   
    //radio buttons
    private JRadioButton sixMonthsRadBtn;
    private JRadioButton monthToMonthRadBtn;
    private JRadioButton annualRadBtn;    
    
    //combBox
    private JComboBox genderCombBox;
    
    //Scrollpane
    private JScrollPane scrollableTextArea;
    
    //private button
    private JButton applyBtn;
    
    //buttongroup
    private ButtonGroup btnGrp;
    
    public GymMembershipFrame(){
        setTitle("Gyym membership");
        setSize(500,550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        clientPnl = new JPanel(new GridLayout(4,1,1,1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"client details"));
        
        namePn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        surnamePnl =new JPanel(new FlowLayout(FlowLayout.CENTER));
        idNoPnl =new JPanel(new FlowLayout(FlowLayout.CENTER));
        genderPnl =new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        contractsPnl =new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerOptionPnl =new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        membershipPnl =new JPanel(new GridLayout(4,1,1,1));
        membershipPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"count"));
        
        commentPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        btnaPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingClientCombinedPnl = new JPanel(new BorderLayout());
        membershipCommentsPnl =new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        //create labels
        headingLbl =new JLabel("Membership Form");
        headingLbl.setFont(new Font(Font.SANS_SERIF,Font.ITALIC+Font.BOLD,20));
        headingLbl.setForeground(Color.BLUE);
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
          
    
         nameLbl =new JLabel("Name:    ");
         surnameLbl =new JLabel("Surname:   ");
         idNolbn = new JLabel("IdNo:    ");
         genderLbn =new JLabel("Gender:  ");
         contractsLbn =new JLabel("Type of contract:   ");
         personalTranerLbn =new JLabel("Select the checkbox if you need a personal trainer");
         
         //created textfields
         nameTextFld =new JTextField(10);
         surnameTxtFld = new JTextField(10);
         idnoTxtfld = new JTextField(10);
         
         //created comboBox
         genderCombBox = new JComboBox();
         genderCombBox.addItem("Male");
         genderCombBox.addItem("Female");
         
         //created radio buttons
         monthToMonthRadBtn = new JRadioButton("Month-to-month");
         sixMonthsRadBtn = new JRadioButton("Six months");
         annualRadBtn = new JRadioButton("Annual");
          
          //create check box
          personTrainerchdkx = new JCheckBox();
          
          //create button group
         btnGrp = new ButtonGroup();
         btnGrp.add(monthToMonthRadBtn);
         btnGrp.add(sixMonthsRadBtn);
         btnGrp.add(annualRadBtn);
          
    
         //craete text Area
         commentsArea =new JTextArea(20, 40);
         commentsArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Comments"));
          
         scrollableTextArea =new JScrollPane(commentsArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    
         //create button
         applyBtn =new JButton("APPLY");
         applyBtn.addActionListener(new ApplyActionListener());
         //add components to panel
         headingPnl.add(headingLbl);//--first collective panel
         
         namePn1.add(nameLbl);
         namePn1.add(nameTextFld);
         
         surnamePnl.add(surnameLbl);
         surnamePnl.add(surnameTxtFld);
         
         idNoPnl.add(idNolbn);
         idNoPnl.add(idnoTxtfld);
         
         genderPnl.add(genderLbn);
         genderPnl.add(genderCombBox);
         
         clientPnl.add(namePn1);//--second collective panel
         clientPnl.add(surnamePnl);
         clientPnl.add(idNoPnl);
         clientPnl.add(genderPnl);
         
         headingClientCombinedPnl.add(headingPnl,BorderLayout.NORTH);
         headingClientCombinedPnl.add(clientPnl,BorderLayout.CENTER);
         
         contractsPnl.add(contractsLbn);
         contractsPnl.add(monthToMonthRadBtn);//--third collective panel
         contractsPnl.add(sixMonthsRadBtn);
         contractsPnl.add(annualRadBtn);
         
         
         personalTrainerOptionPnl.add(personalTranerLbn);
         personalTrainerOptionPnl.add(personTrainerchdkx);
         
         membershipCommentsPnl.add(membershipPnl,BorderLayout.NORTH);
         membershipCommentsPnl.add(commentPnl,BorderLayout.CENTER);
        membershipCommentsPnl.add(contractsPnl,BorderLayout.SOUTH);
         
        //membershipCommentsPnl.add(membershipPnl);
         btnaPnl.add(applyBtn);//--firth collective panel
         commentPnl.add(commentsArea);
         
         commentPnl.add(personalTrainerOptionPnl);
         
         mainPnl.add(headingClientCombinedPnl,BorderLayout.NORTH);
         mainPnl.add(membershipCommentsPnl,BorderLayout.CENTER);
         mainPnl.add(btnaPnl,BorderLayout.SOUTH);
         
         add(mainPnl);
         pack();
         setVisible(true);
         
    }
    private class ApplyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
        System.exit(1);
        }
    
    
    }
    
    
    
}
