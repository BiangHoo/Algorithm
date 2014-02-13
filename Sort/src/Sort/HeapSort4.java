package Sort;
import java.util.Arrays;


/**
 * @author Bangwen Chen
 *
 * 2013��9��12��
 */
public class HeapSort4 implements Sort{

	@Override
	public void Sorting(int[] array) {
		
		int len =array.length;
		MakeMinHeap(array,len);
		System.out.println(Arrays.toString(array));
		for(int i = len -1;i>0;i--){
			Swap(array,i,0);
			MinHeapFixdown(array,0,i);
		}
		
	}
	static void MinHeapFixup(int a[],int i){
		
		int j,temp;
		temp = a[i];
		j=(i-1)/2; //parent node
		
		while(j>=0 && i != 0){
			if(a[j]<=temp){
				break;
			}
			a[i] = a[j];
			i=j;
			j=(i-1)/2;
		}
		a[i] = temp;
	}
//  ��i�ڵ㿪ʼ����,nΪ�ڵ����� ��0��ʼ���� i�ڵ���ӽڵ�Ϊ 2*i+1, 2*i+2 
	static void MinHeapFixdown(int a[],int i,int n){
		int j,temp;
		temp = a[i];
		j = 2*i +1;
		while(j<n){
			if(j+1<n&&a[j+1]<a[j]){
				j++;
			}
			if(a[j]>=temp){
				break;
			}
			a[i] =a[j];//�ѽ�С���ӽ�������ƶ�,�滻���ĸ����
			i=j;
			j=2*i+1;
		}
		a[i]= temp;
	}
	//����С����ɾ����  
	static void MinHeapDeleteNumber(int a[], int n)  
	{  
	    Swap(a,0, n-1);  
	    MinHeapFixdown(a, 0, n - 1);  
	} 
	//������С��  
	void MakeMinHeap(int a[], int n)  
	{  
	    for (int i = n / 2 - 1; i >= 0; i--)  {
	        MinHeapFixdown(a, i, n);  
//	        System.out.println("MinHeap: " + i+Arrays.toString(a));
	    }
	    System.out.println("MinHeap: " + Arrays.toString(a));
	}
	static void  Swap(int [] array,int i,int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
