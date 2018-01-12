..............Generate integer coupo............

public class Coupon {

    // return a random coupon between 0 and n-1
    public static int getCoupon(int n) {
        return (int) (Math.random() * n);
    }

    // return number of cards you collect before obtaining one of each of the n types
    public static int collect(int n) {
        boolean[] isCollected = new boolean[n];  // isCollected[i] = true if card type i already collected
        int count = 0;                           // number of cards collected
        int distinct  = 0;                       // number of distinct card types collected

        // repeat until you've collected all n card types
        while (distinct < n) {
            int value = getCoupon(n);            // pick a random card 
            count++;                             // one more card
            if (!isCollected[value]) {           // discovered a new card type
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }

    // test client
    public static void main(String[] args) {
        int n = 10;
        int count = collect(n);
        System.out.println(count);
    } 
} 



******************************************************************************************

