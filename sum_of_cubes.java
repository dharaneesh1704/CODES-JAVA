import java.util.*;
class  sum_of_cubes{
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the number 1:");
        int a = sc.nextInt();
        System.out.println("Enter the number 2:");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("Non-acceptable value");
        }
        else{
            int count =0;
            for (int i = a; i <b+1 ; i++) {
                count+=(i*i*i);
                
            }
            System.out.println(count);


        }
        

    }
}