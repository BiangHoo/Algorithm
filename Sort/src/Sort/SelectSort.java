package Sort;

/**
 * @author Bangwen Chen
 *		O(n ^2 )
 * 2013��9��10��
 */
public class SelectSort implements Sort{


	@Override
	public void Sorting(int[] array) {
		int min;
		int tmp;
		for(int i=0;i<array.length;i++){
			min=i;
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[min]){
					min =j;
				}
			}
			tmp =array[i];
			array[i] =array[min];
			array[min]=tmp;
		}
		
	}

}
