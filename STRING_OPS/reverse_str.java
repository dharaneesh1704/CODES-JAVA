class reverse_str
{
    public static void main(String[] args) {
        
        String s ="hello";
        StringBuilder a = new StringBuilder(s);
        a.reverse();
        System.out.println(a.toString());
    }
}