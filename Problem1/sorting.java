package midterm;

public class sorting {
	
	public static void ExamSort(int[]a, int size){ //takes in the array and takes in the size of the array 
		for (int i = 0; i < size -1; i ++){ //implements bubbleSort to sort through the list. 
			for (int j = 0; j < size -1 - i; j++){
				if (a[j]> a[j+1]){
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for (int x = 0; x < size; x++){ //prints out the array in sorted order 
			System.out.print(a[x] + " ");
		}
	}
	

	
	
	
	public static void main (String[]args) { //main function that calls the ExamSort
		sorting test = new sorting();
		int[]a = {15, 9, 60, 44, 12, 1, 4};
		int size = a.length;
		test.ExamSort(a, size);
	}
	
		
	}

