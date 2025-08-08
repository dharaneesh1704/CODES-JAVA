import java.util.Scanner;   

public class banking_application
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        long acc_no[]={1l,2l,3l,4l},acc_pass[]={111l,222l,444l};
        float acc_balance[]={123f,1233f,444f,5555f};

        System.out.println("WELCOME TO BANKING APPLICATION");
        System.out.println("enter your account number : ");
        long u_acc=sc.nextLong();
        System.out.println("enter the account password: ");
        float u_pass=sc.nextFloat();

        int index=-1,i=0;
        for(i=0;i<acc_no.length;i++)
        {
            if(u_acc == acc_no[i] && u_pass==acc_pass[i])
            {
                index=i;
                break;
        
            }
        }
            if(index!= -1)
            {
                System.out.println("login successfull");
                
                System.out.println("1. deposit\n2. withdrawl\n3. check balance\n4. loan offers\n0. exit");
        
                
        
            }

            else
            {
                System.out.println("login failed\n0 to try again");
            
            }
        

        int choice = sc.nextInt();

        while(choice!=0 && index!=-1){
        
        switch(choice)
        {
            case 1:
                System.out.println("Enter the amount to deposit: ");
                float deposit = sc.nextFloat();
                acc_balance[i]+=deposit;
                System.out.println("Amount deposited successfully");
                System.out.println("Your current balance is: "+acc_balance[i]);
                break;

            case 2:
                System.out.println("enter the amount to withdraw: ");
                float withdraw = sc.nextFloat();
                if(withdraw>acc_balance[i])
                {
                    System.out.println("Insufficient balance");
                }
                else
                {
                    acc_balance[i]-=withdraw;
                    System.out.println("Amount withdrawn successfully");
                    System.out.println("Your current balance is: "+acc_balance[i]);
                }
                break;
              
            case 3:
                System.out.println("Your current balance is: "+acc_balance[i]);
                
                break;

            case 4:
                System.out.println("enter the type of loan you wanted to apply: ");
                String user_loan = sc1.next();    
                System.out.println("thank you for yor response and our team will reach you as soon as possible");     
                break;         


            default:
                System.out.println("please enter a valid number in a range from 0-4");
        }
        System.out.println("enter the other option : ");
        System.out.println("1. deposit\n2. withdrawl\n3. check balance\n4. loan offers\n0. exit");
        
        choice = sc.nextInt();
        }
    }
}
