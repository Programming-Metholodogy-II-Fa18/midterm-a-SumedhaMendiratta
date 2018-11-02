package midterm;

public class problem3 {
	
	
	public class Data {
		int data; //stores the data value in this data structures
		int length; //stores the length of the data structure
		Data prev; //pointer pointing to previous element 
		Data next; //pointer pointing to next element 
		
		Data(){
			int data;
			length = 0; //setting the initial lenghth in the constructor to 0 
			this.prev = null; //setting the .prev and .next to zero since it is a constructor and this will be defined in the function 
			this.next = null;
		}

		
}
	
		Data root; //creating a pointer called root that will point to the first element in the data structure
		
		
	int ProblemThree(Data data, int value){
		int count = 0; //currently the number of matches is stored as count and is equal to zero because we haven't started iterating through the data structure yet
		int compares = 0; // the number of compares made throughout the data structures is also equal to 0 because again, haven't iterated through the data structure yet 
		int length = root.length; // setting the value of length to equal the length of the data structure. 
		for (int i = 0; i < length; i++){ // iterating through the data structure to compare the elements to see if there are any matches 
			if (root.data == value){ // if the number matches it enters into this if statement 
				count++; //since it matched it count would increment by 1
				compares++; //since a comparison was made to check if there was a match, the comparison counter would increment by 1
				root = root.next; //updates the pointer of root to move to the next element
				
			}
			if (root.next!= null){ //checks if the root pointer has reached the last element, if it has there are no more comparisons to make and no more numbers to check if there is a match 
				break;
			}
			root = root.next; //continues to move the root counter to the next element in the event that the value of the number does not match the current value 
			compares++;//although there was no match made, a comparison was still made so the comparison counter will be incremented. 
		}
		System.out.println("The number of compares were " + compares);
		return count;

	}
	
}
