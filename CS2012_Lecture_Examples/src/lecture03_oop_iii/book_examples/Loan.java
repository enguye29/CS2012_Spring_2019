package lecture03_oop_iii.book_examples;

public class Loan {
  private double annualInterestRate;
  private int numberOfYears;
  private double loanAmount;
  private java.util.Date loanDate;

  /** Default constructor */
  public Loan() {
    this.annualInterestRate = 2.5;
    this.numberOfYears = 1;
    this.loanAmount = 1000;
  }

  /** Construct a loan with specified annual interest rate,
      number of years and loan amount
    */
  public Loan(double newAnnualInterestRate, int newNumberOfYears,
      double newLoanAmount) {
    this.annualInterestRate = newAnnualInterestRate;
    this.numberOfYears = newNumberOfYears;
    this.loanAmount = newLoanAmount;
    this.loanDate = new java.util.Date();
  }

  /** Return annualInterestRate */
  public double getAnnualInterestRate() {
    return this.annualInterestRate;
  }

  /** Set a new annualInterestRate */
  public void setAnnualInterestRate(double newAnnualInterestRate) {
    this.annualInterestRate = newAnnualInterestRate;
  }

  /** Return numberOfYears */
  public int getNumberOfYears() {
    return this.numberOfYears;
  }

  /** Set a new numberOfYears */
  public void setNumberOfYears(int newNumberOfYears) {
    this.numberOfYears = newNumberOfYears;
  }

  /** Return loanAmount */
  public double getLoanAmount() {
    return this.loanAmount;
  }

  /** Set a newloanAmount */
  public void setLoanAmount(double newLoanAmount) {
    this.loanAmount = newLoanAmount;
  }

  /** Find monthly payment */
  public double getMonthlyPayment() {
    double monthlyInterestRate = this.annualInterestRate / 1200;
    return this.loanAmount * monthlyInterestRate / (1 -
      (Math.pow(1 / (1 + monthlyInterestRate), this.numberOfYears * 12)));
  }

  /** Find total payment */
  public double getTotalPayment() {
    return this.getMonthlyPayment() * this.numberOfYears * 12;
  }

  /** Return loan date */
  public java.util.Date getLoanDate() {
    return this.loanDate;
  }
}
