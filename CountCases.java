public class CountCases {
    public static void countUpperLower(String text) {
        int upper= 0;
        int lower= 0;
        for (int i= 0; i<text.length();i++) {
            char ch=text.charAt(i);

            if (ch>='A' && ch<='Z') {
                upper=upper+1;
            }

            if (ch>='a' && ch<='z') {
                lower=lower+1;
            }
        }

        System.out.println("Uppercase letters: " +upper);
        System.out.println("Lowercase letters: " +lower);
    }

    public static void main(String[] args) {
        String input = "HeLlo World";
        countUpperLower(input);
    }
}
