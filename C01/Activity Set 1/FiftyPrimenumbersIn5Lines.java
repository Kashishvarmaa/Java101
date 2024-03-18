/*This example displays the first 50 prime numbers in five lines,
each of which contains 10 numbers. An integer greater than 1 is prime if its only positive divisor is 1 or itself.
 For example, 2, 3, 5, and 7 are prime numbers, but 4, 6, 8, and 9 are not.

The problem can be broken into the following tasks:
• For number = 2, 3, 4, 5, 6, ..., test whether the number is prime.
• Determine whether a given number is prime.
• Count the prime numbers.
• Print each prime number, and print 10 numbers per line.
 */
public class FiftyPrimenumbersIn5Lines {
    public static void main(String[] args) {
        int count=0;
        for (int i = 2; count < 50; i++) {
            int factor = 0;

            for(int j=2;j<i;j++) {
                if (i % j == 0) {
                    factor++;
                    break;
                }
            }
                if(factor == 0){
                    System.out.print(i+" ");
                    count++;
                    if(count%10==0){
                        System.out.println();
                    }
                }

            }
        }
    }

