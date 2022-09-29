package workingwithFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Vector;

public class SerializationDemo {
	/*
	 * public static void store(List<Person1> list, String filename) throws
	 * FileNotFoundException, IOException { try (ObjectOutputStream outstream = new
	 * ObjectOutputStream(new FileOutputStream(filename));) {
	 * outstream.writeObject(list); } }
	 */

	/**
	 * Loads a list of {@link Person1} from a file
	 * 
	 * @param filename
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("unchecked")
	
	  public static List<Person1> load(String filename) throws
	  FileNotFoundException, IOException, ClassNotFoundException { try
	  (ObjectInputStream instream = new ObjectInputStream(new
	  FileInputStream(filename));) { return (List<Person1>) instream.readObject();
	  } }
	 
	public static void main(String[] args) throws ClassNotFoundException {
		if (args.length != 1) {
			System.out.println("Usage: java module6.SerializationDemo filename");
			System.exit(-1);
		}

		// Getting the list ready
		Person1 p1 = new Person1("Karl Pearson",79, "UnitedKingdom"),
				p2 = new Person1("John Tukey",89, "United States");

		Vector<Person1> inList = new Vector<Person1>();
		inList.add(p1);
		inList.add(p2);

		try {
			// Store the list to a file
//			SerializationDemo.store(inList, args[0]);

			// Load the list from a file
			List<Person1> outList = SerializationDemo.load(args[0]);
			for (Person1 p : outList)
				System.out.println(p.toString());
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
}
