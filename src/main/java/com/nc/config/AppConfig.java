package com.nc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nc.model.Account;
import com.nc.model.ClosedAccount;
import com.nc.model.CurrentAccount;
import com.nc.model.SavingAccount;

@Configuration
public class AppConfig {
	
	@Bean("saving")
	public Account getSavingAccount() {
		return new SavingAccount();
	}
	
	@Bean("current")
	public Account getCurrentAccount() {
		return new CurrentAccount();
	}
	
	@Bean("closed")
	public Account getClosedAccount() {
		return  new ClosedAccount();
	}
}
