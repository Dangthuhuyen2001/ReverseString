/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverser;
/**
 *
 * @author ASUS
 */
public class Reverser {
    public static void reverse(StringBuffer str) //function to reverse the string 
    { 
        int n = str.length();   // Create a stack of capacity  
        Stack obj = new Stack(n);  // equal to length of string 

        int i; 
        for (i = 0; i < n; i++) // Push all characters of string    // to stack  
        obj.push(str.charAt(i)); 
  
        for (i = 0; i < n; i++) 
        {  
            char ch = obj.pop();  // Pop all characters of string  
            str.setCharAt(i,ch);  // and put them back to str 
        } 
    }  
    public static void main(String args[]) //driver function 
    { 
        //create a new string 
        StringBuffer s= new StringBuffer("Thu Huyen");  
        //call reverse method 
        reverse(s);                 
         //print the reversed string 
        System.out.println("Reversed string is "+s );                                       
    } 
}
  
