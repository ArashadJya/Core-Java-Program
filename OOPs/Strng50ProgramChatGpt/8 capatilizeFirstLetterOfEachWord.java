 class CapitalizeEachWord {
    public static void main(String[] args) {

        String str = "hello my name is a arashad";

        // Step 1: Split string
        String[] words = str.split(" ");

        String result = "";


        // Step 2: Normal for loop
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {

                String first = words[i].substring(0, 1).toUpperCase() +words[i].substring(1);
//                String rest = words[i].substring(1);

                result = result + first  + " ";
            }
        }
        System.out.println(result);

        // Step 3: Remove extra space
        System.out.println(result.trim());
    }
}

