package pa;
//109360127_電子三甲_許廷維
import java.io.*;
public class testP35 {

	public static void main(String[] args) 
	{
		try {
			FileWriter fw1 = new FileWriter("test1.txt");
			PrintWriter pw1 = new PrintWriter(
					new BufferedWriter(fw1));
			
			pw1.println("Hello!");
			pw1.println("GoodBye!");
			pw1.close();
		
			System.out.println("資料已經寫入檔案了");
		}
		
		catch(IOException e){
			System.out.println("輸入輸出有誤");
		}
	}
}
/**/