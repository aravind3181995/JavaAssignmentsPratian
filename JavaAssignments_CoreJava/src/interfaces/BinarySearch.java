package interfaces;

public class BinarySearch implements Search{

	private int[] elements;
	
	@Override
	public void addElements(int[] e) {
		elements = new int[e.length];
		for(int i = 0; i < e.length ; i++){
			elements[i] = e[i];
		}
		
	}

	@Override
	public boolean searchElement(int key) {
		int l = 0;
		int r = elements.length - 1;
		
		while(l <= r){
			int m = l + (r - l)/2;
			
			if(elements[m] == key){
				return true;
			}
			
			if(elements[m] < key){
				l = m + 1;
			}
			
			else{
				r = m - 1;
			}
		}
		return false;
	}

}
