package Sort;
import java.util.Arrays;


/**
 * @author Bangwen Chen
 *
 * 2013��9��10��
 */
public class MergeSort implements Sort {

	@Override
	public void Sorting(int[] array) {
		
		int len = array.length;
		int [] tmp = new int[len];
		MeSort(array,0,len-1,tmp);
		
	}
	
	static  private void MergeArray(int[]a,int first,int mid,int last,int[]tmp){//���ź���������������Merge
		
		int index =0;
		int i=first;
		int j=mid+1;
		
		while(i<=mid&&j<=last){//�����������ֵ��С�������θ���tmp
			if(a[i]<a[j]){
				tmp[index++] = a[i++];
			}else{
				tmp[index++] = a[j++];
			}
		}
		
		while(i<=mid){//���ڵڶ������鶼����tmp�󣬵�һ����������ʣ��Ԫ�أ���ʣ��Ԫ�����θ���tmp
			tmp[index++] = a[i++];
		}
		
		while(j<=last){
			tmp[index++] = a[j++];
		}
		for(i=0;i<index;i++){//��tmp��ֵȡ��������һ������
			a[first+i] = tmp[i];
		}
		
	}
	static private void MeSort(int[]a,int first,int last,int[] tmp){//�ݹ�
		if(first<last){
			int mid =(first+last)/2;
			MeSort(a,first,mid,tmp);
			MeSort(a,mid+1,last,tmp);
			MergeArray(a,first,mid,last,tmp);
		}
	}
}
