package pkgs.pkgExes;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Pessoa {
	private Long id;
	private String nome;
	private char sexo;
	private Integer idade;

	public Pessoa() {
		super();
	}

	public Pessoa(Long id, String nome, char sexo, Integer idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
	}

	public static List<Pessoa> loadPessoasListFromTxtFile(File file){
		List<Pessoa> pessoas = new ArrayList<>();
		System.out.println("Exe001.loadPessoas()");
		Consumer<String> rowProcess = row -> {
			try {
				String [] rec = row.split(";");
				pessoas.add(new Pessoa(Long.parseLong(rec[0]), rec[1], rec[2].charAt(0), Integer.parseInt(rec[3])));
			} catch (Exception e) {
				throw new RuntimeException("Falha ao processar registro", e);
			}
		};
		try (Stream<String> stream = Files.lines(file.toPath())) {
			stream.forEach(rowProcess);
		} catch (Exception e) {
			throw new RuntimeException("Falha ao processar registros", e);
		}
		return pessoas;
	}

}

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {

		try {
			System.out.println("<>");
			sm1(args);
			new Exe001().im1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}

	}

	public static void sm1(String[] args) {
		System.out.println("Exe001.sm1()");
	}

	public void im1(String[] args) {
		System.out.println("Exe001.im1()");
		Path path = null;
		try {
			path = Paths.get(getClass().getResource("/txts/filePessoas.txt").toURI());
		} catch (Exception e) {
			throw new RuntimeException("Falha ao obter fonte de dados", e);
		}
		List<Pessoa> pessoas = Pessoa.loadPessoasListFromTxtFile(path.toFile());
		pessoas.forEach(System.out::println);
	}

}

/*

*/
