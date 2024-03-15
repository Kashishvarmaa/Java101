import java.util.Scanner;
public class VotingElegible {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int num = sc.nextInt();

        if(num<18){
            System.out.print("Oh no you are not elegible");
        }
        else{
            System.out.print("Yes you are elegible");
        }
    }
}

