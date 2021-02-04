public class bitwise 
{	
	/*
	 * Runtime complexity: O(n), where n is XOR char array
	 */

	public static void main(String[] args) 
  	{	
		int a = 29; // Binary: 11101
		int b = 15; // Binary: 01111
		            // xor:	   10010
		
		int c = 23; // Binary: 10111
		int d = 19; // Bianry: 10011
					// xor:    00100
		
		System.out.println(findXorValue(c,d)); // expected 1
	}
	
  /**
  * Description: Finds integer of XOR value between int A and B
  */
	static int findXorValue(int a, int b) 
	{
		int xorNum = a ^ b;
		String asBinary = Integer.toBinaryString(xorNum);
    
    		// returns count from flippedBitsCount()
		return(flippedBitsCount(asBinary));
	}
	
  /**
  * Description: Gets count of amount of bits which need to be flipped
  */
	static int flippedBitsCount(String xorBinary) 
  	{
		int count = 0;
		
		char[] bin = xorBinary.toCharArray();
		
		for(char ch: bin) 
		{
			if(ch == '1') 
			{
				count++;
			}
		}
		return count;
	}
}
