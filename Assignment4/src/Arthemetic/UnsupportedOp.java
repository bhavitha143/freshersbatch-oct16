package Arthemetic;

public class UnsupportedOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,0};
		int c=8;
		try {
			System.out.println(arr[1]/arr[2]);
		}catch(UnsupportedOperationException e)
		{
			System.out.println("Unsupported Operation Exception");
		}

	}

}
