package midterm;

public class Data {
	int data;
	int length;
	Data prev;
	Data next;
	
	Data(){
		int data;
		length = 0;
		this.prev = null;
		this.next = null;
	}


	
	Data root;
	
	void add(int a){ //takes in the value to add to the data structure
		length++; //since it is being added to the structure, the length will be incrememented by 1
		Data temp  = new Data(); //create a Data called temp to store the value and add it to the data structure
		temp.data = a; //store the value to be inputted into temp
		
		if ((length -1) == 0){ //checks if there is no elements in the data structure
			root = temp; // if this is the case then the root will be the temp in which the value was just stored as it is the only value in the data structure
			return;
		}
		else {
			while (root.next !=  null){ //iterates to find the last element in the data structure in order to add this new value after it 
			root = root.next;
		}
		
		temp.prev = root; // at this point, the data structure has reached the last element so making the .prev of temp is saying that there is a value after the last element
		root.next = temp; //need to update the .next pointer for the root to equal temp so that it is known that the place of the root pointer is no longer the last element and its .next is not null
		}
		
	}
	
	void print(){
		for (int i = 0; i < length; i++){
			System.out.print(root.data + " ");
		
		}
	}
	
	int remove(){
		length--; //since element is being removed, the length of the data structure will decrease by 1
		while (root.next!= null){ //as long as the root pointer has not reached the end of the data structure, keep iterating to reach to the end 
			root = root.next;
		}
		int temp = root.data; //this is the value of the last element in the data structure because the root pointer's .next = null, saving this value to return back
		root.prev.next = null; //want to set the value of the last element to be the second to last element since we are removing the last element
		return temp; //returns the value of the last element in the data structure 
		
	}
	
	int getValue(int index){ //takes in the index at which we want to find the value
		if(index > length){ //tests if the index is greater than the length of the data structure, returns a -1
			return -1;
		}
		else{
			for (int i = 0; i < index-1; i++){ //iterates through the data structure until reaching the said index
				root  = root.next; // keeps having the root pointer move to the next element 
			}
			int value = root.data; // once it reaches this point, means that the root pointer is at the index from where we want to retrived the value
			System.out.println(value); //print out that value at the given index
			return value; //return the value that was at the given index
		}
	}
 public static void main(String[] args){
	 Data test = new Data();
	 test.add(1);
	 test.add(9);
	 test.add(4);
	 test.add(5);
	 test.add(10);
	 test.add(0);
	 test.print();
	 test.getValue(0);
	 test.getValue(3);
	 }
	
	
}
