//hacker rank stmt love letter mystry
public class love_letter_mystry 
{
    public static void main(String[] args) 
    {
        
    String s="abcd abc cba";
    String arr[]=s.split(" ");

    for(int i=0;i<arr.length;i++)
    {
        char c[]=arr[i].toCharArray();
        int count=0;
        for(int j=0;j<c.length;j++)
        {
            char p1=c[j];
            char p2=c[c.length-1-j];

            int sub=p1-p2;
            if(j<(c.length-1-j))
                count+=Math.abs(sub);
        }
        System.out.println(count);
    }    
    }
}
