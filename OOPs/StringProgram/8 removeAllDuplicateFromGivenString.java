 class RemoveDuplicate {
    public static void main(String[] args) {

        String s = "arashad";
        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // check karte hai ki result me ye already ye hai ya nahi
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}
