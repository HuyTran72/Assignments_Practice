public class assign_19 {
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0;
        int count = 0;
        
        String[] parts = str1.split(" ");

        for(String pt : parts) {
            System.out.println(pt);
            try {
                int num = Integer.parseInt(pt);
                sum += num;
                count++;
            }catch (NumberFormatException e){

            }
        }
        System.out.println();
        System.out.println(sum);
        double mean = sum / count;
        System.out.println(mean);
    }
}
