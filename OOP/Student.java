public class Student {
    private String name;
    private double score;
    
    public Student(){
        name = "No name";
        score = 10;
    }

    public void showInfor() {
        System.out.println(name+ " : " + score);
    }
}
