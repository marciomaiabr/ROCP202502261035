package pkgs.pkgExes;

import java.util.Arrays;

class ClassA{
	public ClassA(Integer i) {System.out.println("[i="+(i)+"]"+"");}
	public ClassA() {System.out.println("[=()]"+"");}
}

class ClassB{
	public ClassB(String s) {System.out.println("[s="+(s)+"]"+"");}
	public ClassB() {System.out.println("[=()]"+"");}
}

class ClassC{
	public ClassC() {System.out.println("[=()]"+"");}
}

public class Exe001 {



	public static void main(String[] args) {

		Arrays.asList(1,2,3).forEach(ClassA::new);
		//Arrays.asList(1,2,3).forEach(ClassB::new);//compilation problem://The type ClassB does not define ClassB(Integer) that is applicable here
		//Arrays.asList(1,2,3).forEach(ClassC::new);//compilation problems://The method forEach(Consumer<? super Integer>) in the type Iterable<Integer> is not applicable for the arguments (ClassC::new)//The type ClassC does not define ClassC(Integer) that is applicable here

	}



}
