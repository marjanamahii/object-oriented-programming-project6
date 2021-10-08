package marjana;

public class ArrayCopy {
    public static void main(String[] args){
        //arraycopy
        int a[] = {1, 4, 7, 11};
        int b[] = new int[4];
        b[0] = 77;
        b[1] = 88;
        System.out.println("Value of array A");
        for(int i: a){
            System.out.println(i);
        }
        // src, srcPos, destPos, length
        System.arraycopy(a, 2, b, 2, 2);
        System.out.println("Value of array B after applying arrayCopy");
        for(int i: b){
            System.out.println(i);
        }
        //clone
        int c[] = a.clone();
        System.out.println("Value of array C after applying Clone");
        for(int i: c){
            System.out.println(i);
        }

    }
}
