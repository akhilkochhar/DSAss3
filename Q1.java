import java.util.*;
class Search_arr
{
	public static boolean search(int arr[],int num)
	{
		if(arr.length==0)
		{
			return false ;
		}
		int small_arr[]=new int[arr.length-1];
		for(int i=0;i<small_arr.length;i++)
		{
			small_arr[i]=arr[i+1];
		}
		if(arr[0]==num)
		{
			return true;
		}
		else
		{
			return search(small_arr,num);
		}
	}
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n;
	n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	int num=s.nextInt();
	System.out.println(search(a,num));
	System.out.print("Value Searched:"+num);
}
}
