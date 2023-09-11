public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int s = 0;
        while (i > 0){
            if (i % 2 == 0) {
                i = i/2;
                s++;
            }else {
                i = i - 1;
                s++;
            }
        }System.out.println(s);
    }
}
