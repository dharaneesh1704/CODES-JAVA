import java.util.*;
public class Sample1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        ArrayList<Object> list=new ArrayList<Object>();
        //add
        list.add(10);
        list.add(100);
        list.add("dharaneesh");
        list.add(4.44444);
        
        System.out.println("get statement");
        //size
        for(int i=0;i<list.size();i++)
        {
            //get
            System.out.println(list.get(i));
        }

        int arr[]={1,2,3,4};
        ArrayList<Integer> l1=new ArrayList<Integer>(999);
        System.out.print("empty Array list : ");
        System.out.println(l1.size());

        //isEmpty
        System.out.println("is empty for list : "+ list.isEmpty());
        System.out.println("is empty for l1 : "+l1.isEmpty());

        //contains
        System.out.println("contains on list: "+list.contains(100));
        System.out.println("contains in the list : "+list.contains(888));

        //indexOf
        System.out.println("indexOf");
        System.out.println(list.indexOf("Dharaneesh"));;
        System.out.println(list.indexOf(100));

        //lastIndexOf
        //returns the last occurance of the object
        list.add(100);
        System.out.println("lastIndexOf");
        System.out.println(list.lastIndexOf(100));

        //set
        list.set(4, "VSSB COLLEGE");
        System.out.println(list);

        //add(int n,int object)
        list.add(2,99999);
        System.out.println(list);

        //clone
        ArrayList<Integer> list2 =new ArrayList<Integer>();
        list2=(ArrayList)list.clone();
        System.out.print("cloned list 2 : ");
        System.out.println(list2);

        //remove
        System.out.println("before remove : "+list);
        list.remove(2);
        System.out.println("after remove : "+list);

        // remove using the object value
        System.out.println("remove using the object value");
        System.out.println("before the removal of the elemnt 100 : "+list);
        list.remove(Integer.valueOf(100));
        System.out.println("after the removal of the elemnt 100 : "+list);

        //clear
        list2.clear();
        System.out.println("list 2 after the clear : "+list2);

        //addAll
        ArrayList<Object> temp =new ArrayList<Object>();
        System.out.print("return true when addall works : "+temp.addAll(list));
        System.out.println();
        System.out.println(temp);

        //addAll using the index
        ArrayList<Object> temp2=new ArrayList<Object>();
        System.out.println("temp  : " + temp);
        temp2.add(10);
        temp2.add(66);
        temp2.add(99);
        temp2.addAll(2,temp);
        System.out.println("temp2 after the index 2 : "+temp2);

        //retainAll used to remove the elements that are not specified
        System.out.println("before retain ---------------------");
        list.add(99);
        list.add(10);   
        list.add("kumar");
        temp.add("sjsadn");
        System.out.println(list+"  "+temp);
        list.retainAll(temp);
        System.out.println("after retain : "+list);

        //traverse the arraylist using the iterator
        Iterator itr=list.iterator();
        System.out.println("print the arraylist using the Iterator------------------------");
        while (itr.hasNext()) { 
            System.out.print(itr.next()+" ");
        }

        
        
    }
}
