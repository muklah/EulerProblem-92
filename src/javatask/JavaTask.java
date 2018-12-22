package javatask;

/**
 *
 * @author user-pc
 */
public class JavaTask {

    // to count number of 89
    static int count = 0; // O(1)

    // main method
    public static void main(String[] args) {

        int output = 0; // O(1)

        // loop to check numbers generated from 1 to 10000000
        // O(n)
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
        int result = CheckingDigits(num); // O(1)
        
        // endless loop
        for (;;) { // undefined O(infinte)

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
        String strNum = "" + num; // O(1)
        int squareSum = 0; // O(1)

        // loop throught digits of each number
        for (int i = 0; i < String.valueOf(num).length(); ++i) { // O(n^2)
            int digit = Integer.parseInt(String.valueOf(strNum.charAt(i))); // O(1)
            
            // find square of each digit and sum squares of digits
            squareSum += (digit * digit);
        }
        
        // return new number generated
        return squareSum;
    }

}

//Total Complexity Time = O(1)+O(1)+O(n)+O(1)+O(1)+O(1)+O(n^2)+O(1)
//                      = O(6+n+n^2)