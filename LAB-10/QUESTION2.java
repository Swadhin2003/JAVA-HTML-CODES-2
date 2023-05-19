public class QUESTION2
{
    public static void main(String[] args)
    {
        try
        {
            int x = 10/0; 
        }
        catch(ArithmeticException ae)
        {
            System.out.println("ArithmeticException caught");
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
    }
}
