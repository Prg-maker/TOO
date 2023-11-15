package projeto;

public class Cartao {
	private String tipo_cartao;
	private String bandeira_cartao;
	private Double limite;
	private String validade;
	private int codigo_seguraca;
	private int numero_cartao;
	
	
	public Cartao(String tipo_cartao ) {
	
		this.tipo_cartao = tipo_cartao;
		
		this.limite = 12.0;
		this.validade = ""; // a gente que tem que criar uma validade
		this.codigo_seguraca = 0; //a gente que tem que criar uma validade
		this.numero_cartao = 12;
	}


	

	public String getTipo_cartao() {
		return tipo_cartao;
	}


	public void setTipo_cartao(String tipo_cartao) {
		this.tipo_cartao = tipo_cartao;
	}


	public String getBandeira_cartao() {
		return bandeira_cartao;
	}


	public void setBandeira_cartao(String bandeira_cartao) {
		this.bandeira_cartao = bandeira_cartao;
	}


	public Double getLimite() {
		return limite;
	}


	public void setLimite(Double limite) {
		this.limite = limite;
	}


	public String getValidade() {
		return validade;
	}


	public void setValidade(String validade) {
		this.validade = validade;
	}


	public int getCodigo_seguraca() {
		return codigo_seguraca;
	}


	public void setCodigo_seguraca(int codigo_seguraca) {
		this.codigo_seguraca = codigo_seguraca;
	}


	public int getNumero_cartao() {
		return numero_cartao;
	}


	public void setNumero_cartao(int numero_cartao) {
		this.numero_cartao = numero_cartao;
	}
	

	public String toString() {
		return "Cartao [tipo_cartao=" + tipo_cartao + ", bandeira_cartao=" + bandeira_cartao + ", limite=" + limite
				+ ", validade=" + validade + ", codigo_seguraca=" + codigo_seguraca + ", numero_cartao=" + numero_cartao
				+ "]";
	}

	

}
