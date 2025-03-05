public class SPsalary {
    public static void main(String[] args) {

        //predefined values
        double baseSalary = 3000.00;
        int noOfServiceYears = 7;
        double totalSales = 11000.00;

        // bonus calculations
        double bonus = 0;
        if (noOfServiceYears <= 5) {
            bonus = 10 * noOfServiceYears;
        } else {
            bonus = 20 * noOfServiceYears;

            // additional bonus calculation
            double additionalBonus = 0;
            if (totalSales < 5000)
            additionalBonus = 0;
            else if (totalSales>= 5000 && totalSales > 10000)
                additionalBonus = totalSales * 0.03;
            else additionalBonus = totalSales * 0.06;

            // paycheck calculations
            double payCheck = 0;
            payCheck = baseSalary + bonus + additionalBonus;

            // print out all the values
            System.out.printf("Base Salary: $%.2f\n", baseSalary);
            System.out.printf("Bonus: $%.2f\n", bonus);
            System.out.printf("Additional Bonus: $%.2f\n", additionalBonus);
            System.out.printf("Total Sales: $%.2f\n", totalSales);
            System.out.println("Years of Service:" + noOfServiceYears);
            System.out.printf("Total Paycheck: $%.2f\n", payCheck );
        }
    }
}