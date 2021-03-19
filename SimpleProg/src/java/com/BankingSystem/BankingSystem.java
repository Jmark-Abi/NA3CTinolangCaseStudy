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
    
     @WebMethod
     public void setWithdraw(int money){
         this.money = money;
     }
     
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
     public void checkBalance_Transaction(){
        System.out.println("Good Day Ma'am/Sir your current balance is: "+ balance);
     }
}
