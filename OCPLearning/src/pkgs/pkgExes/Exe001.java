package pkgs.pkgExes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Pessoa implements Serializable {
	private static final long serialVersionUID = 202512170815L;
	private Long id;
	private String nome;
	public Pessoa() {
		super();
	}
	public Pessoa(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}
}

public class Exe001 {

	public static void main(String[] args) {

		try {
			Pessoa pessoa = new Pessoa(7l, "Marcio");
			System.out.println(pessoa);
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\temp\\f202512170820.pessoa"));
			oos.writeObject(pessoa);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\temp\\f202512170820.pessoa"));
			Pessoa pessoa = (Pessoa) ois.readObject();
			ois.close();
			System.out.println(pessoa);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
