package Chapter9_3;

import java.awt.event.*;
import javax.swing.*;
public class OperatorListener implements ItemListener {
   JComboBox choice;
   ComputerListener workTogether;
   JTextField inputNumberTwo; 
   public void setJComboBox(JComboBox box) {
      choice = box;
   }
   public void setWorkTogether(ComputerListener computer) {
      workTogether = computer;
   }
   public void setInputNumberTwo(JTextField computer2) {
	       inputNumberTwo=computer2; 
	   }
   public void itemStateChanged(ItemEvent e)  {
      String fuhao = choice.getSelectedItem().toString();
      if(fuhao.equals("sqrt")) {
    	  inputNumberTwo.setEnabled(false);
      }
      workTogether.setFuhao(fuhao);
      
   }
}