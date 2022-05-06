
 // import 
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

 
//Declare 

public class GasStation2 extends JFrame implements ActionListener{
  private JLabel fullNameLabel,gasLabel,carWashLabel;
  private JTextField fullNameTextField, balanceTextField;
  private JPanel centerPanel,northPanel,southPanel;
  private ImageIcon carIcon , gasIcon;
  private JCheckBox price; 
  private JButton pay, printReceipt , clear;
  
  


  // initialize
  public  GasStation2 (){ // creating a constructor.
  gasIcon = new ImageIcon("gas.gif"); // if we want the image first the code of image should be written at first.
  gasLabel = new JLabel(gasIcon);
  fullNameLabel = new JLabel("$:");
  balanceTextField = new JTextField (8);
 
  northPanel =new JPanel();
  northPanel.add(gasLabel);
  northPanel.add(fullNameLabel);
  northPanel.add(balanceTextField);  
  add(northPanel, BorderLayout.NORTH);

 
centerPanel = new JPanel();
price = new JCheckBox("$10.00 ");
carIcon = new ImageIcon("carwash.gif");
carWashLabel = new JLabel(carIcon);
centerPanel.add(price);
centerPanel.add(carWashLabel);
add(centerPanel , BorderLayout.CENTER);
                                           //centerPanel.add(carWashIcon );
                                           //carWashIcon = new ImageIcon("carwash.gif");

 pay = new JButton("Pay");  
 pay.addActionListener(this);
 
 clear = new JButton("clear ");
 clear.addActionListener(this);


//pay = new JButton("Pay");
printReceipt = new JButton("Print Receipt");
//clear=  new JButton("Clear");
southPanel = new JPanel();
southPanel.add(pay);
southPanel.add(printReceipt);
southPanel.add(clear);
add(southPanel,BorderLayout.SOUTH);
 
 
setVisible(true);// making our GUI visible
setSize(500, 500); // setting the length and breadth of GUI
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
  public void actionPerformed(ActionEvent event) {
   
    
    if(event.getSource()== pay){
       String carWash = " No ";
     // String fullname = fullNameTextField.getText(); 
      String balance = balanceTextField.getText();
      // JOptionPane.showMessageDialog(null," as ");
     // String comment = commentArea.getText(); 
      
       if (price.isSelected()) {
        carWash=" Yes ";
       }
      
        String output ="Gas Amount:$" + balance  + "\nCarWash :"+ carWash;
      //  JOptionPane.showMessageDialog(null, output);

      JOptionPane.showMessageDialog(null, output);
      
      
      
      
  }
  else if(event.getSource()== clear){
    balanceTextField.setText("");
    price.setSelected(false);
    
   // JOptionPane.showMessageDialog(null,"  ");
  
  } 
  }
public static void main (String[]args)// creating the method
{
GasStation2 app = new GasStation2 ();// execute DeliveryService1Example
}// end of main method.
} //end of the class GuiExample.

  
  

