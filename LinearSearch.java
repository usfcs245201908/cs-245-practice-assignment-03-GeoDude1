public class LinearSearch implements Practice03Search {
	public String searchName(){
		return "Linear Search";
	}
	public int search(int [] a, int target);
	{ 
		for(int i = 0; i<a.length-1; i++)
		{
			if(a[i] == target)
			{
				return i;
			}
		}
			return -1;
	}
}
