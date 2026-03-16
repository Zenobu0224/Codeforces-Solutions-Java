import java.util.Scanner;

public class HitLottery {

    static long withdraw(long n) {
        long minNumBills = 0;

        while(n > 0) {

            if(n >= 100) {
                minNumBills = minNumBills + (n/100);
                n = (n%100);
            } else if(n >= 20) {
                minNumBills = minNumBills + (n/20);
                n = (n%20);
            } else if(n >= 10) {
                minNumBills = minNumBills + (n/10);
                n = (n%10);
            } else if(n >= 5) {
                minNumBills = minNumBills + (n/5);
                n = (n%5);
            } else {
                minNumBills = minNumBills + n;
                n -= n;
            }

        }

        return minNumBills;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        long n = s.nextLong();

        System.out.println(withdraw(n));

        s.close();

    }
}
