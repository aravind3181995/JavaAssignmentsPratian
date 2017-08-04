package interfaces;

public class LinearSearch implements Search{

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
		for(int i = 0; i < elements.length; i++){
			if(elements[i] == key){
				return true;
			}
		}
		return false;
	}

}
