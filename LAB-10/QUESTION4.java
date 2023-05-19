class NegativeNumberException extends Exception 
{
    public NegativeNumberException() 
    {
        super("Negative number entered!");
    }
}
public class QUESTION4 
{
    public static void processInput(int num) throws NegativeNumberException 
    {
        if (num < 0) 
        {
            throw new NegativeNumberException();
        } 
        else 
        {
            System.out.println("Double value of entered number is " + (num * 2.0));
        }
    }
    public static void main(String[] args)
    {
        try 
        {
            QUESTION4.processInput(-5); 
        } 
        catch (NegativeNumberException e) 
        {
            System.out.println(e.getMessage());
        }
    } 
}
