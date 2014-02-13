package Sort;
import java.util.Arrays;

/**
 * @author Bangwen Chen
 *
 * 2013Äê9ÔÂ14ÈÕ
 */
public class HeapSort implements Sort {


	public void Sorting(int[] array) {
		MakeMinHeap(array);
		for(int i=array.length-1;i>0;i--){
			Swap(array,0,i);
			ShiftDown(array,0,i-1);
		}
	}
	
	private void MakeMinHeap(int[] array){
		
		int len = array.length;
		for(int i=len/2-1;i>=0;i--){
			ShiftDown(array,i,len);
		}
	}
	
	private void ShiftDown(int[] array,int i,int n){
		
		int temp = array[i];
		int key=2*i+1;
		
		while(key<n ){
			if(key+1<n && array[key]>array[key+1]){
				key++;
			}
			if(array[key]>temp){
				break;
			}
			array[i] =array[key];
			i = key;
			key = 2*i+1;
		}
		array[i] = temp;
		
	}
	private void Swap(int[] array,int i,int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}


}
