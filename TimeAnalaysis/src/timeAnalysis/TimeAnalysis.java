package timeAnalysis;

public class TimeAnalysis {

	private int[] theArray; //initalization

	private int arraySize; 

	private int itemsInArray = 0;

	static long startTime;

	static long endTime;

	public static void main(String[] args) {
		
		
		// Randomly generate ARRAY of arraysize(N)  
		
		//initalTest
		TimeAnalysis initalTest = new TimeAnalysis(30);
		initalTest.generateRandomArray();
										
		//testAlgo
		TimeAnalysis testAlgo = new TimeAnalysis(20000);
		testAlgo.generateRandomArray();
		
		//testAlgo2
		TimeAnalysis testAlgo2 = new TimeAnalysis(40000);
		testAlgo2.generateRandomArray();

		//testAlgo3
		TimeAnalysis testAlgo3 = new TimeAnalysis(60000);
		testAlgo3.generateRandomArray();

		//testAlgo4
		TimeAnalysis testAlgo4 = new TimeAnalysis(80000);
		testAlgo4.generateRandomArray();

		//testAlgo5
		TimeAnalysis testAlgo5 = new TimeAnalysis(100000);
		testAlgo5.generateRandomArray();
		
						
	    //inital BubbleSort Test
		
		System.out.println("\n-----INITAL TEST(BubbleSort)-----\nBefore Sorting: \n");
		for(int i=0;i<initalTest.arraySize;i++)
			System.out.print(initalTest.theArray[i]+ " ");
		
		initalTest.bubbleSort();
		System.out.println("\nAfter Sorting: \n");
		for(int i=0;i<initalTest.arraySize;i++)
			System.out.print(initalTest.theArray[i]+" ");
		
		//initalquicksort test
				initalTest.generateRandomArray();
				System.out.println("\n\n-----INITAL TEST(Quick Sort)-----\nBefore Sorting: \n");
				for(int i=0;i<initalTest.arraySize;i++)
					System.out.print(initalTest.theArray[i]+" ");
				startTime=System.currentTimeMillis(); 
				initalTest.quickSort(0, initalTest.itemsInArray);
				endTime = System.currentTimeMillis();
				System.out.println("\nQuick Sort Took " + (endTime - startTime)+" ms for N Size : "+initalTest.arraySize);
				System.out.println("\nAfter Sorting: \n");
				for(int i=0;i<initalTest.arraySize;i++)
					System.out.print(initalTest.theArray[i]+" ");
				System.out.println();
		
		
	    // O(N^2) Test Bubble Sort Test 		
		//O(nlogn) Test Quick Sort Test		
				
				
		//UNSORTED ARRAY Test(Bubble Sort)
		System.out.println("\n---Sorting Of Unsorted Array of Different Sizes(Bubblesort)--- ");
		
		testAlgo.bubbleSort();
		
		testAlgo2.bubbleSort();
		  
		testAlgo3.bubbleSort();
		  
		testAlgo4.bubbleSort();
		  
		testAlgo5.bubbleSort();
		
		
		//Sorted Array Test (Bubble Sort)

	    System.out.println("\n\n---Sorting Of Sorted Array of Different Sizes(Bubblesort)--- ");
		
        testAlgo.bubbleSort();
		
		testAlgo2.bubbleSort();
		  
		testAlgo3.bubbleSort();
		  
		testAlgo4.bubbleSort();
		  
		testAlgo5.bubbleSort();   

		
		
        
        //UNSORTED ARRAY (Quick Sort)
		
		//testAlgo
		System.out.println("\n\n---Sorting Of Unsorted Array of Different Sizes(Quick Sort)--- ");
		testAlgo.generateRandomArray();
		startTime=System.currentTimeMillis();  
		testAlgo.quickSort(0, testAlgo.itemsInArray);
		endTime = System.currentTimeMillis();
		System.out.println("\nQuick Sort Took " + (endTime - startTime)+" ms for N Size : "+testAlgo.arraySize);
				
		
		//testAlgo2
		testAlgo2.generateRandomArray();
		startTime=System.currentTimeMillis();  
		testAlgo2.quickSort(0, testAlgo2.itemsInArray);
		endTime = System.currentTimeMillis();
		System.out.println("\nQuick Sort Took " + (endTime - startTime)+" ms for N Size : "+testAlgo2.arraySize);
		
		//testAlgo3
		testAlgo3.generateRandomArray();
		startTime=System.currentTimeMillis();  
		testAlgo3.quickSort(0, testAlgo3.itemsInArray);
		endTime = System.currentTimeMillis();
		System.out.println("\nQuick Sort Took " + (endTime - startTime) +" ms for N Size : "+testAlgo3.arraySize);
		
		//testAlgo4
		testAlgo4.generateRandomArray();
		startTime=System.currentTimeMillis();  
		testAlgo4.quickSort(0, testAlgo4.itemsInArray);
		endTime = System.currentTimeMillis();
		System.out.println("\nQuick Sort Took " + (endTime - startTime)+" ms for N Size : "+testAlgo4.arraySize);
		
		
		//testAlgo5
		testAlgo5.generateRandomArray();
		startTime=System.currentTimeMillis();  
		testAlgo5.quickSort(0, testAlgo5.itemsInArray);
		endTime = System.currentTimeMillis();
		System.out.println("\nQuick Sort Took " + (endTime - startTime)+" ms for N Size : "+testAlgo5.arraySize); 
		
		
		//Sorted Array(Quick Sort)
		
		//testAlgo
				System.out.println("\n\n---Sorting Of Sorted Array of Different Sizes(Quick Sort)--- ");
				startTime=System.currentTimeMillis();  
				testAlgo.quickSort(0, testAlgo.itemsInArray);
				endTime = System.currentTimeMillis();
				System.out.println("\nQuick Sort Took " + (endTime - startTime)+" ms for N Size : "+testAlgo.arraySize);
						
				
				//testAlgo2
				
				startTime=System.currentTimeMillis();  
				testAlgo2.quickSort(0, testAlgo2.itemsInArray);
				endTime = System.currentTimeMillis();
				System.out.println("\nQuick Sort Took " + (endTime - startTime)+" ms for N Size : "+testAlgo2.arraySize);
				
				//testAlgo3
				
				startTime=System.currentTimeMillis();  
				testAlgo3.quickSort(0, testAlgo3.itemsInArray);
				endTime = System.currentTimeMillis();
				System.out.println("\nQuick Sort Took " + (endTime - startTime) +" ms for N Size : "+testAlgo3.arraySize);
				
				//testAlgo4
				
				startTime=System.currentTimeMillis();  
				testAlgo4.quickSort(0, testAlgo4.itemsInArray);
				endTime = System.currentTimeMillis();
				System.out.println("\nQuick Sort Took " + (endTime - startTime)+" ms for N Size : "+testAlgo4.arraySize);
				
				
				//testAlgo5
				
				startTime=System.currentTimeMillis();  
				testAlgo5.quickSort(0, testAlgo5.itemsInArray);
				endTime = System.currentTimeMillis();
				System.out.println("\nQuick Sort Took " + (endTime - startTime)+" ms for N Size : "+testAlgo5.arraySize); 
		
	
	}

