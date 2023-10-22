public class lesson26_2 {
    public static void main(String[] args) {
        String s7 = "I am swimming I";
        System.out.println(s7.indexOf("am"));
        System.out.println(s7.lastIndexOf("I"));

        String s9 = "mp3";
        String s10 = "Study.mp4";
        boolean check = s10.contains(s9);
        if(check) {
            System.out.println("Having mp3");
        } else {
            System.out.println("No finding mp3");
        }

        String s11 = "abcdefgh";
        String s12 = s11.substring(4);
        System.out.println(s11);
        System.out.println(s12);


        //trim()
        String s18 = "      I am coder       ";
        String s19 = s18.trim();
        System.out.println(s18);
        System.out.println(s19);


        //while
        String s21 = "      I am coder       ";
        System.out.println(s21.length());
        while (s21.endsWith(" ")) {
            s21 = s21.substring(0, s21.length()-1);
        }
        System.out.println(s21);
        System.out.println(s21.length());
    }
}
