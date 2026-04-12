import javax.swing.JOptionPane;
public class main {
    
public static void main(String[] args) {
    Login obj = new Login();
    
    String username = JOptionPane.showInputDialog("Enter usernanme:");
    String password = JOptionPane.showInputDialog("Enter password:");
    String Number = JOptionPane.showInputDialog("Enter Number:");
    String result = obj.registerUser(username,password, Number);
     if(obj.checkpasswordComplexity(password)){
           
           JOptionPane.showMessageDialog(null," ValidPassword");
        }
        else{
            JOptionPane.showMessageDialog(null,"invalid password");
     }
        
        if (obj.checkPhoneNumber(Number)){
            JOptionPane.showMessageDialog(null,"ValidNumber");
        }
        else{
            JOptionPane.showMessageDialog(null,"invalid number");
        }
        if(obj.checkUserName(username)){
            
            JOptionPane.showMessageDialog(null,"Valid Username");
           
        }
        else{
            JOptionPane.showMessageDialog(null,"invalid username");
        }
JOptionPane.showMessageDialog(null, result);

         String Username = JOptionPane.showInputDialog("Enter Username");
         
         String Password = JOptionPane.showInputDialog("Enter Password");
         if (obj.Loginstatus( Username, Password )){
             JOptionPane.showMessageDialog(null,"Login Successful");
         }else{
             JOptionPane.showMessageDialog(null,"Login failed");
         }
         
    } 
    
}

 

 

         
   
    

