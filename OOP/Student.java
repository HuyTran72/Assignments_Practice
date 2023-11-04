public class Student {
    private String name;
    private double score;
    
    public Student(){
        name = "No name";
        score = 10;
    }
    
    public Student(String name){
        this.name = name;
    }

    

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public void showInfor() {
        System.out.println(name+ " : " + score);
    }
}
