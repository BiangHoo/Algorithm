package Sort;
import java.util.Arrays;


/**
 * @author Bangwen Chen
 *
 * 2013年9月10日
 */
public class MergeSort implements Sort {

	@Override
	public void Sorting(int[] array) {
		
		int len = array.length;
		int [] tmp = new int[len];
		MeSort(array,0,len-1,tmp);
		
	}
	
	static  private void MergeArray(int[]a,int first,int mid,int last,int[]tmp){//将排好序的两个数组进行Merge
		
		int index =0;
		int i=first;
		int j=mid+1;
		
		while(i<=mid&&j<=last){//将两个数组的值从小到达依次赋给tmp
			if(a[i]<a[j]){
				tmp[index++] = a[i++];
			}else{
				tmp[index++] = a[j++];
			}
		}
		
		while(i<=mid){//若第第二个数组都赋给tmp后，第一个数组仍有剩余元素，则将剩余元素依次赋给tmp
			tmp[index++] = a[i++];
		}
		
		while(j<=last){
			tmp[index++] = a[j++];
		}
		for(i=0;i<index;i++){//将tmp的值取出，赋给一个数组
			a[first+i] = tmp[i];
		}
		
	}
	static private void MeSort(int[]a,int first,int last,int[] tmp){//递归
		if(first<last){
			int mid =(first+last)/2;
			MeSort(a,first,mid,tmp);
			MeSort(a,mid+1,last,tmp);
			MergeArray(a,first,mid,last,tmp);
		}
	}
}
