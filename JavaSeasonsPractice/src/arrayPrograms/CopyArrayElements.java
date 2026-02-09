package arrayPrograms;

public class CopyArrayElements {

	public static void main(String[] args) {
		
		int [] a= {2,4,6,8,7,5,3,1};
		int [] b= new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];	
			System.out.print(b[i]+" ");
		}	
	}
}
