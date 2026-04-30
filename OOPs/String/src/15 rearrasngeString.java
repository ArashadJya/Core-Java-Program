import java.util.*;

class Demo
{
    public static void main(String[] args)
    {
        String s = "avcb456JHFDH546ghkkgGFJKMGTJ";

        String num = "";
        String lower = "";
        String upper = "";

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(Character.isDigit(ch))
            {
                num = num + ch;
            }
            else if(Character.isLowerCase(ch))
            {
                lower = lower + ch;
            }
            else if(Character.isUpperCase(ch))
            {
                upper = upper + ch;
            }
        }

        char a1[] = num.toCharArray();
        char a2[] = lower.toCharArray();
        char a3[] = upper.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);
        Arrays.sort(a3);

        String result = new String(a1) + new String(a2) + new String(a3);

        System.out.println(result);
    }
}
