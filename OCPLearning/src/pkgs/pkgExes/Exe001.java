package pkgs.pkgExes;

class ClassA {
	String s = "A";
}

public class Exe001 extends ClassA {

	String s = "E";

	public static void main(String[] args) {

		ClassA tipo_ClassA_instance_ClassA = new ClassA();
		System.out.println("[tipo_ClassA_instance_ClassA="+(tipo_ClassA_instance_ClassA.s)+"]");
		ClassA tipo_ClassA_instance_Exe001 = new Exe001();
		System.out.println("[tipo_ClassA_instance_Exe001="+(tipo_ClassA_instance_Exe001.s)+"]"+"[((Exe001)tipo_ClassA_instance_Exe001).s="+(((Exe001)tipo_ClassA_instance_Exe001).s)+"]");
		ClassA tipo_ClassA_instance_ClassAA = new ClassAA();
		System.out.println("[tipo_ClassA_instance_ClassAA="+(tipo_ClassA_instance_ClassAA.s)+"]"+"[((ClassAA)tipo_ClassA_instance_ClassAA).s="+(((ClassAA)tipo_ClassA_instance_ClassAA).s)+"]");

		System.out.println();

		Exe001 tipo_Exe001_instance_Exe001 = new Exe001();
		System.out.println("[tipo_Exe001_instance_Exe001="+(tipo_Exe001_instance_Exe001.s)+"]");
		Exe001 tipo_Exe001_instance_ClassAA = new ClassAA();
		System.out.println("[tipo_Exe001_instance_ClassAA="+(tipo_Exe001_instance_ClassAA.s)+"]"+"[((ClassAA)tipo_Exe001_instance_ClassAA).s="+(((ClassAA)tipo_Exe001_instance_ClassAA).s)+"]"+"[((ClassA)tipo_Exe001_instance_ClassAA).s="+(((ClassA)tipo_Exe001_instance_ClassAA).s)+"]");

		System.out.println();

		ClassAA tipo_ClassAA_instance_ClassAA = new ClassAA();
		System.out.println("[tipo_ClassAA_instance_ClassAA="+(tipo_ClassAA_instance_ClassAA.s)+"]"+"[((Exe001)tipo_ClassAA_instance_ClassAA).s="+(((Exe001)tipo_ClassAA_instance_ClassAA).s)+"]"+"[((ClassA)tipo_ClassAA_instance_ClassAA).s="+(((ClassA)tipo_ClassAA_instance_ClassAA).s)+"]");

	}

}

class ClassAA extends Exe001 {
	String s = "AA";
}
