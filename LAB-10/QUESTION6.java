class CheckArgumentException extends Exception 
{
    public CheckArgumentException() 
    {
        super("Number of arguments must be at least four!");
    }
}
public class QUESTION6 
{
    public static void main(String[] args) 
    {
        try 
        {
            if (args.length < 4) 
            {
                throw new CheckArgumentException();
            } 
            else 
            {
                int sum = 0;
                for (int i = 0; i < 4; i++) 
                {
                    int num = Integer.parseInt(args[i]);
                    sum += (num * num);
                }
                System.out.println("Sum of squares of all four elements is:" + sum);
            }
        } 
        catch (CheckArgumentException e) 
        {
            System.out.println(e.getMessage()); 
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid argument format:" + e.getMessage());
        }
    }
}
