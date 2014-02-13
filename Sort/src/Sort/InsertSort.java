package Sort;

/**
 * @author Bangwen Chen
 *
 * 2013Äê9ÔÂ10ÈÕ
 */
public class InsertSort implements Sort{

	@Override
	public void Sorting(int[] array) {
		for (int i=1;i<array.length;i++){
			int tmp = array[i];
			int key =i;
			while(key>0 && array[key-1]>tmp){
					array[key] =array[key-1];
					key--;
			
			}
			array[key]=tmp;
		}
	}

}
