package projeto;

import java.util.Arrays;
import java.util.ArrayList;
import utils.Utils;

public abstract class Conta {

	protected String nome;
	protected String numero_celular;
	protected String email;
	protected String senha;
	protected Double saldo = 0.0;
	protected String id;

	protected ArrayList<Cartao> cartao;
	protected ArrayList<Transacao> transacao;
	
	Conta(String nome, String numero_celular, String email, String senha ) {

		this.nome = nome;
		this.numero_celular = numero_celular;
		this.email = email;
		this.senha = senha;

		this.id = Utils.uuid();
		
		cartao = new ArrayList<Cartao>();
		transacao = new ArrayList<Transacao>();
		
		
	}
	
	public Transacao buscaTransacao(String codigo_transacao) {
		Transacao buscatransacao = null;
		
		if(transacao.size() > 0) {
			for(Transacao tt : transacao) {
				if(tt.getCodigo_transacao() == codigo_transacao) {
					buscatransacao= tt;
				}
			}
		}
		
		return buscatransacao;
	}
	
	public boolean realizarTransacao(Double valor , Conta contaParaDeposito) {
		if(valor > 0 && this.getSaldo() >= valor) {
			
			Transacao tt = new Transacao(valor, getId(), contaParaDeposito.getId(), getNome(), contaParaDeposito.getNome(), "descricao", "tipo", 0000);
			
			setSaldo(getSaldo() - valor);
			contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
			
			transacao.add(tt);
			
			System.out.println("Transferência foi realizada com sucesso!");
		}else {
			System.out.println("Não foi possível realizar a transferência!");
		}
		return true;
	}
	
	public void deletarTranscao(String id_Transacao) {
		if(transacao.size()>0) {
			Transacao tt = buscaTransacao(id_Transacao);
			transacao.remove(tt);
		}else {
			
		}
	}
	
	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero_celular() {
		return numero_celular;
	}

	public void setNumero_celular(String numero_celular) {
		this.numero_celular = numero_celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getId() {
		return id;
	}


}
