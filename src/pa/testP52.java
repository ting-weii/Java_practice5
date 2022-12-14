package pa;
//109360127_電子三甲_許廷維
public class testP52 {

	public static void main(String[] args) 
	{
		Company cmp1 = new Company();
		
		Driver dr1 = new Driver(cmp1);
		dr1.start();
		
		Driver dr2 = new Driver(cmp1);
		dr2.start();
	}
}
/*
class Company{
	private int sum=0;
	
	public void add(int a)
	{
		int tmp = sum;
		System.out.println("目前的合計金額是"+tmp+"元");
		System.out.println("賺到了"+a+"元");
		tmp = tmp + a;
		System.out.println("合計的金額是"+tmp+"元");
		sum = tmp;
	}
}

class Driver extends Thread{
	private Company comp;
	
	public Driver(Company c)
	{
		comp = c;
	}
	
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			comp.add(50);
		}
	}
}
*/