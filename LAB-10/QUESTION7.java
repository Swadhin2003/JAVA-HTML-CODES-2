class LessBalanceException extends Exception 
{
    public LessBalanceException() 
    {
        super("Withdrawal amount exceeds account balance!");
    }
}
public class QUESTION7 
{
    private double balance;
    public QUESTION7() 
    {
        balance = 500;
    }
    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Amount deposited:" + amount);
        System.out.println("New balance is:" + balance);
    }
    public void withdraw(double amount) throws LessBalanceException 
    {
        if (balance - amount < 500) 
        {
            throw new LessBalanceException();
        } 
        else 
        {
            balance -= amount;
            System.out.println("Amount withdrawn:" + amount);
            System.out.println("New balance is:" + balance);
        }
    }
    public static void main(String[] args) 
    {
        QUESTION7 account = new QUESTION7();
        account.deposit(1000);
        try 
        {
            account.withdraw(300);
        } 
	  catch (LessBalanceException e) 
        {
            System.out.println(e.getMessage()); 
        }
        try 
        {
            account.withdraw(1000);
        } 
        catch (LessBalanceException e) 
        {
            System.out.println(e.getMessage()); 
        }
    }
}
