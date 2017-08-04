package interfaces;

public class TestMain {
	public static void main(String args[]){
		
		Search binarySearch = new BinarySearch();
		int[] elements = {10,5,2,100,80,54,61};
		binarySearch.addElements(elements);
		if(binarySearch.searchElement(100)){
			System.out.println("Found using Binary Search");
		}
		else{
			System.out.println("Not found using Binary Search");
		}
		
		Search linearSearch = new LinearSearch();
		linearSearch.addElements(elements);
		if(linearSearch.searchElement(0)){
			System.out.println("Found using Linear Search");
		}
		else{
			System.out.println("Not found using Linear Search");
		}
		
	}
}
