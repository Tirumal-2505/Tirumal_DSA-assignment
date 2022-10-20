package company_net;

public class Selectionsort{
	    private double[]arr;
	    public Selectionsort(double[]arr){
	        this.arr = arr;
	    }
	    void ascendingorder(){
	        int length = arr.length;
	        for(int i=0;i<length-1;i++){
	            int min = i;
	            for(int j=i+1;j<length;j++){
	                if(arr[j]<arr[min]){
	                    min =j;
	                }
	            }
	            double temp = arr[min];
	            arr[min] = arr[i];
	            arr[i] = temp;
	            System.out.println(arr[i]);
	        }
	    }
	    public void order(double[]arr) {
	    	int length = arr.length;
	    	for(int i=0;i<length;i++) {
	    		System.out.print(arr[i] + " ");
	    	}
	    }
}
