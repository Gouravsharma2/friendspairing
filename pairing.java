public class pairing {
    public static int FP(int n) {
        if (n==1 || n==2) {
            return n;
        }
        int fp1 = FP(n-1);
        int fp2 = FP(n-2);
        int pairways = (n-1) * (fp2);
        int totalways = fp1 + pairways;
        return totalways;
    }
    public static void main (String args[]) {
        System.out.println (FP(7));
    }
}