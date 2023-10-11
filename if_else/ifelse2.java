import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Your height(m) is: ");
        double height = sc2.nextDouble();
        System.out.print("Your weight(kg) is: ");
        double weight = sc2.nextDouble();

        double BMI = weight/ Math.pow(height, 2);
        System.out.println("Your BMI is: " + BMI);

        if (BMI < 15) {
            System.out.println("You are too skinny");
        } else if(BMI >= 15 && BMI < 16) {
            System.out.println("You are skniny");
        } else if(BMI >=16 && BMI < 18.5) {
            System.out.println("You are slim fit");
        } else if(BMI >= 18.5 && BMI < 25) {
            System.out.println("You are fit");
        } else if(BMI >= 25 && BMI < 30) {
            System.out.println("You are a little fat");
        } else if(BMI >= 30 && BMI < 35) {
            System.out.println("You are fat");
        } else {
            System.out.println("You are too fat");
        }
    }
}
