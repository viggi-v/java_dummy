/**
 * 
 */
package com.visa.prj.client;

import com.visa.prj.entity.Account;

/**
 * @author root
 *
 */
public class AccountClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Account userAccount = new Account();
		userAccount.deposit(10);
		
		System.out.println("Balance in user account : ");
		System.out.println(userAccount.getBalance());
	}

}
