package conta;

public abstract class Conta {

	private Integer numero;
	private Double saldo;
	
	public abstract void depositar(Double valor);
	public abstract void sacar(Double Valor);
	public abstract Double saldo();
	public abstract Integer numeroDaConta();
	
	
	//Numero
	public Integer getNumero(){
		return numero;
	}
	
	public void setNumero(Integer numero){
		this.numero = numero;
	}
	
	//Saldo
	public Double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(Double saldo){
		this.saldo = saldo;
	}
	
	
	
}
