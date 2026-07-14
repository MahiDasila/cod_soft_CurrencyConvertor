import java.util.Scanner;

public class CurrencyConvertor {

    double Dollar_to_Inr = 83.0;
    double Euro_to_Inr = 90.0;
    double Yen_to_Inr = 0.60;

    public double DollarToInr(double dollar) {
        return dollar * Dollar_to_Inr;
    }

    public double InrToDollar(double inr) {
        return inr / Dollar_to_Inr;
    }

    public double EuroToInr(double euro) {
        return euro * Euro_to_Inr;
    }

    public double InrToEuro(double inr) {
        return inr / Euro_to_Inr;
    }

    public double YenToInr(double yen) {
        return yen * Yen_to_Inr;
    }

    public double InrToYen(double inr) {
        return inr / Yen_to_Inr;
    }

    public static void main(String[] args) {

         try(Scanner sc = new Scanner(System.in)) {
        CurrencyConvertor cc = new CurrencyConvertor();

        System.out.println("===== Currency Converter =====");
        System.out.println("Select the choice:");
        System.out.println("1. Dollar to INR");
        System.out.println("2. INR to Dollar");
        System.out.println("3. Euro to INR");
        System.out.println("4. INR to Yen");
        System.out.println("5. Yen to INR");
        System.out.println("6. INR to Euro");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        System.out.print("Enter the Amount: ");
        double amount = sc.nextDouble();

        switch (choice) {

            case 1->
                System.out.printf("Dollar to INR: %.2f%n", cc.DollarToInr(amount));

            case 2->
                System.out.printf("INR to Dollar: %.2f%n", cc.InrToDollar(amount));
            

            case 3->
                System.out.printf("Euro to INR: %.2f%n", cc.EuroToInr(amount));
                

            case 4->
                System.out.printf("INR to Yen: %.2f%n", cc.InrToYen(amount));
                

            case 5->
                System.out.printf("Yen to INR: %.2f%n", cc.YenToInr(amount));
                

            case 6->
                System.out.printf("INR to Euro: %.2f%n", cc.InrToEuro(amount));
                

            default->
                System.out.println("Invalid Choice!");
        }

        sc.close();
         }
    }
}