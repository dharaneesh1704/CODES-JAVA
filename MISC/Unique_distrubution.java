// You are using Java
/*
 * Problem Statement 

Lynda has three children. She wants to distribute N candies among all three in such a way that exactly one child gets the maximum number of candies among all three and each child gets at least one candy. The task is to find the total number of ways to distribute N candies among the three children.

Example 

Input

6

Output

9

Explanation

There are 9 ways to distribute 6 candies [1, 1, 4], [1, 4, 1], [4, 1, 1], [1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 2, 1] and [3, 1, 2].

[2, 2, 2] is not a valid distribution because three children will be getting the maximum number of candies i.e. 2.
Input format :

The first line of the input is an integer value that represents the number of candies.
Output format :

The output is an integer value that represents the number of ways to distribute the candies.
Sample test cases :
Input 1 :

6

Output 1 :



 */
import java.util.*;
class Unique_distrubution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        HashSet<List<Integer>> set=new HashSet<>();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                for(int k=1;k<=n;k++)
                {
                    if((i+j+k==n))
                    {
                        int n1=Math.max(i,j);
                        int max=Math.max(n1,k);
                        int c=0;
                        if(i==max)
                            c++;
                        if(j==max)
                            c++;
                        if(k==max)
                            c++;
                        int equal=0;
                        if(i==j)
                            equal++;
                        if(j==k)
                            equal++;
                        if(i==k)
                            equal++;
                        if(c==1 && equal!=3)
                        {
                            
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(i);
                        list.add(j);
                        list.add(k);
                        set.add(list);
                        
                        count++;
                        }
                    }
                }
            }
        }
       System.out.println(set);
        //System.out.println(count);
        System.out.println(set.size());
    }
}