/**
 * Haylee Paredes
 * / /25
 * 
 */
package ai_project_hayleeparedes;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 *
 * @author paredesh3418
 */
public class AI_Project_HayleeParedes 
{

    public static void main(String[] args) 
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Input and Output Demo!");
       
        boolean run_again = true;
       
       while (run_again)
       {
           String nickname = JOptionPane.showInputDialog("What should I call you?");
           
           if (nickname == null || nickname.isEmpty())
           {
               run_again = false; 
           }
           else 
           {
               String welcome = "Welcome, " + nickname + "!";
               JOptionPane.showMessageDialog(null, welcome);
               
               String bDay = JOptionPane.showInputDialog("What day were you born?");
               String bMonth = JOptionPane.showInputDialog("What month were you born?");
               String bYear = JOptionPane.showInputDialog("What year were you born?");
               
               String bday = bMonth + "/" + bDay + "/" + bYear;
               
               JOptionPane.showMessageDialog(null, "Your birthday is: " + bday);
               
               String bye = "Goodbye, " + nickname + "!";
               JOptionPane.showMessageDialog(null, bye);
                
           }
       }
               
       
       
    }
    
}
