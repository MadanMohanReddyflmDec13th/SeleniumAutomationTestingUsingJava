package stringprograms;

public class ReverseAStringByPreservingItsSpaces {

	public static void main(String[] args) {
		
		String s = "I am Madan";
		char[] inputArr = s.toCharArray();
		char[] resultArr = new char[inputArr.length];
		
		for(int i=0; i<inputArr.length; i++)
		{
			if(inputArr[i]==' ')
			{
				resultArr[i]=inputArr[i];
			}
		}
		
		int j=resultArr.length-1;
		for(int i=0;i<inputArr.length;i++)
		{
			if(inputArr[i]!=' ')
			{
				while(resultArr[j]==' ')
				{
					j--;
				}
				
				resultArr[j]=inputArr[i];
				j--;
			}
			
			
		}
		
		System.out.println("Output is: "+new String(resultArr));
	}

}
   