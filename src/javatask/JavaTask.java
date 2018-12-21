package javatask;

/**
 *
 * @author user-pc
 */
public class JavaTask {

    // to count number of 89
    static int count = 0;

    // main method
    public static void main(String[] args) {

        int output = 0;

        //loop to check numbers generated from 1 to 10000000
        for (int i = 1; i < 10000000; ++i) {
            int num = i;
            // call method of CheckingNumber
            output = CheckingNumber(num);
        }
        // print the counter of 89
        System.out.println("number of starting number that reached to 89 is= " + output);
    }

    // method to check each number
    public static int CheckingNumber(int num) {

        // call method of CheckingDigits
        int result = CheckingDigits(num);
        
        // endless loop
        for (;;) {

            if (result == 89) {
                count++;
                break;
            } else {
                result = CheckingDigits(result);
                if (result == 1) {
                    break;
                }
            }
        }
        // return count of 89
        return count;
    }

    // method to check each digit of number
    public static int CheckingDigits(int num) {

        // turn int number to string
        String strNum = "" + num;
        int squareSum = 0;

        // loop throught digits of each number
        for (int i = 0; i < String.valueOf(num).length(); ++i) {
            int digit = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            
            // find square of each digit and sum squares of digits
            squareSum += (digit * digit);
        }
        
        // return new number generated
        return squareSum;
    }

}
