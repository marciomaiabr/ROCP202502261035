package pkgs.pkgExes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;

class Animal {
	private String atributo1 = "vAtributo1";
	private String atributo2;
	private String atributo3;
	private String atributo4;
	private String atributo5;
	public Animal() {
		super();
		System.out.println("Animal.Animal()");
		this.atributo2 = "vAtributo2";
	}
	public Animal(String atributo4) {
		super();
		System.out.println("Animal.Animal(String atributo3)");
		this.atributo3 = "vAtributo3";
		this.atributo4 = atributo4;
	}
	public String getAtributo1() {
		return atributo1;
	}
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	public String getAtributo2() {
		return atributo2;
	}
	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}
	public String getAtributo3() {
		return atributo3;
	}
	public void setAtributo3(String atributo3) {
		this.atributo3 = atributo3;
	}
	public String getAtributo4() {
		return atributo4;
	}
	public void setAtributo4(String atributo4) {
		this.atributo4 = atributo4;
	}
	public String getAtributo5() {
		return atributo5;
	}
	public void setAtributo5(String atributo5) {
		this.atributo5 = atributo5;
	}
	@Override
	public String toString() {
		return "[atributo1="+(atributo1)+"][atributo2="+(atributo2)+"][atributo3="+(atributo3)+"][atributo4="+(atributo4)+"][atributo5="+(atributo5)+"]";
	}
}

class Dog extends Animal implements Serializable {
	private String atributo6 = "vAtributo6";
	private String atributo7;
	private String atributo8;
	private String atributo9;
	private String atributo10;
	public Dog() {
		super();
		System.out.println("Dog.Dog()");
		this.atributo7 = "vAtributo7";
	}
	public Dog(String atributo9) {
		super("vAtributo88");
		System.out.println("Dog.Dog(String atributo8)");
		this.atributo8 = "vAtributo8";
		this.atributo9 = atributo9;
	}
	public String getAtributo6() {
		return atributo6;
	}
	public void setAtributo6(String atributo6) {
		this.atributo6 = atributo6;
	}
	public String getAtributo7() {
		return atributo7;
	}
	public void setAtributo7(String atributo7) {
		this.atributo7 = atributo7;
	}
	public String getAtributo8() {
		return atributo8;
	}
	public void setAtributo8(String atributo8) {
		this.atributo8 = atributo8;
	}
	public String getAtributo9() {
		return atributo9;
	}
	public void setAtributo9(String atributo9) {
		this.atributo9 = atributo9;
	}
	public String getAtributo10() {
		return atributo10;
	}
	public void setAtributo10(String atributo10) {
		this.atributo10 = atributo10;
	}
	@Override
	public String toString() {
		return ""
				+"[Animal=[atributo1="+(getAtributo1())+"][atributo2="+(getAtributo2())+"][atributo3="+(getAtributo3())+"][atributo4="+(getAtributo4())+"][atributo5="+(getAtributo5())+"]]"
				+"\n"
				+"[Dog=[atributo6="+(atributo6)+"][atributo7="+(atributo7)+"][atributo8="+(atributo8)+"][atributo9="+(atributo9)+"][atributo10="+(atributo10)+"]]"
				+"";
	}
}

public class Exe001 {

	public static void main(String[] args) {
		System.out.println("<>");
		m1(args);
		System.out.println("</>");
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");
		File file = new File("C:\\temp\\dog.ser");
		try {
			System.out.println("serialization");
			Files.deleteIfExists(file.toPath());
			Dog dog = new Dog();
			dog.setAtributo1("vSetAtributo1");
			dog.setAtributo2("vSetAtributo2");
			dog.setAtributo3("vSetAtributo3");
			dog.setAtributo4("vSetAtributo4");
			dog.setAtributo5("vSetAtributo5");
			dog.setAtributo6("vSetAtributo6");
			dog.setAtributo7("vSetAtributo7");
			dog.setAtributo8("vSetAtributo8");
			dog.setAtributo9("vSetAtributo9");
			dog.setAtributo10("vSetAtributo10");
			System.out.println(file.exists());
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dog);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("deserialization");
			FileInputStream fos = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fos);
			Dog dog = (Dog) ois.readObject();
			System.out.println(dog);
			ois.close();
			Files.deleteIfExists(file.toPath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
<>
Exe001.m1()
serialization
Animal.Animal()
Dog.Dog()
false
deserialization
Animal.Animal()
[Animal=[atributo1=vAtributo1][atributo2=vAtributo2][atributo3=null][atributo4=null][atributo5=null]]
[Dog=[atributo6=vSetAtributo6][atributo7=vSetAtributo7][atributo8=vSetAtributo8][atributo9=vSetAtributo9][atributo10=vSetAtributo10]]
</>
*/

/*

*/

/*

*/
