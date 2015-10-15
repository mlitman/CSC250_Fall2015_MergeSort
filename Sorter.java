import java.util.Random;


public class Sorter 
{
	void display(int[] elephant)
	{
		System.out.println("****");
		for(int i = 0; i < elephant.length; i++)
		{
			System.out.println(elephant[i]);
		}
		System.out.println("****");

	}

	//determines if a val is the smallest in an array
	boolean isSmallest(int val, int[] ar)
	{
		for(int i = 0; i < ar.length; i++)
		{
			if(ar[i] < val)
			{
				return false;
			}
		}
		return true;
	}

	//identifies position of the smallest value
	int posOfSmallest(int[] ar)
	{
		int pos = 0;
		for(int i = 0; i < ar.length; i++)
		{
			if(ar[i] < ar[pos])
			{
				pos = i;
			}
		}
		return pos;
	}

	int removeAtIndex(int index, int[] ar)
	{
		int valToReturn = ar[index];
		int[] temp = new int[ar.length-1];
		System.out.println(ar);
		System.out.println(temp);

		for(int i = 0; i < index; i++)
		{
			temp[i] = ar[i];
		}
		for(int i = index+1; i < ar.length; i++)
		{
			temp[i-1] = ar[i];
		}
		ar = temp;
		System.out.println(ar);

		return valToReturn;
	}
}
