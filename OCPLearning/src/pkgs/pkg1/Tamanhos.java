package pkgs.pkg1;

public enum Tamanhos implements Pessoa {

	//SEM_TAMANHO(),
	PEQUENO(10),
	MEDIO(20),
	GRANDE(30);

	Tamanhos() {
		System.out.println("Tamanhos.Tamanhos()");
	}

	Tamanhos(Integer codigo) {
		System.out.println("Tamanhos.Tamanhos(Integer codigo)");
		this.codigo = codigo;
	}

	private Integer codigo;
	public Integer getCodigo() {
		return this.codigo;
	}
	public static Tamanhos getByCodigo(Integer codigo) {
		for (int i = 0; i < Tamanhos.values().length; i++) {
			if(Tamanhos.values()[i].getCodigo()!= null && Tamanhos.values()[i].getCodigo().equals(codigo))
				return Tamanhos.values()[i];
		}
		return null;
	}

}
