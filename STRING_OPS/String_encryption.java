import java.util.*;

class String_encryption {
    public static void main(String args[]) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] arr = s.split(" ");
        String[] vv = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            char[] temp = arr[i].toCharArray();

            for (int j = 0; j < temp.length; j++) {
                if (temp[j] >= 'a' && temp[j] <= 'z') {
                    temp[j] = (char) ((temp[j] - 'a' -j + temp.length-1) % 26 + 'a');
                }
                else if (temp[j] >= 'A' && temp[j] <= 'Z') {
                    temp[j] = (char) ((temp[j] - 'A' - j +temp.length-1) % 26 + 'A');
                }
            }

            vv[i] = new String(temp);
        }

        for (String x : vv) {
            System.out.print(x + " ");
        }
    }
}
