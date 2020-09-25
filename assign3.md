# Assignment 3

Create a [regular] class `InterestRates` with just one method:

```java
public double findRateFor(String loanType){
    switch(loanType){
        case "home":
        return 9.8;
        case "personal":
        return 14.5;
        default:
        return 10;
    }
}
```

Write A Parameterized TestCase with following data:

Input| Expected Output
-----|----------------
home | 9.8 
personal | 14.5
gold | 12
appliances | 8
other | 10