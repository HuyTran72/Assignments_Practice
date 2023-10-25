public class assign_19 {
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0;
        int count = 0;
        String[] parts = str1.split(" ");

        for (String pt1 : parts) {
            System.out.println(pt1);
        }
        try {
            int num = Integer.parseInt(str1);
            sum += num;
            count++;
        } catch (NumberFormatException e){

        }
        double mean = sum/ count;
        System.out.println(sum);
        System.out.println(mean);
    }
}
