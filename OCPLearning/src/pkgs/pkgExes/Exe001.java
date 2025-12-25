package pkgs.pkgExes;

public class Exe001 {
	private int level = 0;
	@Override public String toString() { return ("["+this.getClass().getSimpleName()+"]"+"["+this.level+"]"); }
	class NivelA {
		private int level = 1;
		@Override public String toString() { return ("["+Exe001.this.getClass().getSimpleName()+"]"+"["+Exe001.this.level+"]"+"[.]"+"["+this.getClass().getSimpleName()+"]"+"["+this.level+"]"); }
		class NivelB {
			private int level = 2;
			@Override public String toString() { return ("["+Exe001.this.getClass().getSimpleName()+"]"+"["+Exe001.this.level+"]"+"[.]"+"["+NivelA.this.getClass().getSimpleName()+"]"+"["+NivelA.this.level+"]"+"[.]"+"["+this.getClass().getSimpleName()+"]"+"["+this.level+"]"); }
			class NivelC {
				private int level = 3;
				@Override public String toString() { return ("["+Exe001.this.getClass().getSimpleName()+"]"+"["+Exe001.this.level+"]"+"[.]"+"["+NivelA.this.getClass().getSimpleName()+"]"+"["+NivelA.this.level+"]"+"[.]"+"["+NivelB.this.getClass().getSimpleName()+"]"+"["+NivelB.this.level+"]"+"[.]"+"["+this.getClass().getSimpleName()+"]"+"["+this.level+"]"); }
			}
		}
	}

	public static void main(String[] args) {

		System.out.println(new Exe001());
		System.out.println(new Exe001().new NivelA());
		System.out.println(new Exe001().new NivelA().new NivelB());
		System.out.println(new Exe001().new NivelA().new NivelB().new NivelC());

	}

}
