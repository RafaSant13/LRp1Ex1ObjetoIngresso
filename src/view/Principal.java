package view;

import model.Ingresso;
import model.IngressoVIP;

public class Principal {

	public static void main(String[] args) {
		Ingresso i = new Ingresso();
		i.setId("001");
		i.setValor(5f);
		
		System.out.printf("Ingresso %s\nValor : R$%.2f\n", i.getId(), i.getValor());
		System.out.println("----------------------------------");
		
		IngressoVIP iv = new IngressoVIP();
		iv.setId("002");
		iv.setFuncao("Influencer");
		iv.setValor(10f);
		System.out.printf("Ingresso %s\nFunção : %s\nValor : R$%.2f\n", iv.getId(),iv.getFuncao(), iv.getValor());
		
	}

}
