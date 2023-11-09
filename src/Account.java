
public class Account implements InterfaceBankAccount{

	// class variables
		String accountName;
	    int accountNum;
	    int balance;
	    
	    //default constructor for Account
	    Account()
	    {
	    	this.accountName="EMPTY";
	    	this.accountNum=0;
	    	this.balance=0;
	    }
	    
	    //overloaded constructor for Account
	    Account(String name, int num,int amt)
	    {
	            accountName=name;
	    	    accountNum=num;
	            balance=amt;
	    }
	    //make a deposit to the balance
	    public void deposit(int amt)
	    {
	    	    balance=balance+amt;
	    }
	    //make a withdrawal from the balance
	    public void withdraw(int amt)
	    {
	    	    balance=balance-amt;
	    }
	    //modifier to set the accountName
	    public void setAccountName(String name)
	    {
	    	    accountName = name;
	    }
	  //modifier to set the accountnumber
	    public void setAccountNum(int num)
	    {
	    	    accountNum = num;
	    }
	  //modifier to set the balance
	    public void setBalance(int num)
	    {
	    	    balance = num;
	    }
	  //accessor to get the accountName
	    public String getAccountName ( ) {
	    	 
	    	return accountName;
	    }
	    
	  //accessor to get the accountnumber
	    public int getAccountNum ( ) {
	   	 
	    	return accountNum;
	    }
	  //accessor to get the account balance
	    public int getBalance ( ) {
	      	 
	    	return balance;
	    }
	    
	    //print method 
	    public void print() {
	        System.out.println(
                    "\nBank Name : " + getBankName() +
                    "\nAccount Holder : " + accountName +
                    "\nAccount Number : " + accountNum +
                    "\nAccount balance: " + balance);
            }//end method print;


    @Override
    public String getBankName() {
        return InterfaceBankAccount.BANK;
    }//end method getBankName
    
}
