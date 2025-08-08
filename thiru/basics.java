import java.util.*;
class Basics
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        boolean flag = false;
        int arr[][] = new int[row][col];
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++)
            {
                if(arr[i][j] != arr[i][j])
                flag = true;
            }

        }if(flag == true )
        System.out.print("True");
        else
        System.out.print("False");
    }
}