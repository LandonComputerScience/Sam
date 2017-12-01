import java.util.Scanner;

public class CoinCounter {
    //Takes an input of a integer and outputs all possible combonations of coins, quarter, dime, nickle, penny, that add up to that amount.
    public static void main(String[] args)

    {
        int num_25 = 0;
        int num_10 = 0;
        int num_5 = 0;
        int num_1 = 0;

        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        for (int quarter = 0; quarter * 25 <= amt; quarter++) {
            num_25 = quarter;
        }

        for (int dime = 0; dime * 10 <= (amt - num_25*25); dime++) {
            num_10 = dime;
        }
        for (int nickle = 0; nickle * 5 <= (amt - num_25*25 - num_10*10); nickle++) {
            num_5 = nickle;
        }
        for (int penny = 0; penny <= (amt - num_25*25 - num_10*10 - num_5*5); penny++) {
            num_1 = penny;
        }
        System.out.println(Integer.toString(num_25) + " Quarters, " + Integer.toString(num_10) + " Dimes," + Integer.toString(num_5) + " Nickles," + Integer.toString(num_1) + " Pennies");



    }
}