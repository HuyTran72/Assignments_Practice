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

    //return
    public double countDTB(double Math, double Literature) {
        return ((Math + Literature)/2);
    }


    //get and set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    //toString
    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }


    //Support method and service method
    private boolean checkScore () {
        return this.score >= 24;
    }
    
    


    
}
