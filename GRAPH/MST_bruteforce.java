//naaana podala bharani sir thaa poda sonnaru (this is not the efficient approach and only for the understanding,said by trainer)
public class MST_bruteforce 
{
    public static void main(String[] args) 
    {
        char[] u={'A','A','B'};
        char[] v={'B','C','C'};
        int[] w={4,3,2};
        
        int totalCost=0;
        System.out.println("Minimum cost of graph: ");

        System.out.println(u[1]+" - "+v[1]+" : "+w[1]);
        totalCost+=w[1];

        System.out.println(u[2]+" - "+v[2]+" : "+w[2]);
        totalCost+=w[2];

        System.out.println("the cost of minimum path is : "+totalCost);
    }    
}
