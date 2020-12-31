import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long T = scan.nextLong();
        for(int i=0; i<T; i++) {
            long N = scan.nextLong();
            long K = scan.nextLong();
            long S = scan.nextLong();
            long sol = Math.min(K+N, K+(K-S)+(N-S));
            System.out.println("Case #"+(i+1)+": "+sol);
        }
    }
}
