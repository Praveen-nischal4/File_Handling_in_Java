package SerializableConcept;

import java.io.*;

import java.util.Scanner;

public class TextBook implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4086686502038506863L;
	String authname;
	String bname;
	double price;
	
	public void input()
	{
		System.out.println("Enter Author name,Book name & Price");
		Scanner sn = new Scanner(System.in);
		authname=sn.next();
		bname= sn.next();
		price =sn.nextDouble();
		sn.close();
	}
	
	public void Display()
	{
		System.out.println(authname+" "+bname+" "+price);
	}

	public static void main(String[] args) throws IOException,FileNotFoundException, ClassNotFoundException{
 
       TextBook t= new TextBook();
       t.input();
       t.Display();
     FileOutputStream o = new FileOutputStream("TextBook.txt");
     ObjectOutputStream s = new ObjectOutputStream(o);
     s.writeObject(t);
     s.close();
     System.out.println("Object written in file Successfully");
     
     
     ObjectInputStream oi = new ObjectInputStream(new FileInputStream("TextBook.txt"));
         TextBook k = (TextBook) oi.readObject();
         k.Display();
	}

}
