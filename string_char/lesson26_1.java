public class lesson26_1 {
    public static void main(String[] args) {
        String s = "LOL" + "\nPARK";
        System.out.println(s);

        StringBuilder tr = new StringBuilder();
        tr.append("Hello, ");
        tr.append("Starting Coding");
        System.out.println(tr);

        //insert
        tr.insert(2,"obama");
        System.out.println(tr);

        //delete ---> start to (end-1)
        tr.delete(2, 4);
        System.out.println(tr);

        //length
        System.out.println(tr.length());
    }
}
