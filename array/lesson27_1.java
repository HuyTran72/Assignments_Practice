public class lesson27_1 {
    public static void main(String[] args) {
        String[] mangStr = new String[12];
        int[] mangNguyen2 = new int[7];

        String[] mangStr2 = new String[] {"LOL", "PUBG"};
        int[] mangNguyen3 = new int[] {1,2,4};

        System.out.println(mangStr2[1]);
        System.out.println(mangNguyen3[2]);
        System.out.println(mangStr[1]);

        System.out.println(mangNguyen3.length);


        for(String elements : mangStr2) {
            System.out.println(elements);
        }

        for(int num: mangNguyen3) {
            System.out.println(num);
        }

        for (int i=0; i<mangNguyen2.length; i++) {
            System.out.println(i);
        }

        System.out.println();
        String[] mang6 = new String[] {"Obama", "clinton", "Newyork"};
        int[] mang7 = new int[] {1,2,3,4,5,6,7};
        for(int i=0; i<mang7.length; i++) {
            mang7[i] += 5;
            System.out.println(mang7[i]);
        }

    }
}
