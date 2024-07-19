package util.declaracao;

public class DeclaracaoPrincipal {

	public static void main(String[] args) {
//		int idade = 10;
//		System.out.println(idade);
		//comentario de uma única linha
		/*
		comentario de mais de uma linha
		*/
		//aqui vou declarar uma variável idade e atruir valor a mesma
//		int idd = 10;
//		System.out.println(idd);
//		
//		int idadeAnoQueVem = idade + 1;
//		System.out.println(idadeAnoQueVem);
		
		
		//atribuicao de valores e utilizacao de operadores em variaveis em Java
		
//		int cinquenta = 10+40;
//		int cinquentaMinus = 100-50;
//		int cinquentaMulti = 2*25;
//		int cinquentaDiv = 100/2;
//		
//		System.out.println(cinquenta);
//		System.out.println(cinquentaMinus);
//		System.out.println(cinquentaMulti);
//		System.out.println(cinquentaDiv);
		
		//utilizadao de variavel do tipo double
//		double valor = 3.14;
//		System.out.println(valor);
//		double x = 10 * 2; 
//		System.out.println(x);
		
		//variavel do tipo boolean armazena verdadeiro ou falso
//		boolean vrdd = true;
//		System.out.println(vrdd);
//		int idade = 15;
//		boolean maiorDeIdade = idade >= 18;
//		System.out.println(maiorDeIdade);
		
		
		//utilizando variavel do tipo char
//		char c = 'x';
//		System.out.println(c);
		
		//exercicios
		
//		int gastoMesJaneiro;
//		gastoMesJaneiro = 15000;
//		int gastoMesFevereiro;
//		gastoMesFevereiro = 23000;
//		int gastoMesMarco;
//		gastoMesMarco = 17000;
//		
//		int gastoTotal = gastoMesJaneiro + gastoMesFevereiro + gastoMesMarco;
//		System.out.println(gastoTotal);
//		double mediaTrimestre = gastoTotal / 3;
//		System.out.println(mediaTrimestre);
		
		//casting
		//moldando valor dos numeros inteiros
//		double pi = 3.14;
//		int valorInteiroPi = (int) pi;
//		System.out.println(valorInteiroPi);
//		
//		long valueParaLong = 94954954;
//		int valorIntLong = (int) valueParaLong;
//		
//		System.out.println(valueParaLong);
//		System.out.println(valorIntLong);
		
		//utilizacao de estrutura if / else 
		int idade = 15;
		boolean amigoDoDono = false;
		if (idade < 18 && amigoDoDono == false) {
			System.out.println("menor de idade e nao pode entrar");
		}else {
			System.out.println("maior de idade");
		}
		
		while (idade < 18) {
			System.out.println(idade);
			idade += 1;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
	}
}
