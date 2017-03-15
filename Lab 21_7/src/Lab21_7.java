public class Lab21_7 {

	public static void init(long[] arr) {
		// Initialize all the entries of the array to 0
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
	}

	public static long sumAll(int max) {
		// sumAll basic version
		//System.out.println("Called sumAll(" + max + ")");

		long result;

		if (max <= 1)
			result = 1;
		else
			result = max + sumAll(max-1);
		//System.out.println("Return sumAll(" + max + ") = " + result);
		return result;

	}

	public static long sumAll(long[] arr, int max) {
		// Simple Recursion with array
		//System.out.println("Called sumAll(" + max + ")");

		if (max <= 1) 
			arr[max] = 1;
		else if (arr[max] == 0)
			arr[max] = max + sumAll(arr, max - 1);

		//System.out.println("Return sumAll(" + max + ") = " + arr[max]);

		return arr[max];
	}
	public static long squareSum(int max) {

		//System.out.println("Called squareSum(" + max + ")");

		long result;

		if (max <= 1)
			result = 1;
		else
			result = max*max + squareSum(max-1);
		//System.out.println("Return squareSum(" + max + ") = " + result);
		return result;

	}

	public static long squareSum(long[] arr, int max) {

		//System.out.println("Called squareSum(" + max + ")");

		if (max <= 1) 
			arr[max] = 1;
		else if (arr[max] == 0)
			arr[max] = (max*max) + squareSum(arr, max - 1);

		//System.out.println("Return squareSum(" + max + ") = " + arr[max]);

		return arr[max];
	}
	public static long fib(int max) {

		//System.out.println("Called fib(" + max + ")");
		long result = 0;
		if (max == 0)
			result = 0;
		if (max == 1)
			result = 1;
		else if(max > 1)
			result = fib(max-1) + fib(max-2);

		//System.out.println("Return fib(" + max + ") = " + result);
		return result;

	}

	public static long fib(long[] arr, int max) {

		//System.out.println("Called fib(" + max + ")");

		if (max <= 1) 
			arr[max] = 1;
		else if (arr[max] == 0)
			arr[max] = fib(arr, max - 1) + fib(arr, max - 2);

		//System.out.println("Return fib(" + max + ") = " + arr[max]);

		return arr[max];
	}
	public static long factorial(int max) {

		//System.out.println("Called factorial(" + max + ")");

		long result;

		if (max <= 1)
			result = 1;
		else
			result = max * factorial(max-1);
		//System.out.println("Return factorial(" + max + ") = " + result);
		return result;

	}

	public static long factorial(long[] arr, int max) {

		//System.out.println("Called factorial(" + max + ")");

		if (max <= 1) 
			arr[max] = 1;
		else if (arr[max] == 0)
			arr[max] = max * factorial(arr, max - 1);

		//System.out.println("Return factorial(" + max + ") = " + arr[max]);

		return arr[max];
	}


	public static void main(String[] args) {

		final int MAXSIZE = 100;
		long[] arr = new long[MAXSIZE];

		System.out.println("sumAll output for 5 is " + sumAll(5));
		System.out.println("sumAll output for 10 is " + sumAll(10));
		System.out.println("sumAll output for 20 is " + sumAll(20));
		System.out.println("sumAll output for 15 is " + sumAll(15));
		System.out.println();

		init(arr);
		System.out.println("sumAll output for 5 is " + sumAll(arr, 5));
		System.out.println("sumAll output for 10 is " + sumAll(arr, 10));
		System.out.println("sumAll output for 20 is " + sumAll(arr, 20));
		System.out.println("sumAll output for 15 is " + sumAll(arr, 15));
		System.out.println();


		System.out.println("squareSum output for 5 is " + squareSum(5));
		System.out.println("squareSum output for 10 is " + squareSum(10));
		System.out.println("squareSum output for 20 is " + squareSum(20));
		System.out.println("squareSum output for 15 is " + squareSum(15));
		System.out.println();

		init(arr);
		System.out.println("squareSum output for 5 is " + squareSum(arr, 5));
		System.out.println("squareSum output for 10 is " + squareSum(arr, 10));
		System.out.println("squareSum output for 20 is " + squareSum(arr, 20));
		System.out.println("squareSum output for 15 is " + squareSum(arr, 15));
		System.out.println(); 

		System.out.println("Fibonacci Number 5 is " + fib(5));
		System.out.println("Fibonacci Number 10 is " + fib(10));
		System.out.println("Fibonacci Number 20 is " + fib(20));
		System.out.println("Fibonacci Number 15 is " + fib(15));
		System.out.println();

		init(arr);
		System.out.println("Fibonacci Number 5 is " + fib(arr, 5));
		System.out.println("Fibonacci Number 10 is " + fib(arr, 10));
		System.out.println("Fibonacci Number 20 is " + fib(arr, 20));
		System.out.println("Fibonacci Number 15 is " + fib(arr, 15));
		System.out.println();

		System.out.println("Factorial of 5 is " + factorial(5));
		System.out.println("Factorial of 10 is " + factorial(10));
		System.out.println("Factorial of 20 is " + factorial(20));
		System.out.println("Factorial of 15 is " + factorial(15));
		System.out.println();

		init(arr);
		System.out.println("Factorial of 5 is " + factorial(arr, 5));
		System.out.println("Factorial of 10 is " + factorial(arr, 10));
		System.out.println("Factorial of 20 is " + factorial(arr, 20));
		System.out.println("Factorial of 15 is " + factorial(arr, 15));

	} 

}
