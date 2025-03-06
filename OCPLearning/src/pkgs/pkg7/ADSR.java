package pkgs.pkg7;

public final class ADSR {

	private final StringBuilder name;
	private final int attack;
	private final int decay;

	public ADSR(StringBuilder name, int attack, int decay) {
		super();
		this.name = new StringBuilder(name);
		this.attack = attack;
		this.decay = decay;
	}

	public StringBuilder getName() {
		return new StringBuilder(name);
	}

	public ADSR getADSR() {
		return this;
	}
}
