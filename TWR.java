
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TWR {

	public static void main(String[] args) {

		try(    // Using multiple resources  
		        FileOutputStream fileOutputStream =new FileOutputStream("F:/abc.txt");  
		        InputStream input = new FileInputStream("F:/abc.txt")){  
		        // -----------------------------Code to write data into file--------------------------------------------//  
		        String msg = "Welcome to Kalewadi Phata!";      
		        byte byteArray[] = msg.getBytes();  // Converting string into byte array      
		        
		        fileOutputStream.close();
		        
		        fileOutputStream.write(byteArray);  // Writing  data into file  
		        System.out.println("------------Data written into file--------------");  
		        
		        System.out.println(msg);  
		        // -----------------------------Code to read data from file---------------------------------------------//  
		        // Creating input stream instance  
		        DataInputStream inst = new DataInputStream(input);    
		        int data = input.available();    
		        // Returns an estimate of the number of bytes that can be read from this input stream.   
		        byte[] byteArray2 = new byte[data]; //    
		        inst.read(byteArray2);    
		        String str = new String(byteArray2); // passing byte array into String constructor  
		        System.out.println("------------Data read from file--------------");  
		       
		        
		        System.out.println(str); // display file data  
		        
		        }catch(Throwable exception){  
			
		
		       System.out.println(exception);  
		}     
	}
}

