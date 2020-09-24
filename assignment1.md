#Assignment

Create model class 'Loans'

  int loanAcNum;
  String name;
  Date loanDate;
  double amount;
  double emi;
  int duration;

Create Interface "LoanDAO"
  findLoan(int num);
  findLoanTakenBefore(Date dt)

Test Cases
 1. Test if able to find Loan which exists (101)
 2. Test if returns NULL when loan doesn't exists (103)
 3. Test if able to find loans before 1st April 2019
 4. Test if returns NULL when loans before 1st Jan 2007

 Test Data:
 One record where loan is taken before 1st april 2019
 Loan with accNumber 101 & 102
