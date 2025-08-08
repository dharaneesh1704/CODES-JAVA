
import java.util.ArrayList;
//backtracking
public class GenerateSubSet 
{
    public static void subset(int ind,int arr[],ArrayList<Integer> temp_arr,ArrayList<ArrayList<Integer>> res_arr,int range)
    {
        if(ind==arr.length && temp_arr.size()==range)
        {
            res_arr.add(new ArrayList(temp_arr));
            return;
        }
        if(ind==arr.length)
            return;

        temp_arr.add(arr[ind]);
        subset(ind+1, arr, temp_arr, res_arr,range);
        temp_arr.remove(temp_arr.size()-1);
        subset(ind+1, arr, temp_arr, res_arr,range);
        
    }

    public static void main(String[] args) 
    {
        int arr[]={1,2,3};
        int range=2;
        ArrayList<Integer> temp_arr=new ArrayList<>();
        ArrayList<ArrayList<Integer>> res_arr=new ArrayList<>();
        subset(0,arr,temp_arr,res_arr,range);
        System.out.println(res_arr);
    }    
}
