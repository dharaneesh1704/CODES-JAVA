
interface UPI
{
    public int balanceCheck(String upi_id);
    public boolean send_money(String send_upi_id,String receive_upi_id,String pass,int amt);
    public boolean reset_pass(String upi_id,String old_pass,String new_pass);
}

abstract class Money implements UPI
{
    static protected String[] upi_ids={"Dharaneesh@gpay","Naveen@paypal","Kiran@ybl","Ram&okaxis"};
    static protected String[] pass={"1234","2345","4556","6542"};
    static protected float[] bal={12334,1234,432,4322};
    
    public int balanceCheck(String upi_id)
    {
        for(int i=0;i<upi_ids.length;i++)
        {
            if(upi_ids[i].equals(upi_id))
                return (int)bal[i];
        }
        return -1;
    }    

    public boolean send_money(String send_upi_id,String receive_upi_id,String password,int amt)
    {
        int send=-1;
        int rec=-1;
        for(int i=0;i<upi_ids.length;i++)
        {
            if(send_upi_id.equals(upi_ids[i]))
                send=i;
            if(receive_upi_id.equals(upi_ids[i]))
                rec=i;
        }
        if(send==-1 || rec==-1)
            return false;
        if(bal[send]-amt<0)
            return false;
        if(!pass[send].equals(password))
            return false;
        bal[send]-=amt;
        bal[rec]+=amt;
        return true;
    }
}

abstract class Service  extends Money implements UPI
{
    
    public boolean reset_pass(String upi_id,String old_pass,String new_pass)
    {
        boolean found=false;
        int ind=-1;
        for(int i=0;i<upi_ids.length;i++)
        {
            if(upi_id.equals(upi_ids[i]))
            {
                found=true;
                ind=i;
            }
        }
        if(!found)
            return false;
        if(!pass[ind].equals(old_pass))
            return false;
        pass[ind]=new_pass;
        return true;
    }
}

class last extends Service
{

}

class UPI_transaction
{
    public static void main(String[] args) 
    {
         // Interface reference, object from concrete class
        UPI service = new last();

        // 1. Balance check
        System.out.println("Initial Balance (Dharaneesh): " + service.balanceCheck("Dharaneesh@gpay"));

        // 2. Send money
        boolean sent = service.send_money("Dharaneesh@gpay", "Naveen@paypal", "1234", 500);
        System.out.println("Transaction status: " + sent);

        // 3. Reset password
        boolean reset = service.reset_pass("Naveen@paypal", "2345", "9999");
        System.out.println("Password reset status: " + reset);

    }
}