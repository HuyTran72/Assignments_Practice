public class Attribute {
    public static void main(String[] args) {
        Student sv1 = new Student();
        Student sv2 = new Student();
        sv1.showInfor();
        sv2.showInfor();

        Student sv3 = new Student("Tom");
        sv3.showInfor();


        Student sv4 = new Student("Chicken", 9.5);
        sv4.showInfor();

        System.out.println(sv4.getName());
        System.out.println(sv4.getScore());


        //Change name
        sv4.setName("White");
        sv4.setScore(27);
        sv4.showInfor();


        //test return
        double dtbsv4 = sv4.countDTB(7.5, 9);
        System.out.println(dtbsv4);

        //test toString
        System.out.println(sv4);

        //support method
        sv4.checkTool();

        //overloading
        double testD = sv4.countDTB(5, 6, 10 );
        System.out.println(testD); 


        double kq = sv4.sumScore(1,2,3,5,6,2.5,16,10);
        System.out.println(kq);
    }
}
