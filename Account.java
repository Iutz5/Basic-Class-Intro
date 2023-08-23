/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author ianut
 */
public class Account {
    
    // -- member data
    
    private double _balance;
    private final String _accountId;
    
    // -- member function

    // -- Constructor
    public Account(double balance, String accountId){
        _balance = balance;
        _accountId = accountId;
    }
    
    // -- accessor AKA getter
    public double getBalance(){        
        return _balance;
    }
    
    public String getAccountId(){
        return _accountId;
    }
    
    public boolean deposit(double amount){
        _balance += amount;
        return true;
    }
    
    @Override
    public String toString(){
        return "Balance: $" + _balance + "  ID: " + _accountId; 
    }
 
    
}
