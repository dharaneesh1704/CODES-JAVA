import java.util.ArrayList;
//backtracking
public class SubsetSum 
{
public static void subset(int ind,int arr[],int sum,ArrayList<Integer> res_arr)
    {
        if(ind==arr.length)
        {
            res_arr.add(sum);
            return;
        }

        
        subset(ind+1, arr,sum+arr[ind], res_arr);
        
        subset(ind+1, arr, sum, res_arr);
        
    }

    public static void main(String[] args) 
    {
        int arr[]={1,2,3};
        ArrayList<Integer> res_arr=new ArrayList<>();
        subset(0,arr,0,res_arr);
        System.out.println(res_arr);
    }        
}
