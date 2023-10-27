public class assign_24 {
    public static void main(String[] args) {
        String a = "D:/galailaptrinh/music/remix.mp3";
        String[] arr = a.split("/");

        for(String b: arr) {
            if(b.equals("remix.mp3")) {
                System.out.println(b);
            }
        }
        
    // other way
        int lastSlashIndex = a.lastIndexOf('/');
        System.out.println(lastSlashIndex);
        String fileName = a.substring(lastSlashIndex+1);
        System.out.println(fileName);

        //print "remix"
        int lastDot = fileName.lastIndexOf('.');
        System.out.println(lastDot);
        String nameOnly = fileName.substring(0, lastDot);
        System.out.println(nameOnly);

        
    }
}
