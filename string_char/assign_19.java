public class assign_19 {
    public static void main(String[] args) {
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0;
        int count = 0;
        String[] parts = str1.split(" ");

        for (String arr_parts : parts) {
            System.out.println(arr_parts);
            try {
                int num = Integer.parseInt(arr_parts);
                sum += num;
                count++;
            }catch(NumberFormatException e){
                 
            }
        }
        double mean = sum / count;
        System.out.println("The sum is: " + sum);
        System.out.println("The mean is: " + mean);
    }
}
