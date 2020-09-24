# JUNit Test Demo 4
1.  Create a new Java Project `DemoApp4`
2.  Add JUnit 4 into Build Path
    Right click on project > Properties > Java Build Path > Libraries
    > Add Library > Choose JUnit 4 > Ok/Finish

3.  Create a new Source folder "tests"
    Right click on project > New > Source folder > "tests"

4.  Right click "src" folder > New > Java Class

    ```java
    package com.mahendra;
    
    public class Account {
	private int accNumber;
	private String userName;
	private double balance;
	//default should be TRUE
	private boolean active;
	
        public Account(int accNumber,String userName, double balance) {
            this.accNumber = accNumber;
            this.userName = userName;
            this.balance = balance;
            this.active = true;
        }

        
        public int getAccNumber() {
            return accNumber;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

        public String getUsername() {
            return this.userName;
        }
        
        public double getBalance() {
            return balance;
        }
        
        public boolean isActive() {
            return active;
        }
    }

    ```

5.  Create an Interface `ProductDAO` inside 'src' folder

    ```java
    package com.mahendra.daos;

    import com.mahendra.Account;

    public interface AccountDAO {
        
        public void save(Account account);
        
        public Account find(int accNumber);
        
        public void delete(Account account);
    }
    ```

6.  