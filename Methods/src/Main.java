public class Main {

    //parameter: positive and perfect square
    //if method does not find sqrt, return -1
    //root force/ guess and check
     static double squareroot(double number) {
         double epsilon = .01;
         double ans = 0;
         double increment = 0.001;
         int count = 0;
         while (Math.abs(ans * ans - number) > epsilon) {
             ans += increment;
             count++;
         }
         if (Math.abs(ans * ans - number) < epsilon){
             System.out.println(count + ans);
            return ans;
         }
         else {
             System.out.println("failed");
             return ans;
         }
     }
    public static void main(String[] args){
        System.out.println(squareroot(9));
    }
}
