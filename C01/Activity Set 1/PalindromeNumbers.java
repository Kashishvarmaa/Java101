/* Use nested loops to print the following output:
       1
      212
     32123
    4321234
   543212345
Your program prints five lines. Each line consists of three parts.
The first part comprises the spaces before the numbers;
 the second part, the leading numbers, such as 3 2 1 on line 3;
  and the last part, the ending numbers, such as 2 3 on line 3.
 */
import java.util.Scanner;
public class PalindromeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the tree: ");
        int len = sc.nextInt();
        for(int i =1;i<=len;i++){
            for(int j =1;j<=len-i;j++) {
                System.out.print(" ");
            }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
            }
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
        }
    }
}

