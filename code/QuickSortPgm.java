import java.util.*;
class QuickSortPgm
{
	public static int partition(String[] A,int p,int r)
	{	
		String x=A[r];
		int i=p-1;
		for(int j=p;j<=r-1;j++)
		{	
			if(A[j].compareTo(x)<=0)
			{
				i=i+1;
				String temp=A[i];
				A[i]=A[j];
				A[j]=temp;
			}
		}
		String temp=A[i+1];
		A[i+1]=A[r];
		A[r]=temp;
		return i+1;
	}
	public static void quicksort(String A[],int p,int r)
	{
		if(p<r)
		{
			int q=partition(A,p,r);
			quicksort(A,p,q-1);
			quicksort(A,q+1,r);
		}
	}
	public static void main(String args[])
	{
		String name[]={"Sangeeth","Binu","Nideesh","Roshni"};
		quicksort(name,0,name.length-1);
		System.out.println("After quick sort:");	
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
	}
}
