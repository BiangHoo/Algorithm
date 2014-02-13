package Sort;
import java.util.Arrays;


/**
 * @author Bangwen Chen
 *
 * 2013Äê9ÔÂ10ÈÕ
 */
public class BubbleSort implements Sort {
	
		public void Sorting(int array[]) {
			
			int tmp;
			
			for (int i=0;i<array.length;i++){
				for(int j =i+1;j<array.length;j++){
					if(array[i]>array[j]){
						tmp =array[i];
						array[i]=array[j];
						array[j]=tmp;
					}
				}
				System.out.println(Arrays.toString(array));
			}
		
		}
		
}
