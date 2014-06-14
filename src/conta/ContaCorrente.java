package conta;


public class ContaCorrente extends Conta{

	
	public ContaCorrente(Integer numero, Double saldo){
		super.setNumero(numero);
		super.setSaldo(saldo);
	}
	
	
	@Override
	public void depositar(Double valor) {
		super.setSaldo(super.getSaldo() + valor);
	}

	@Override
	public void sacar(Double valor) {
		super.setSaldo(super.getSaldo() - valor);
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
