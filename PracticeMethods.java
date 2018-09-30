// practice methods
import java.util.Scanner;
public class PracticeMethods
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int uOne;
		int uTwo;
		int uThree;
		System.out.println("enter first value");
		uOne = input.nextInt();
		System.out.println("enter second value");
		uTwo = input.nextInt();
		System.out.println("enter third value");
		uThree = input.nextInt();
		ALLThree minandMax = new ALLThree();
		int maxTwo = minandMax.maximus(uOne, uTwo, uThree);
		System.out.println("max from ALLThree" +maxTwo);
		System.out.println("min from ALLThree" + minandMax.minimum(uOne, uTwo, uThree));
		minandMax.both(uOne, uTwo, uThree);
		}
//outside the main but inside the class
		public static int maximus(int x, int y, int z)
		{
			int maximum = x;
			if(y>maximum)
			maximum = y;
			if(z>maximum)
			maximum = z;
			return maximum;


		}

}