package com.mycompany.main;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
        
public class Login {//beginning of class
    public boolean checkUserName(String username){
        return username.contains("_");
    }

 public     boolean checkpasswordComplexity(String password){//start of method 
     if (password.length() < 8){
         return false;
     }//end of method
     boolean hasUpperCase = false;
  boolean hasSpecialChar = false;
  
  for (int i =0; i < password.length(); i++){
       char ch= password.charAt(i);
  
 if (Character.isUpperCase(ch)) {
 hasUpperCase= true;
}
  if(Character.isLetterOrDigit(ch)) {//start of if stataement 
  hasSpecialChar = true;
}
}
  return hasUpperCase && hasSpecialChar;
}
  public  boolean checkPhoneNumber(String phoneNumber) {
     String phoneNumberPattern ="^\\+27\\d{9}$";
     Pattern regexPattern = Pattern.compile(phoneNumberPattern);
     Matcher match = regexPattern.matcher(phoneNumber);
     return match.matches();
 }
 public  String registerUser(String username,String password,String number){
     //Checking userName 
     if(checkUserName(username)){
         return "username must contain an underscore _";
     }
     //check password length
    if(checkpasswordComplexity(password)) {
        return "password must be atleast 8 characters long, include capital letters and a special character";
    } 
    return "Registraion Successfull";
 }//end of method
   public  boolean Loginstatus(String username,String password){
    return (username.equals("Leap_Frog")&& password.equals("S1234$l8"));
   }
 
}//end of class
