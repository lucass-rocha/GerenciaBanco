package entities;

public class BankAccount {

		private String name;
		private Long cpf;
		private Double balance;
		
		public BankAccount() {
		}
		
		public BankAccount(String name, long cpf, double balance) {
			this.name = name;
			this.cpf = cpf;
			this.balance = balance;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getCpf() {
			return cpf;
		}

		public void setCpf(long cpf) {
			this.cpf = cpf;
		}

		public Double getBalance() {
			return this.balance;
		}

		public void setBalance(Double balance) {
			this.balance = balance;
		}
		
		public void deposit(Double value) {
			this.balance += value;
		}
		
		public void withdraw(Double value) {
			this.balance -= value;
		}
}
