public class BinaryRecursiveSearch implements Practice03Search {
	public String searchName(){
		return "Binary Recursive Search";
	}
	public int search(int[] arr, int target) {
		int l = 0;
		int r = arr.length -1;
		return BinaryRecursiveSearch(arr, target, l, r);
	}
		public int BinaryRecursiveSearch(int[] arr, int target, int l, int r)
		{
			if (r >= l) 
			{ 
				int mid = l + (r - l) / 2; 
				if (arr[mid] == target) 
					return mid;
				if (arr[mid] > target) 
					return BinaryRecursiveSearch(arr, target, mid+1, r); 
				if (target > arr[mid])
				{
				return BinaryRecursiveSearch(arr, target, l, mid-1);
				}
			}
				return -1; 
		} 
	}