package application;

public class variavelSoma {

	public static void main(String[] args) {
		int indice=12;
		int soma=0;
		int k=1;
		while(k<indice) {
			k+=1;
			soma+=k;
			System.out.println(soma);
		}
		System.out.println("Valor final da variavel soma é: "+soma);
	}

}
