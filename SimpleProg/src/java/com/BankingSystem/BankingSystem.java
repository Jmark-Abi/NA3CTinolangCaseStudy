/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BankingSystem;

/**
 *
 * @author jm
 */
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class BankingSystem {
    
    private int money;
    private int balance;
    private int loanMoney;
    private int durationPayment;
    
    //Fabros, John Mark
    //1
     @WebMethod
     public void setWithdraw(int money){
         this.money = money;
     }
     
     //2
     @WebMethod
     public int Withdraw(){
         if (balance == 0 || balance < money){
             System.out.println("Not enough balance to withdraw");
         } else {
              balance -= money;
         }
         return balance;
     }
     
     //Viray,Wilson
     //3
     @WebMethod
     public void checkBalance_Transaction(){
        System.out.println("Good Day Ma'am/Sir your current balance is: "+ balance);
     }
    
    //Barnachea, Necie
    //4
    @WebMethod
    public void setTransferMoney(int money){
        this.money = money;
    }
    //5
    @WebMethod
    public void TransferMoney(){
        if(balance == 0 || balance < money){
            System.out.println("You dont have enough balance to transfer");
        }
        else{
            balance -= money;
            System.out.println("You successfully transferred: "+ money);
            System.out.println("your current balance now is: "+ balance);
        }
    }
    
     //Custodio, Rafael
    //6
    @WebMethod
    public void setLoan(int loanMoney){
        this.loanMoney = loanMoney;
    }
    //7
    @WebMethod
    public void loan(){
            balance = loanMoney + money;
            System.out.println("Your current balance is: " + balance);
    }
    
    //Valencia, Serge B.
    //8
    @WebMethod
    public void setDeposit(int money){
        this.money = money;
    }
    //9
    @WebMethod
    public int Deposit(){
        if ( money < 0){
             System.out.println("Invalid Input");}
          else {
              balance += money;        
        }
        return balance;
    }
}
     @WebMethod
    public double interest(){
        double interest = (loanMoney * 0.05) * durationPayment;
        return interest;
    }
    
    @WebMethod
    public void getPaymentDuration(int durationPaymet){
        this. durationPayment = durationPayment;
    }
