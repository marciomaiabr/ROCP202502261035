package pkgs.pkgExes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;

class ClassA implements Serializable {
	private static final long serialVersionUID = 202601111030L;
	private String attr1;
	private String attr2;
	private String attr3;
	public ClassA(String attr1, String attr2, String attr3) {
		super();
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
	}
	@Override
	public String toString() {
		return "ClassA [attr1=" + attr1 + ", attr2=" + attr2 + ", attr3=" + attr3 + "]";
	}
    private void writeObject(ObjectOutputStream oos) throws IOException {
    	System.out.println("ClassA.writeObject()");
        oos.defaultWriteObject();
        oos.writeObject(LocalDate.of(2025, 12, 31));
    }
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    	System.out.println("ClassA.readObject()");
        ois.defaultReadObject();
        System.out.println("[ois.readObject()="+(ois.readObject())+"]");
        //System.out.println("[ois.readObject()="+(ois.readObject())+"]");//java.io.OptionalDataException
    }
}

public class Exe001 {



	public static void main(String[] args) {

		try {
			ClassA classA = new ClassA("A","B","C");
			System.out.println(classA);
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\temp\\obj.instance"));
			oos.writeObject(classA);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\temp\\obj.instance"));
			ClassA classA = (ClassA) ois.readObject();
			ois.close();
			System.out.println(classA);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\temp\\obj.instance"));
			Object classA = ois.readObject();
			ois.close();
			System.out.println(classA);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
