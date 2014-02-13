package Sort;

public class ShellSort1 implements Sort {

	@Override
	public void Sorting(int[] array) {
		// TODO Auto-generated method stub
		int i,gap;
		int len = array.length;
		
		for(gap = len/2;gap>0;gap /= 2){
			for(i = gap;i<len;i++){
				
				int tmp = array[i];
				int key =i-gap;
				while(key>=0 && array[key]>tmp){	
					array[i] = array[key];
					i = key;
					key = i-gap;
				}
				array[i] = tmp;
			}
		}
	}

}
