import java.util.Scanner;

public class RetailPrice {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);


        String cont;
        double cost, retail, rate = 0;
        rate = 2.5;

        //Ask for the Wholesale cost until user enters 0
        do {
            System.out.println("What is the whole sale cost?");
            System.out.println("Enter 0 to quit.");
            cost = input.nextDouble();          //receive int or double
            retail = cost * rate;               //compute retail price
            System.out.println("Retail Price: " + retail);
        } while (cost !=0);
    }
}


