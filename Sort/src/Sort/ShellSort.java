package Sort;

public class ShellSort implements Sort {

	@Override
	public void Sorting(int[] array) {
		int i,j,gap;
		int len =array.length;
		for(gap = len/2;gap>0;gap /=2){//²½³¤
			for(i=0;i<gap;i++){
				
				for (j=i+gap;j<len;j += gap){//²åÈëÅÅĞò
						
					int temp = array[j];
					int key = j-gap;
					
					while(key>=0 && array[key]>temp){
						array[j] = array[key];
						j =key;
						key = j-gap;
					}
					array[j] = temp;
				}
			}
		}
		
	}

}
