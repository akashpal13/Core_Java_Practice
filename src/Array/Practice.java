package Array;

public class Practice {
    public static void main(String[] args) {
        int[][] a=new int[2][3];
        System.out.println(a); //  --> [[I@65ab7765
        System.out.println(a[0]); // -->  [I@1b28cdfa
        System.out.println(a[0][0]); // -->  0


        int [][] b= new int[2][];
        System.out.println(b);  // --> [[I@eed1f14
//        System.out.println(b[0]); // --> null pointer expection
//        System.out.println(b[0][0]); // --> null

//        int[] c= new int[3];
//        c[0]=10;
//        c[1]=20;
//        c[2]=30;

//        System.out.println(c[1]);

        int[] c={10,20,30};
        char[] ch={'a','e','i','o','u'};
        String[] s={"Banana","Mango","Potato","tomato"};
        int[][] d={{10,20,30},{40,50}};
        System.out.println(d.length);
        System.out.println(d[0].length);
        System.out.println(d[1].length);

    }
}
