package com.mycompany.main;
import java.util.Scanner;
public class main {//start of class
    
public static void main(String[] args) {//Start of main
    Scanner input = new Scanner(System.in);
  Login login  = new Login();
  
  System.out.println("Enter username:");
  String username = input.nextLine();
  
  System.out.println("Enter password :");
  String password = input.nextLine();
  
  System.out.println("Enter phonenumber(+27)");
  String phone =input.nextLine();
  
  String result = login.registerUser(username,password,phone);
   System.out.println(result);
   
   
if(login.checkPhoneNumber(phone)){
    System.out.println("Phone number is valid");
}
else {
    System.out.println("Invaild phone number");
}
if(login.Loginstatus(username,password)) {
   System.out.println("Login successful");
}else{
    System.out.println("Login failed");
}


  
  }//end of main  
    
}//end of class

 

 

         
   
    

