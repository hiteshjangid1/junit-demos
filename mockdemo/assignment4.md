# Assignment 4

Model Classes:

Loan [ accNo, name, amt, duration, emi ]

interface LoanDao [ Loan findLoan(int accNo), boolean save(Loan loan) ]

class LoanService [ Loan findLoan(int accNo),void apply(Loan loan)]

Write a test case with Mockito & JUnit to test whether 
   
   You are able to find existing loan: 101, Mehul, 1200000, 5, 12000 

   You are applying a new loan 102, Nirav, 100000, 3, 12000
