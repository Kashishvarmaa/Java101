/*You have just started a sales job in a department store. Your pay consists of a base salary and a commission.
The base salary is $5,000. The scheme shown below is used to determine the commission rate.
Sales Amount          Commission Rate
$0.01–$5,000            8 percent
$5,000.01–$10,000      10 percent
$10,000.01 and above   12 percent
Your goal is to earn $30,000 in a year.
Write a program that will find out the minimum amount of sales you have to generate in order to make $30,000.
 */
public class MinimumAmountOfSales {
    public static void main(String[] args) {
        double base = 5000;
        double target = 30000;
        double current = base;
        double sales = 0;
        while (current < target) {
            double commissionR;
            if (sales >= 0.01 && sales <= 5000) {
                commissionR = 0.08;
            } else if (sales > 5000.01 && sales <= 10000) {
                commissionR = 0.1;
            } else {
                commissionR = 0.12;
            }
            double commission = sales * commissionR;
            current = base + commission;
            sales += 0.01;
        }
        System.out.print("To earn "+ target+ " we need to make sales of "+ sales);
    }
}
