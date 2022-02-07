package palindromenumcheck;

import java.util.Scanner;

/**
 *
 * @author Keanan
 */
public class PalindromeNumCheck {

   
    public static void main(String[] args) 
    {
     int remainder ,sum =0, num ,temp;
          
        System.out.println("Enter an number ");
               
       Scanner input = new Scanner(System.in);
       
       num = input.nextInt();
       
       temp = num;
        
       while(num > 0)
       {
       remainder = num%10;//2
       sum = (sum *10) + remainder;//2
       num = num /10;
       }  
        if(temp==sum)    
        System.out.println("palindrome number ");    
        else    
        System.out.println("not palindrome");    
}  
    }
    

