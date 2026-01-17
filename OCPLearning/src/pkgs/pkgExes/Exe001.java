package pkgs.pkgExes;



public class Exe001 {

	class ClassA {
		int level = 0;
		public String letra = "A";
		@Override public String toString() { return "[ClassA][level="+(level)+"]"; }
		//public String getClassBthis() { return ClassB.this.toString(); }//No enclosing instance of the type Exe001.ClassA.ClassB is accessible in scope
		//public String getClassAClassBthis() { return ClassA.ClassB.this.toString(); }//No enclosing instance of the type Exe001.ClassA.ClassB is accessible in scope
		public String getClassAthis() { return ClassA.this.toString(); }
		class ClassB {
			int level = 1;
			public String letra = "B";
			@Override public String toString() { return "[ClassB][level="+(level)+"]"; }
			public String getClassBthis() { return ClassB.this.toString(); }
			public String getClassAClassBthis() { return ClassA.ClassB.this.toString(); }
			public String getClassAthis() { return ClassA.this.toString(); }
			class ClassC {
				int level = 2;
				public String letra = "C";
				@Override public String toString() { return "[ClassC][level="+(level)+"]"; }
				public String getClassBthis() { return ClassB.this.toString(); }
				public String getClassAClassBthis() { return ClassA.ClassB.this.toString(); }
				public String getClassAthis() { return ClassA.this.toString(); }
			}
		}
	}

	public static void main(String[] args) {

		new Exe001().go();

	}

	void go() {

		ClassA ca = new ClassA();
		System.out.println("[ca="+(ca)+"]"+"[ca.letra="+(ca.letra)+"]");
		ClassA.ClassB cb = ca.new ClassB();
		System.out.println("[cb="+(cb)+"]"+"[cb.letra="+(cb.letra)+"]");
		ClassA.ClassB.ClassC cc = cb.new ClassC();
		System.out.println("[cc="+(cc)+"]"+"[cc.letra="+(cc.letra)+"]"+"[cc.getClassBthis()="+(cc.getClassBthis())+"]"+"[cc.getClassAClassBthis()="+(cc.getClassAClassBthis())+"]"+"[cc.getClassAthis()="+(cc.getClassAthis())+"]");

	}

}
