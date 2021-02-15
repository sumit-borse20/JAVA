import java.util.*;
class BankApplication 
{
    public static void main(String args[])
    {
        BankAccount obj1=new BankAccount("xyz","ba0001");
        obj1.showmenu();
    }
    
}

class BankAccount
{
    int balance;
    int previoustransaction;
    String Custumername;
    String Custumerid;
    
public BankAccount(String cname,String cid)
{
    Custumername=cname;
    Custumerid=cid;
}

 void deposit(int amount)
 {
    if(amount !=0)
    {
        balance=balance + amount;
        previoustransaction= amount;
    }
   }

 void withdrawn(int amount)
{
    if(amount !=0)
    {
        balance=balance - amount;
        previoustransaction= amount;
    }
}

void getPrevioustransaction()
{
    if(previoustransaction > 0)
    {
      System.out.println("Deposited :"+previoustransaction);
    }
else if(previoustransaction < 0)
    {
        System.out.println("Withdrawn: "+(previoustransaction));
    }
    else
    {
        System.out.println("No Transaction Occurred");
    }
}
void showmenu()
{
    char option='\0';
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Welcome Custermer :"+Custumername);
    System.out.println("Custemer id :"+Custumerid);
    System.out.println("\n");
    System.out.println("A.Check Balance");
    System.out.println("B.Deposit");
    System.out.println("C.Withdrawn");
    System.out.println("D.Previous Transaction");
    System.out.println("E.Exit");

    do
    { 
        System.out.println("---------------------------------");
        System.out.println("Enter your Option");
        System.out.println("---------------------------------");
        option=sc.next().charAt(0);
        System.out.println("\n");

        switch(option)
        {
            case 'A':
            System.out.println("---------------------------------");
            System.out.println("Balance :"+balance);
            System.out.println("---------------------------------");
            System.out.println("\n");
            break;
                
            case 'B':
            System.out.println("---------------------------------");
            System.out.println("Enter an Amount To deposit:");
            System.out.println("---------------------------------");
            int amount=sc.nextInt();
            deposit(amount);
            System.out.println("\n");
            break;

            case 'C':
            System.out.println("---------------------------------");
            System.out.println("Enter an Amount To Withdrawn:");
            System.out.println("---------------------------------");
            int amount2=sc.nextInt();
            withdrawn(amount2);
            System.out.println("\n");  
            break;

            case 'D':
            System.out.println("---------------------------------");
            getPrevioustransaction();
            System.out.println("---------------------------------");
            System.out.println("\n");
            break;
            
            case 'E':
                System.out.println("Invalid Option !.Please Enter Again!");
              
            Default:
             System.out.println("Invalid Option !.Please Enter Again!");
             break;
          }
       
        }
          while(option !='E');
            {
            System.out.println("Tnank you for using our Services");
            }
    }
}
