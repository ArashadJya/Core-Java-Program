class PrintAllPermutationOfString {
    public static void main(String[] args) {
        String s = "ABC";

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < s.length(); k++) {

                    if (i != j && j != k && i != k) {
                        System.out.print("  "+s.charAt(i)
                                + s.charAt(j)
                                + s.charAt(k));
                    }
                }
            }
        }
    }
}

