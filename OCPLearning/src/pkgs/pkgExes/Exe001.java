package pkgs.pkgExes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentA implements Serializable {
	private static final long serialVersionUID = 202602160743L;
	private String nome;
	public StudentA() {
		super();
	}
	public StudentA(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override public String toString() { return "Student [nome=" + nome + "]"; }
}

class StudentB implements Serializable {
	private static final long serialVersionUID = 202602160743L;
	private String nome;
	public StudentB() {
		super();
	}
	public StudentB(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override public String toString() { return "Student [nome=" + nome + "]"; }
}

public class Exe001 {



	public static void main(String[] args) {

		File f = new File("C:\\temp\\objetos.obj");

		try {
			StudentA sA1 = new StudentA("Bia");
			StudentA sA2 = null;
			StudentA sA3 = new StudentA("Ana");
			StudentB sB1 = new StudentB("Carla");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(sA1);
			oos.flush();
			oos.writeObject(sA2);
			oos.flush();
			oos.writeObject(sA3);
			oos.flush();
			oos.writeObject(sB1);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			StudentA sA1 = (StudentA) ois.readObject();
			System.out.println("[sA1="+(sA1)+"]");
			StudentA sA2 = (StudentA) ois.readObject();
			System.out.println("[sA2="+(sA2)+"]");
			StudentA sA3 = (StudentA) ois.readObject();
			System.out.println("[sA3="+(sA3)+"]");
			StudentB sB4 = (StudentB) ois.readObject();
			System.out.println("[sB4="+(sB4)+"]");
			ois.close();
		} catch (EOFException e) {
			System.out.println("Fim do arquivo...");
		} catch (Exception e) {
			e.printStackTrace();
		}

		StudentA sa = null;
		Object o = (Object) sa;
		StudentB sb = (StudentB) o;
		System.out.println(sb);

	}



}
