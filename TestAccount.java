abstract class BankAccount
{
public abstract void deposite();
public abstract void withdrawl();
public abstract void checkBalance();
public void getDetails()
{
System.out.println("Get details of customer in form of name ,mobile number ,age ,email ,address etc");
}
}
class SavingAccount extends BankAccount
{
public void deposite()
{
System.out.println("deposited amount is Rs 5000");
}
public void withdrawl()
{
System.out.println("withdrawl amount is Rs 2000");
}
public void checkBalance()
{
System.out.println("Your current balance is 3000");
}
}
class CurrentAccount extends BankAccount
{ 
public void deposite()
{
System.out.println("deposited amount is Rs 6000");
}
public void withdrawl()
{
System.out.println("withdrawl amount is Rs 1000");
}
public void checkBalance()
{
System.out.println("Your current balance is 5000");
}
}
public class TestAccount
{
public static void main(String args[])
{
 BankAccount T1=new SavingAccount();
T1.getDetails();
T1.deposite();
T1.withdrawl();
T1.checkBalance();

BankAccount T2=new CurrentAccount();
T2.getDetails();
T2.deposite();
T2.withdrawl();
T2.checkBalance();



}
}

