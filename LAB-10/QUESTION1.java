public class QUESTION1 
{  
 public static void main(String args[]) 
 {  
  try
  { 
    int a[]=new int[5]; 
    a[6]=9; 
  }  
  catch(ArrayIndexOutOfBoundsException e) 
  { 
    System.out.println("ArrayIndexOutOfBounds Exception occurs");  
  }  
 }  
}