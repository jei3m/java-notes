public class Salary {
    public static void main(String[] args) {
        // Employee Info
        String name = "Michael";
        double monthlyGrossPay = 0;
        double payPerDay = 1666.67; // 1666.67 * 21 = 35k

        // Deductions
        double pagIbig = 200.00; // 10%
        double wTax = 0.1; // 10%
        double sssContrib = 0.045;

        double wTaxDeductions = 0;
        double sssDeductions = 0;

        double netpay = 0;

        // Solve monthly salary considering 4 days unpaid leave
        monthlyGrossPay = payPerDay * 17;

        // Solve for deductions
        // Get 10% of Monthly Gross Pay
        wTaxDeductions = monthlyGrossPay * wTax;
        sssDeductions = monthlyGrossPay * sssContrib;

        // Solve for net pay
        netpay = monthlyGrossPay - sssDeductions - wTaxDeductions - pagIbig;

        System.out.println("Name: " + name);
        System.out.println("Gross Pay: " + monthlyGrossPay);
        System.out.println("Deductions:");
        System.out.println("SSS: " + -sssDeductions);
        System.out.println("PAGIBIG: " + -pagIbig);
        System.out.println("WTAX: " + -wTaxDeductions);
        System.out.println("Net Pay: " + netpay);
    }
}
