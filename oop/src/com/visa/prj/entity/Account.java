/**
 * 
 */
package com.visa.prj.entity;

/**
 * This is a dummy comment, and I am curious what it does
 * @author root
 * @version 420.69
 *
 */
public class Account {
	private double balance;
	/**
	 * Method to credit amount into account
	 * @param amount amount to be credited
	 */ 
	public void deposit(double amount) {
		balance += amount;
	}
	/**
	 * Method to get the balance
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}
	
}
