package model;

public class IngressoVIP extends Ingresso{
	
	private String funcao;

	public IngressoVIP() {
		super();
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	@Override
	public float valorFinal(float taxaConveniencia) {
		return (super.getValor()*1.18f)+ taxaConveniencia;
	}
	

}
