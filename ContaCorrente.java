
public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) { super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

	@Override
	public void transferir(double valor, IConta contaDestino) {
		
	}
}
