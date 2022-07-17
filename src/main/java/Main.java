public class Main {



    public static void main(String[] args){

        long startTime, endTime, result;

        startTime = System.nanoTime();
        result = addUpLinearTime(100000);
        endTime = System.nanoTime();
        System.out.println(result);
        System.out.println("Linear time: " + (endTime - startTime));

        startTime = System.nanoTime();
        result = addUpConstantTime(100000);
        endTime = System.nanoTime();
        System.out.println(result);
        System.out.println("Constant time: " + (endTime - startTime));

    }

    static int addUpLinearTime(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum += i;
        }
        return sum;
    }

    static int addUpConstantTime(int n){
        int sum;
        sum = n * (n + 1) / 2;
        return sum;
    }



}
