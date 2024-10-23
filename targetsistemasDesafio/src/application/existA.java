package application;

public class existA {

	public static void main(String[] args) {
		String palavraCalcularAs= "Arara";
		int sum=0;
		String palavraCalcularAsToLower = palavraCalcularAs.toLowerCase();
		
		for(char c :palavraCalcularAsToLower.toCharArray()) {
			if(c == 'a') {
				sum++;
			}
		}
		if (sum>0) {
			System.out.println("A palavra: "+palavraCalcularAs+" Possui: "+sum+" Letras A's" );
		}else {
			System.out.println("A palavra: "+palavraCalcularAs+" NÃO Possui Letras A's" );
		}
	}

}
