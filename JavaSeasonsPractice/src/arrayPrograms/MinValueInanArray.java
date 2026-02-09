package arrayPrograms;

public class MinValueInanArray {

	public static void main(String[] args) {
		
		int[] a= {2,7,9,3,5,};
		int min=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Lowest Value is :"+min);
	}
}
 