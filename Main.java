
public class Main {

	public static void main(String[] args) {
		
		Cliente hanne = new Cliente();
		hanne.setNome("Hanne");
				
		// Criando Conta Corrente
		
		Conta cc = new ContaCorrente(hanne);
		Conta poupanca = new ContaPoupanca(hanne);
		
		//Criando Conta Poupanca
		
		cc.depositar((double)200.0);
		cc.transferir((double)200.0 , poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
} 
