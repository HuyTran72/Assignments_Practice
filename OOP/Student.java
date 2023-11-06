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

    public double countDTB(double math, double literature, double engligh) {
        return ((math + literature + engligh)/3);
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

    //service method
    public void checkTool () {
        if(checkScore()) {
             System.out.println("Valid Score");
        } else {
            System.out.println("Check again");
        }
    }

    //parametter list
    public double sumScore(double ... arr) {
        double sum = 0;
        for(double x: arr) {
            sum+=x;
        }
        return sum;
    }

    
    


    
}
