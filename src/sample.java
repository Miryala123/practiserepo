
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ar= {2,2,3,3,5,6};
int c=0;
		for (int i=0;i<ar.length;i++)
		{
			for (int j=i+1;j<ar.length;j++)
			{
				if(ar[i]!=ar[j]  && i!=j)
					
				{
				   c++;
				   break;
				}
				
			}
			
		}
		
		System.out.println(c);
	}

}
