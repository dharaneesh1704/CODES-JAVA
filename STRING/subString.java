public class subString {
    public static void main(String[] args) {
        String s="abcde";
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<s.length();j++)
            {
                String sub="";
                for(int k=i;k<=j;k++)
                {
                    sub+=s.charAt(k);
                }
                if(sub.length()!=0)
                    System.out.println(sub);
            }
        }
    }
}