	//O(N^2) BubbleSort
	public void bubbleSort() {

		startTime = System.currentTimeMillis();

		for (int i = arraySize - 1; i >= 1; i--) {

			for (int j = 0; j < i; j++) {

				if (theArray[j] > theArray[j + 1]) {

					swapValues(j, j + 1);

				}
			}
		}

		endTime = System.currentTimeMillis();

		System.out.println("\nBubble Sort Took " + (endTime - startTime) +" ms for N Size : "+arraySize);
	} 

		
//O(nlogn)
	
	public void quickSort(int left, int right) {
				
		if (right - left <= 0)
			
			return;

		else {

			int pivot = theArray[right];

			int pivotLocation = partitionArray(left, right, pivot);

			quickSort(left, pivotLocation - 1);
			quickSort(pivotLocation + 1, right);

		}
		
		
	}

	
	public int partitionArray(int left, int right, int pivot) {

		int leftPointer = left - 1;
		int rightPointer = right;

		while (true) {

			while (theArray[++leftPointer] < pivot)
				;

			while (rightPointer > 0 && theArray[--rightPointer] > pivot)
				;

			if (leftPointer >= rightPointer) {

				break;

			} else {

				swapValues(leftPointer, rightPointer);

			}

		}

		swapValues(leftPointer, right);

		return leftPointer;

	}

	TimeAnalysis(int size) {

		arraySize = size;

		theArray = new int[size];

	}

	public void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			theArray[i] = (int) (Math.random() *1000) + 10;

		}

		itemsInArray = arraySize - 1;

	}

	public void swapValues(int indexOne, int indexTwo) {

		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;

	}

}
