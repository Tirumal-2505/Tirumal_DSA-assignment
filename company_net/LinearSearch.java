package company_net;

public class LinearSearch {
		
		public LinearSearch(double[] arr) {
		
	}

		public  double search(double[] arr,int value) {
			
				for(int i=0; i<arr.length;i++)
				{
					if(arr[i] == value)
					return i;
				}
				return -1;
			
		}
}

