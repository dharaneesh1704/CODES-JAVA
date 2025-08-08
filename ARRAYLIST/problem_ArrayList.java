import java.util.*;
/*
 * Problem Statement


You are given an integer array nums containing distinct numbers, and you can perform the following operations until the array is empty:


    If the first element has the smallest value, remove it.
    Otherwise, put the first element at the end of the array.


Return an integer denoting the number of operations it takes to make nums empty.


Example 1


Input: 

3

3 4 -1


Output: 

5


Explanation:


Example 2


Input:

4

1 2 4 3


Output:

5


Explanation:


Example 3


Input:

3

1 2 3


Output:

3


Explanation:

﻿
Input format :

The first line contains an integer N, the size of the array nums.

The second line contains N space-separated integers num[i], representing the elements of nums.
Output format :

The output displays an integer denoting the number of operations it takes to make nums empty.


Refer to the sample output for the formatting specifications.
Code constraints :

The given test case will fall under the following constraints:

2 ≤ N ≤ 10

-100 ≤ num[i] ≤100
Sample test cases :
Input 1 :

3
3 4 -1

Output 1 :

5

Input 2 :

4
1 2 4 3

Output 2 :

5

Input 3 :

3
1 2 3

Output 3 :

3
 */

public class problem_ArrayList {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length:");
        int len=sc.nextInt();

        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            int n=sc.nextInt();
            list.add(n);
        }
        

        int count=0;
        while(list.size()!=0)
        {
            int small=Integer.MAX_VALUE;
            for(int i=0;i<list.size();i++)
            {
                small=Math.min(small, list.get(i));
            }

            if(small==list.get(0))
            {
                count++;
                list.remove(0);
            }
            else
            {
                int temp=list.get(0);
                list.remove(0);
                list.add(temp);
                count++;
            }
        }
        System.out.println("The result is : "+count);
    }
    
}
