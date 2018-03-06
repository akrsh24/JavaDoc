package model;
public interface AccountRepositoryI {

	Account loadAccount(String num);
	boolean updateAccount(Account account);
}
