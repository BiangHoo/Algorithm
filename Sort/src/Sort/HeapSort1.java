package Sort;
import java.util.Arrays;

/**
 * @author Bangwen Chen
 *
 * 2013Äê9ÔÂ14ÈÕ
 */
public class HeapSort1 {

	public static void main(String[] args) {
		int array[]={10,12,9,7,23,5,79,1,8,1};
		System.out.println(Arrays.toString(array));
		System.out.println("Sorting...");
		System.out.println(Arrays.toString(Sort(array)));

	}
	
	public static int[] Sort(int[] array){
		MakeMinHeap(array);
		System.out.println(Arrays.toString(array));
		for(int i=array.length-1;i>0;i--){
			Swap(array,0,i);
			ShiftDown(array,0,i-1);
		}
		return array;
	}
	public static void MakeMinHeap(int[] array){
		
		int len = array.length;
		for(int i=len/2-1;i>=0;i--){
			ShiftDown(array,i,len);
		}
		System.out.println(Arrays.toString(array));
	}
	
	public static void ShiftDown(int[] array,int i,int n){
		
		int temp = array[i];
		int key=2*i+1;
		
		while(key<n ){
			if(key+1<n && array[key]>array[key+1]){
				key++;
			}
			
			if(array[key]>temp){break;}
				array[i] =array[key];
				i = key;
				key = 2*i+1;

		}
		array[i] = temp;
		
	}
	public static void Swap(int[] array,int i,int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
