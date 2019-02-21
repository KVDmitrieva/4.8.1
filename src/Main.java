

public class Main {

    public static void main(String[] args) {

        int a[] = new int[3];
        a[0] =1; a[1]=2; a[2] = 3;


        int b[] = new int[3];
        b[0] =4; b[1]=2; b[2] = 3;
        isSort(a);
        isSort(b);
    }
    public static void isSort(int[] c){
        int v = 0;
        int x = 0;
        for (int i = 0; i < c.length-1; i++){
            if(c[i]<=c[i+1]){
                v++;
            }
            if(c[i]>=c[i+1]){
                x++;
            }}
        if(x==c.length-1||v == c.length-1) System.out.println("Array is sorted");
        else System.out.println("Array is not sorted");

    }

}
