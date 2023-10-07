package strings;

public class pali {
    public static void main(String[] args) {
        String s = "AmA";
        String st = "";
        char ch;
        for (int i = s.length() - 1; i >= 0; i--) {
            ch = s.charAt(i);
            st += ch;
        }
        if (s.equals(st))
        {
            System.out.println("Yes");
        System.out.println("This is palindrome\n");
    }
        else
            System.out.println("No");
    }
}
