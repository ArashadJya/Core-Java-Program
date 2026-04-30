 class Manacher {

    public static String longestPalindrome(String s) {

        StringBuilder t = new StringBuilder("#");

        for(int i=0;i<s.length();i++)
        {
            t.append(s.charAt(i)).append("#");
        }

        String str = t.toString();

        int n = str.length();

        int[] p = new int[n];

        int center = 0;
        int right = 0;

        for(int i=0;i<n;i++)
        {

            int mirror = 2*center-i;

            if(i<right)
            {
                p[i] = Math.min(right-i,p[mirror]);
            }

            int left = i-(p[i]+1);
            int r = i+(p[i]+1);

            while(left>=0 && r<n && str.charAt(left)==str.charAt(r))
            {
                p[i]++;
                left--;
                r++;
            }

            if(i+p[i]>right)
            {
                center=i;
                right=i+p[i];
            }

        }

        int maxLen=0;
        int centerIndex=0;

        for(int i=0;i<n;i++)
        {
            if(p[i]>maxLen)
            {
                maxLen=p[i];
                centerIndex=i;
            }
        }

        int start=(centerIndex-maxLen)/2;

        return s.substring(start,start+maxLen);
    }

    public static void main(String[] args)
    {
        String s="babadacca";
        System.out.println(longestPalindrome(s));
    }
}
