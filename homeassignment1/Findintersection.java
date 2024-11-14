package homeassignment1;

public class Findintersection {

	public static void main(String[] args)
	{
		 int arr1[]={3,2,11,4,6,7};
		 int arr2[]={1,2,8,4,9,7}; 
		 for(int a=0;a<arr1.length;a++)
		 {
			 for(int b =0;b<arr2.length;b++)
				 if(arr1[a]==arr2[b])
				 {
					 System.out.println("match is found:"+arr1[a]);
				 }

		 }

	}

}
