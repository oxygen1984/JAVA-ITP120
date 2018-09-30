//maximum and min and both class

public class ALLThree
{
public void both(int a, int b, int c)
{
	System.out.println("max is" + maximus(a,b,c));
	System.out.println("min is" + minimum(a,b,c));
}
public int maximus(int x, int y, int z)
			{
				int maximum = x;
				if(y>maximum)
				maximum = y;
				if(z>maximum)
				maximum = z;
				return maximum;


		}
public static int minimum(int x, int y, int z)
			{
				int minimum= x;
				if(y<minimum)
				minimum = y;
				if(z<minimum)
				minimum = z;
				return minimum;
}
public int returnCheck (int y)

{
	int z = 1;
	if(z>y)
	return z;
	else
	return z;
}
}