import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs
{

    public static void main(String[] args) 
    {
        String name;
        int choice;

        do 
        {
            name = JOptionPane.showInputDialog(null, "What is your name?");

            if (name == null) 
            {
              break;
            }

            choice = JOptionPane.showConfirmDialog(null, "Do you want your name to be shown?");

            if (choice == JOptionPane.YES_OPTION) 
            {
                
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
            }         
            
        } 
        
        while (choice != JOptionPane.YES_OPTION);

    }
}