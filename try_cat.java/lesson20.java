public class lesson20 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        

        try {
            int c = a / b;
            System.out.println("c = " + c );
        }
        catch (Exception ex) {
            System.out.println("Error-Error-Error-Error-Error");
            ex.printStackTrace();
        }
        finally {
            System.out.println("RUN CODE");
        }
        System.out.println("Print code");
    }
}