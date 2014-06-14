package Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import conta.ContaCorrente;
import conta.ContaPoupanca;

public class TesteContas {
 
	ContaCorrente cc = new ContaCorrente(new Integer(2241413), new Double(150));
	ContaPoupanca cp = new ContaPoupanca(new Integer(2241413));
	
	
	@Test
	public void abreContaCorrente() {		
		Boolean possuiSaldo = Boolean.FALSE;
		
		if(cc.getSaldo() > 0){
			possuiSaldo = Boolean.TRUE;
		}
		
		assertEquals(Boolean.TRUE, possuiSaldo);
	}
	
	@Test
	public void abreContaPoupanca(){
		assertEquals(new Double(100), cp.saldo());
	}
	
	@Test
	public void sacar(){
		cc.sacar(new Double(50));
		assertEquals(new Double(100), cc.saldo());
	}
	
	@Test
	public void depositar(){
		cc.depositar(new Double(50));
		assertEquals(new Double(200), cc.saldo());
	}
}
