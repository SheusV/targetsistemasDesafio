package application;

import java.util.HashSet;

public class Program {
	public static void main(String[] args) {
		Integer numInformado=32;
		int result =0;
		int preview = 1;
		HashSet<Integer> fibonacciSet = new HashSet<>();
		fibonacciSet.add(result);
		fibonacciSet.add(preview);

		while(preview<=numInformado) {
			int nextFibo =  result + preview;
			fibonacciSet.add(nextFibo);
			result = preview;
			preview = nextFibo;
		}
		if(fibonacciSet.contains(numInformado)) {
			System.out.println(numInformado+" Pertence a sequencia");
		}else {
			System.out.println(numInformado+" NÃO pertence a sequencia");
		}
		

	}

}
