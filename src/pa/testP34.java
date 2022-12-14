package pa;
//109360127_電子三甲_許廷維
import java.io.*;
public class testP34 {

	public static void main(String[] args) 
	{
		System.out.println("請輸入字串");
		
		try {
			BufferedReader br1=new BufferedReader(
					new InputStreamReader(System.in));

			String str1 = br1.readLine();
	
			System.out.println("已輸入字串"+str1);
		}
		
		catch(IOException e){
			System.out.println("輸入輸出有誤");
		}
	}
}
/**/