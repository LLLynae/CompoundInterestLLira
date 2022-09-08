import javax.swing.JOptionPane;
import javax.swing.*;


public class EquationGUI {
    
    String principalVal;
    String annualPercentageVal;
    String timePassedVal;
    boolean compounding = false;
    double interestDecimal;

    public EquationGUI(){

   
        principalVal = JOptionPane.showInputDialog("Welcome! Please enter your initial value.");
        double annualPercentage = Double.parseDouble(annualPercentageVal);
        
        annualPercentageVal = JOptionPane.showInputDialog("Welcome! Please enter your annual percentage rate.");
        double percentage = Double.parseDouble(annualPercentageVal);
        interestDecimal = (percentage/100);

        timePassedVal =  JOptionPane.showInputDialog("Welcome! Please enter the number of years.");
        double timePassed = Double.parseDouble(timePassedVal);
        //userID = userentersID;
        
        
        }
}
