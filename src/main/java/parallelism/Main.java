package parallelism;

public class Main {
    public static void main(String[] args) {

    }
    //Sequential
  static double seqArraySum(double [] X){
        long startTime = System.nanoTime();
        double sum = 0;
        for (int i=0; i<X.length;i++){
            sum+= 1/X[i];
        }
        long timeInNanos = System.nanoTime() - startTime;
        System.out.println("seqArraySum "+timeInNanos+" "+sum);
        return sum;
  }

    // Async and finish
    static double seqArraySum2(double [] X){
        long startTime = System.nanoTime();
        double sum = 0;
        for (int i=0; i<X.length;i++){
            sum+= 1/X[i];
        }
        long timeInNanos = System.nanoTime() - startTime;
        System.out.println("seqArraySum "+timeInNanos+" "+sum);
        return sum;
    }

}
