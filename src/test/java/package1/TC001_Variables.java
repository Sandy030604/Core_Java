package package1;

public class TC001_Variables {
	private static double dblwidth=10;
	private static double dblheight=30;
	private static int dbldepth=4;
	
	
	private static int boxid;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value=calvolume();
		System.out.print(value);

	}
	public static double calvolume()
	{
		double doutemp;
		doutemp=dblwidth*dblheight*dbldepth;
		return doutemp;
	}
}
