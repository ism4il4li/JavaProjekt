import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) {
		File file = new File("src/ShopItems");
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String name = br.readLine();
		    System.out.println("ItemName: "+ name);
			String hp = br.readLine();
		    System.out.println("hp: "+ hp);
			String exp = br.readLine();
		    System.out.println("exp: "+ exp);
			String ap = br.readLine();
		    System.out.println("ap: "+ ap);
			String pp = br.readLine();
		    System.out.println("pp: "+ pp);
			String sp = br.readLine();
		    System.out.println("sp: "+ sp);
			fr.close();
			br.close();
		}
		catch(IOException e) {
			System.out.println("Error: "+e);
		}
	}

}
