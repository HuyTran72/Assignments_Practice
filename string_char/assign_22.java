public class assign_22 {
    public static void main(String[] args) {
        String a = "toi cham hoc toi chiu kho toi dep zai";
        String[] arr = a.split(" ");
        int count = 0;
        for(String b: arr) {
            if(b.equals("toi")) {
                count++;
            }
        }

        System.out.println("The number of times the word toi appears in a is: " + count);
    }
} 
