/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practise.java.basics.from.coddy;
import java.util.Scanner;
/**
 *
 * @author NEHRAN
 */
public class PractiseJavaBasicsFromCoddy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Write a Java program that converts the string "True" to a boolean and prints the result
       // Convert the string "true" to a boolean and print the result
       /*
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter a boolean string (true/false): ");
       String input = scan.nextLine();
        String trueString = "true"; // Correct variable name and value
        boolean bool = Boolean.parseBoolean(trueString); // Correct method call
        System.out.println(bool); // Print the boolean value
        
        
//3.Write a program that attempts to convert the string "abc" to an integer using Integer.parseInt() and handles the resulting exception.
    
String yui="1";
    int ingt=Integer.parseInt(yui);
    System.out.println(ingt);
    
    int integer= 6;
    double decimal=(int)integer;
    System.out.println(decimal);
    
    double dec= 9.890;
    int convert_dec_to_integer=(int) dec;
    System.out.println(convert_dec_to_integer);
    
    double dec1=7;
    double dec2=2;
            double division=dec1/dec2;
            int devision_to_maths= (int) division;
            System.out.println(devision_to_maths);
            
    double dec3=9.7;
    int dec3_to_int= (int)dec3;
    System.out.println(dec3_to_int);
    
    Scanner scan2=new Scanner(System.in);
    System.out.println("Enter a decimal= ");
    double dec4=scan2.nextDouble();
    int converting_dec4_to_integer= (int)dec4;
    System.out.println(converting_dec4_to_integer);
    
    int count=5;
    count++;
    System.out.println(count);
    
    int value=10;
    value--;
    System.out.println(value);
    
    int variable=0;
    variable++;
    variable++;
    variable++;
    variable++;
    variable++;
    variable++;
    variable++;
    variable++;
    variable++;
    variable++;
    variable++;
    System.out.println(variable);
    
    int alpha=10;
    alpha--;
    alpha--;
    alpha--;
    alpha--;
    alpha--;
    alpha--;
    alpha--;
    alpha--;
    alpha--;
    alpha--;
    System.out.println(alpha);
    
    Scanner scan3=new Scanner(System.in);
    System.out.println("Enter a number");
    int Scan3_to_int= scan3.nextInt();
    Scan3_to_int++;
    System.out.println(Scan3_to_int);*/
       
     int number=45;
     String text1= String.valueOf(number);
     System.out.println(text1);
     
     double number1= 32.90;
     String text2=String.valueOf(number1);
     System.out.println(text2);
     
     boolean boo= true;
     String bool_to_String= String.valueOf(boo);
     System.out.println(bool_to_String);
     
     String decimal3= "45.67";
     Double dec4=Double.parseDouble(decimal3);
     System.out.println(dec4);
     
      int num1=10;
             int num2=3;
             int num3=num1%num2;
             System.out.println(num3);
             
      int num=93;
      if (num%2==0){
      System.out.println("Even number");
      }
      if (num%2==1){
      System.out.println("Odd number");
      
      
   
      }
      
     int x=5;
     int y= ++x;
     System.out.println(x);
     System.out.println(y);
     
     int a=5;//this becomes 6
     int b= a++;// this remains 5
     System.out.println(a);
     System.out.println(b);
     
     
     int score=7;
     int res1= score++;
     System.out.println(res1);
     System.out.println(score);
     
     int scoore= 20;
     int result=++scoore;
     System.out.println(result);
     System.out.println(scoore);
     
     int an=10;
     an=an * 8;
     int anl=90;
     anl += 34;
     anl -= 11;
     System.out.println(an);
     System.out.println(anl);
     
     int alpha = 10;
     alpha %= 3;
     System.out.println(alpha);
     
     //int c=1;
     //int d=2;
     System.out.println(1 != 2);
     System.out.println(5>3);
     
     String str1="hello";
     String str3="Hello";
     System.out.println(str1.equals(str3));
     System.out.println(str1.equalsIgnoreCase(str3));
     System.out.println(str3.equals(str1));
     System.out.println(str3.equalsIgnoreCase(str1));
       

System.out.println((5 > 3) && (1 == 1));
System.out.println(!(5 == 4) || (5 == 2));
System.out.println(!(3 > 4));

boolean e=true;
boolean f=false;
System.out.println( e || f);

 // Initialize variables
        boolean hasLicense= true;
        boolean hasSpace=false;
        boolean hasExperience=true;


        // Calculate conditions
        boolean canSellRegularPet = (hasLicense || hasExperience) && (hasSpace);
        boolean canSellExoticPet = (hasLicense && hasExperience) && (hasSpace);
        boolean cannotSellAnyPet =(hasLicense && hasExperience) || (hasSpace);
        boolean ressult =(canSellRegularPet || canSellExoticPet) || (cannotSellAnyPet);


        // Don't delete the lines below
        System.out.println("Can sell regular pet: " + canSellRegularPet);
        System.out.println("Can sell exotic pet: " + canSellExoticPet);
        System.out.println("Cannot sell any pet: " + cannotSellAnyPet);
        System.out.println("Result: " + ressult);
        
        int h= 13;
        int g = 12;
        
        // Don't change below this line
        int c = 0;
        if (h >= g && !(g < 10)) {
            c = 2;
        }
        
        c += 1;
        System.out.println("c = " + c);
        
       
        
      
    }
    
}
