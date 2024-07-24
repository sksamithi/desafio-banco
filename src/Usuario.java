public class Usuario {
    public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Thais Vieira");
		
		Conta corrente = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		corrente.depositar(100);
		corrente.transferir(100, poupanca);
		
		corrente.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
