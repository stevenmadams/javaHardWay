public class VariableChangeShortcuts {
	public static void main( String[] args ) {
		int i, j, k;
		
		i = 5;
		j = 5;
		k = 5;
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
		i = i + 3;
		j = j - 3;
		k = k * 3;
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );
		
		i = 5;
		j = 5;
		k = 5;
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
		i += 1; //Compound assignment operator i += 3 is the same as i =  i + 3
		j -= 2;
		k *= 3;
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );
		
		i = j = k = 5;
		System.out.println( "i:" + i + "\tj: " + j + "\tk: " + k );
		i += 1;
		j -= 2;
		k *= 3;
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k + "\n" );
		
		i = j = 5;
		System.out.println( "i: " + i + "\tj: " + j );
		i =+ 1; //Opps!
		j =- 2;
		System.out.println( "i: " + i + "\tj: " + j + "\n" );
		
		i = j = 5;
		System.out.println( "i: " + i + "\tj: " + j );
		i++; // "post-increment operator" adds 1 to whatever is in i, same as i = i + 1, super common in coding
		j--; // "post-decrement operator" subtracts 1 from the value in j
		System.out.println( "i: " + i + "\tj: " + j );
		
	}
}

// These shortcuts are optional 