import javax.swing.JOptionPane;

public class FiveTwenty {
    public static void main(String[] args) {
       
        double interestrate = 5.000;
        
        String loaninput = JOptionPane.showInputDialog("Loan Amount:");
        double loan = Double.parseDouble(loaninput);
        
        String yearinput = JOptionPane.showInputDialog("Number of Years:");
        int years = Integer.parseInt(yearinput);
        
        System.out.printf("Loan Amount: $%.2f\n", loan);
        System.out.println("Number of Years: " + years);
        System.out.print("Interest Rate\t\tMonthly Payment\t\tTotal Payment\n");
        
        //Amount*annual/(1-1/Math.pow(1+annual, years*12)
        
        
        while(interestrate <= 8){
            System.out.printf("%.3f", interestrate);
            double monthlyinterestrate =  interestrate/ 1200;
            double monthlypayment = loan * monthlyinterestrate / (1-1 /Math.pow(1+monthlyinterestrate, years * 12));
            double totalpayment = monthlypayment * years * 12;
            System.out.print("%\t\t\t");
            double mpo = (monthlypayment * 100)/100.0;
            System.out.printf("%.2f \t\t\t",mpo);
            double tpo = (totalpayment * 100) /100.0; 
            System.out.printf("%.2f\n",tpo);
            interestrate = interestrate + 0.125;
        }
    }
}
