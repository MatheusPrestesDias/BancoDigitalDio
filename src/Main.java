
public class Main {

	public static void main(String[] args) {
		Cliente dias = new Cliente();
		dias.setNome("Dias");
		
		Conta cc = new ContaCorrente(dias);
		Conta poupanca = new ContaPoupanca(dias);
		
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
