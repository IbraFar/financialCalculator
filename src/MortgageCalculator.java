public class MortgageCalculator {
    int principal;
    double interestRate;
    int loanLength;


    public MortgageCalculator(int principal, double interestRate, int loanLength){
        this.principal = principal;
        this.interestRate = interestRate;
        this.loanLength = loanLength;
    }
    public double monthlyPayment(){
        double monthlyInterestRate = interestRate / 12 / 100;
        double exponentCalculation = (Math.pow((1 + monthlyInterestRate),loanLength));
        double interestTimesExpCalc = monthlyInterestRate * (exponentCalculation);
        double numerator = principal * interestTimesExpCalc;
        double denominator = exponentCalculation -1;
        return  numerator / denominator;
    }

    public double totalInterestPaid(double monthlyPayment){
        return (monthlyPayment * loanLength) - principal;
    }


    //Mortgage Calculator:
//        Monthly Payment: monthlyPayment = (principal * interestRate * ((1 + interestRate)^months)) / (((1 + interestRate)^months) - 1)
//        Total Interest Paid: totalInterest = (monthlyPayment * months) - principal
//        Future Value Calculator:
//        Future Value: futureValue = deposit * (1 + interestRate)^years
//        Total Interest Earned: totalInterest = futureValue - deposit
//        Present Value Calculator:
//        Present Value: presentValue = monthlyPayout * ((1 - (1 + interestRate)^(-years*12)) / interestRate)
}
