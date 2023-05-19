public class QUESTION3 
{
	public static void main(String[] args) 
      {	
		int[] arr = new int[4];	
		try 
            {		
			arr[7] = 10;
		}
            catch (ArrayIndexOutOfBoundsException ex) 
            {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
            finally 
            {
			System.out.println("Finally block");
		}
	}
}