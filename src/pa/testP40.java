package pa;
//109360127_�q�l�T��_�\�ʺ�
import java.io.*;
public class testP40 {

	public static void main(String[] args) 
	{
		if(args.length !=1) {
			System.out.println("�Ы��w���T���ɮצW��");
			System.exit(1);
		}
		
		try {
			BufferedReader br1=new BufferedReader(
					new FileReader(args[0]));
			
			String str1 ;
			while((str1= br1.readLine())!=null) {
				System.out.println(str1);
			}
			br1.close();
		}
		
		catch(IOException e){
			System.out.println("��J��X���~");
		}
	}
}
/**/