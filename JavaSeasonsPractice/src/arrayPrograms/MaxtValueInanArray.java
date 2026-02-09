package arrayPrograms;

public class MaxtValueInanArray {

	public static void main(String[] args) {
		
		int[] a= {2,7,9,3,5,};
		int max=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Highest Value is :"+max);
	}

}
