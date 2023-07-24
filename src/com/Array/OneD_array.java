package com.Array;


public class OneD_array {
	
	// 1. Remove even integer
	public static int[] removeEvenIntegers(int[] arr) {
        // Step 1: Count the number of odd integers
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }

        // Step 2: Create a new array for odd integers
        int[] oddArr = new int[oddCount];

        // Step 3: Copy odd integers to the new array
        int index = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                oddArr[index] = num;
                index++;
            }
        }

        // Step 4: Return the new array
        return oddArr;
    }
	
	// 2. to Finding the maximum number in an array
	public static int maximum(int[] elem) {
		
		int maxSoFar = elem[0];
		
		for(int num:elem) {
			if(num>maxSoFar) {
				num = maxSoFar;
			}
		}
		return maxSoFar;
	}
	
	// 3. Reverse a array
	public static void reversearray(int[] numbers, int start, int end) {
		
		while(start<end) {
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			
			start++;
			end--;
		}
		
	}
	
	//4. Minimum number in array
	public static int minimum(int[] arr) {
		
		int minValue = arr[0];
		for(int num:arr) {
			if(num<minValue) {
				minValue=num; 
			}
		}
		System.out.println("\nMinimum value in an array is : \n");
		return minValue;
	}
	
	//5. Second Maximum value 
	public static int secondmaxValue(int[] ar) {
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i]>max) {
				secondmax = max;
				max = ar[i];
			}
			else if(ar[i]>secondmax && ar[i] != max) {
				secondmax = ar[i];
			}
		}
		System.out.println("\n Second Maximum Value is : ");
		return secondmax;
	}
	
	//6. Move Zeros 
	public static int[] moveZero(int[] arr) {
		System.out.println("******************************************");
		System.out.println("\nBefore Moving zero Values : ");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0 ) {
				j++;
			}
		}
		System.out.println("\n Moving zero values : ");
		return arr;
	}
	
	//7 Resize of an array 
	public static int[] resize(int[] arr , int capacity) {
		int[] temp = new int[capacity];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		
		return arr;
	}
	
	//8. Finding a missing value
	public static int findmissValue(int[] arr) {
		int n = arr.length+1;
		int sum = (n*(n+1))/2;
		
		for(int num:arr) {
			sum = sum-num;
		}
		return sum;
	}
	
	//9. Rotate an array by 1
	public static void rotateONE(int[] arr) {
		int temp = arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		
		arr[arr.length-1] = temp;
	}
	
	//10. Rotate an array by k
	public static void rotateBYk(int[] ar, int k) {
		k = k%ar.length;
		if(k<0) {
			k = k+ar.length;
		}
		for(int i=1; i<=k; i++) {
			rotateONE(ar);
		}
	}
	
	//11. Rotate an array in efficient way
	public static void rotation(int[] ar, int k) {
		k=k%ar.length;
		if(k<0) {
			k=k+ar.length;
		}
			
			reversearray(ar, 0, k-1);
			reversearray(ar, k, ar.length-1);
			reversearray(ar, 0, ar.length-1);
	}
	
	//12. Making an array an non Descending Order
	public static boolean checkPossibility(int[] ar) {
		int count =0;
		for(int i=1; i<ar.length; i++) {
			if(ar[i] < ar[i-1]) {
				count++;
				if(count>1) {
					return false;
				}
				if(i-2>=0 && ar[i]<ar[i-2])
					ar[i] = ar[i-1];
				else
					ar[i-1] = ar[i];
			}
		}
		return true;
	}
	
	//13. Equilibrium condition
	public static int equilibrium(int[] ar) {
		int total =0;
		for(int i=0; i<ar.length; i++) {
			total+=ar[i];
		}
		
		int leftsum = 0;
		
		for(int i=0; i<ar.length; i++) {
			
			total-=ar[i];
			
			if(leftsum == total)
				return i;
			
			leftsum+=ar[i];
		}
		
		return -1;
	}
	
	public static void main(String ar[]) {
		
		int arr[] = {12,18,6,7,15,3,21};
		
		int[] odd = removeEvenIntegers(arr);
		
		for(int num:odd) {
			System.out.println(num);
		}
	
		
		System.out.println(secondmaxValue(arr));
		int[] array = {8,5,2,7,0,1,0,9};
		int[] move = moveZero(array);
		for(int num : move) {
			System.out.print(num + " ");
		}
		System.out.println("\n*********************************");
		int[]reSIZE = resize(array, 15);
		for(int num : reSIZE) {
			System.out.print(num + " ");
		}
		
		System.out.println("\n*************************************");
		
		int[] ro = {1,2,3,4,5};
		for(int i=0; i<ro.length; i++) {
			System.out.print(ro[i] + " ");
		}
		System.out.println();
		//rotateBYk(ro, 3);
		//for(int i=0; i<ro.length; i++) {
			//System.out.print(ro[i] + " ");
		//}
		System.out.println("\nEfficient rotation is : ");
		rotation(ro, -3);
		for(int i=0; i<ro.length; i++) {
			System.out.print(ro[i] + " ");
		}
		
		System.out.println("\n*************************************");
		
		int[] check = {4,2,3};
		System.out.println(checkPossibility(check));
		
		System.out.println("\n*************************************");
		 
		int[] equilibrium  = { -7, 1, 5, 2, -4, 3, 0 };
		System.out.println(equilibrium(equilibrium));
		
		System.out.println("\n*************************************");
		
	}

}
