package projeto;

public class ContaPessoaFisica extends Conta{
	
	


	private String cpf;
	private String rg;
		
	public ContaPessoaFisica(String nome, String numero_celular, String email, String senha, String cpf, String rg) {
		super(nome, numero_celular, email, senha);
		this.cpf= cpf;
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "ContaPessoaFisica [cpf=" + cpf + ", rg=" + rg + ", nome=" + nome + ", numero_celular=" + numero_celular
				+ ", email=" + email + ", senha=" + senha + ", saldo=" + saldo + ", id=" + id + ", cartao=" + cartao
				+ ", transacao=" + transacao + "]";
	}
	
	public void recaregarCelular() {
		
	}
	

	public String getCpf() {
		return cpf;
	}

	

	public String getRg() {
		return rg;
	}

	
	

	
	
	
	
	
}
