package Sort;

/**
 * @author Bangwen Chen
 *
 * 2013Äê9ÔÂ10ÈÕ
 */
public class QuickSort implements Sort {

	@Override
	public void Sorting(int[] array) {
		sort(array,0,array.length-1);
	}
	private void sort(int array[],int low,int high){
		if(low>=high){
			return;
		}
		int index = GetMiddle(array,low,high);
		sort(array,low,index-1);
		sort(array,index+1,high);
	}
	private int GetMiddle(int[] array,int low,int high) {

		int key = array[low];
		while(low<high){
			while(low<high&&array[high]>=key){
				high--;
			}
			array[low] = array[high];
			while(low<high && array[low]<key){
				low++;
			}
			array[high] = array[low];
		}
		array[low] = key;
		return low;
	}

}
