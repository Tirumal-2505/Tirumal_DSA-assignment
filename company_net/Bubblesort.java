package company_net;

public class Bubblesort {
	    private double[]arr;
	    
	    public Bubblesort(double[]arr){
	        this.arr = arr;
	    }
	public void descendingorder1(){
	        int length = arr.length;
	        for(int i=0;i<length;i++){
	            for(int j=0;j<length-i-1;j++){
	                if(arr[j]<arr[j+1]){
	                    double temp = arr[j];
	            arr[j] = arr[j+1];
	            arr[j+1] = temp;
	                }
	            }
	            
	        }
	      }
	public void order(double[]arr) {
    	int length = arr.length;
    	for(int i=0;i<length;i++) {
    		System.out.print(arr[i] + " ");
    	}
	}
}
