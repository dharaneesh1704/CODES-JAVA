import java.util.*;
public class Wave 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("enter the array: ");
        for (int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }

        boolean wave1 = true;
        boolean wave2 = true;

        // Check pattern: arr[0] >= arr[1] <= arr[2] >= arr[3] ...
        for (int i = 0; i < len - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] < arr[i + 1]) {
                    wave1 = false;
                    break;
                }
            } else {
                if (arr[i] > arr[i + 1]) {
                    wave1 = false;
                    break;
                }
            }
        }

        // Check pattern: arr[0] <= arr[1] >= arr[2] <= arr[3] ...
        for (int i = 0; i < len - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) {
                    wave2 = false;
                    break;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    wave2 = false;
                    break;
                }
            }
        }

        if (wave1 || wave2)
            System.out.println(true);
        else
            System.out.println(false);
    }
}