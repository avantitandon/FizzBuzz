public class Reduce {
    public static void main(String[] args)  {
        int k =0;
        int i = 100;
        while (i>0){

            boolean even = i % 2 == 0;
            if (even) {
                i=i/2;

            }
            else {
                i--;
            }
            k++;

        }
        System.out.println(k);
    }
}

