package conta;


public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Integer numero){
		super.setNumero(numero);
		super.setSaldo(new Double(100));
	}

	@Override
	public void depositar(Double valor) {
		super.setSaldo(super.getSaldo() + valor);
	}

	@Override
	public void sacar(Double valor) {
		// TODO Auto-generated method stub
	}

	@Override
	public Double saldo() {
		return super.getSaldo();
	}

	@Override
	public Integer numeroDaConta() {
		// TODO Auto-generated method stub
		return null;
	}

}
