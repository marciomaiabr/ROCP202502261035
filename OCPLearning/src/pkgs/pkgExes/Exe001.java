package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

import pkgs.pkg0.*;

public class Exe001 {

	static {
		System.out.println(LocalDateTime.now());
	}

	public static void main(String[] args) {
		try {
			System.out.println("<>");
			m1(args);
			System.out.println("</>");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Runtime.getRuntime().exec("cmd.exe /c C:\\Users\\Administrador\\git\\ROCP202502261035\\OCPLearning\\logs\\logMM.txt");
		} catch (Exception e) {}
	}

	public static void m1(String[] args) {
		System.out.println("Exe001.m1()");

		Chave chave1 = new Chave(1l);
		Chave chave2 = new Chave(2l);
		Chave chave3 = new Chave(3l);
		Chave chave4 = new Chave(4l);
		Chave chave5 = new Chave(5l);
		Chave chave6 = new Chave(6l);
		Chave chave7 = new Chave(7l);

		Pessoa pessoaA = new Pessoa(new Id(true), "PessoaA");
		Pessoa pessoaB = new Pessoa(new Id(true), "PessoaB");
		Pessoa pessoaC = new Pessoa(new Id(true), "PessoaC");
		Pessoa pessoaD = new Pessoa(new Id(true), "PessoaD");
		Pessoa pessoaE = new Pessoa(new Id(true), "PessoaE");
		Pessoa pessoaF = new Pessoa(new Id(true), "PessoaF");
		Pessoa pessoaG = new Pessoa(new Id(true), "PessoaG");

		Map<Chave, Pessoa> m = new TreeMap<>(new Comparator<Chave>() {
			@Override
			public int compare(Chave c1, Chave c2) {
				System.out.println("Exe001.m1(...).new Comparator() {...}.compare()"+"[this="+(this)+"]"+"[c1="+(c1)+"]"+"[c2="+(c2)+"]");
				int intCompare = Long.compare(c1.getCodigo(), c2.getCodigo());
				System.out.println("[intCompare="+(intCompare)+"]");
				return intCompare;
			}});

		System.out.println("\n\nm.puts");

		System.out.println("\nm.put(chave1, pessoaA)");
		System.out.println(m.put(chave1, pessoaA));
		System.out.println("\nm.put(chave2, pessoaB)");
		System.out.println(m.put(chave2, pessoaB));
		System.out.println("\nm.put(chave3, pessoaC)");
		System.out.println(m.put(chave3, pessoaC));
		System.out.println("\nm.put(chave4, pessoaD)");
		System.out.println(m.put(chave4, pessoaD));
		System.out.println("\nm.put(chave5, pessoaE)");
		System.out.println(m.put(chave5, pessoaE));
		System.out.println("\nm.put(chave6, pessoaF)");
		System.out.println(m.put(chave6, pessoaF));
		System.out.println("\nm.put(chave7, pessoaG)");
		System.out.println(m.put(chave7, pessoaG));

		System.out.println();
		System.out.println("\nm.forEach"+"\n");
		m.forEach((k,v) -> System.out.println("[k="+(k)+"]"+"[v="+(v)+"]"));
	}

}

/*

*/
