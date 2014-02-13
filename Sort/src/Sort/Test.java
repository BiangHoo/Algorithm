package Sort;
import java.util.Arrays;


/**
 * @author Bangwen Chen
 *
 * 2013Äê9ÔÂ10ÈÕ
 */
public class Test {


	public static void main(String[] args) {
		int array[]={10,4,9,7,23,0,5,79,1,8,0};
//		int array[]={4, 1, 1, 1, 1, 1, 5, 3, 2};
		System.out.println(Arrays.toString(array));
		System.out.println("Sorting...");
//		new BubbleSort().Sorting(array);
//		new SelectSort().Sorting(array);
//		new InsertSort().Sorting(array);
//		new HeapSort().Sorting(array);
		new QuickSort().Sorting(array);
//		new MergeSort().Sorting(array);
//		new BucketSort().Sorting(array);
//		new ShellSort1().Sorting(array);
		System.out.println(Arrays.toString(array));
		

	}

}
