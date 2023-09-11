public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int b = 0;
        while (1000 > i) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3) {
                b++ ;
            }else if (divisibleBy5) {
                b++ ;
            }
            i++ ;

        }System.out.println(b);
    }
}
