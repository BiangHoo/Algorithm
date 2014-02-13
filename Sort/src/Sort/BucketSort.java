package Sort;
import java.util.Arrays;


public class BucketSort implements Sort{

	@Override
	public void Sorting(int[] array) {
		// TODO Auto-generated method stub
		int max = FindMax(array);
		int bucket[]= new int[max+1];
		for(int i=0;i<array.length;i++){
			bucket[array[i]] ++;
		}
		System.out.println(Arrays.toString(bucket));
		int index =0;
		for(int i=0;i<bucket.length;i++){
			for(int j=0;j<bucket[i];j++){
				array[index++]=i;
			}
		}
	}
	
	 private int FindMax(int array[]){
		 int max=array[0];
		 int i=0;
		 while(i<array.length -1){
			 if(array[i]>max){
				 max = array[i];
			 }
			 i++;
		 }
		 return max;
	 } 

}
