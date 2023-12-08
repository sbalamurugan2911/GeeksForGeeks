package array;

public class CheckTransitionPoint {
	
	int transitionPoint(int arr[], int n) {
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                return i;
            }
        }
        
        return -1;
    }

	public static void main(String[] args) {
		 CheckTransitionPoint  c= new  CheckTransitionPoint ();
		 int arr[]= {0,0,0,1,1};
		System.out.println( c.transitionPoint(arr, 5) );

	}

}
