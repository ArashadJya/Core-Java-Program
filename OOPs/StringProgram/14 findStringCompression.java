 class findStringCompression {

    public static String compress(String str) {

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i +1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i));
                result.append(count);
                count = 1;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "aabcccccaaa";
        String output = compress(str);

        System.out.println("Compressed String: " + output);
    }
}

