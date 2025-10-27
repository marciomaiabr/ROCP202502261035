package pkgs.pkgExes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exe001 {

	public static <E extends Number> void m_pede_List_extends_Number(List<E> nums) {}
	public static <E extends Number> List<E> m_devolve_List_extends_Number() {return null;}
	public static <E extends Number> void m_pede_ArrayList_extends_Number(ArrayList<E> nums) {}
	public static <E extends Number> ArrayList<E> m_devolve_ArrayList_extends_Number() {return null;}

	public static void main(String[] args) {

		List<Number> oListNumber = null;
		ArrayList<Number> oArrayListNumber = null;
		List<Integer> oListInteger = null;
		ArrayList<Integer> oArrayListInteger = null;

		m_pede_List_extends_Number(oListNumber);
		m_pede_List_extends_Number(oArrayListNumber);
		m_pede_List_extends_Number(oListInteger);
		m_pede_List_extends_Number(oArrayListInteger);

		oListNumber = m_devolve_List_extends_Number();
		//oArrayListNumber = m_devolve_List_extends_Number();//Type mismatch: cannot convert from List<Number> to ArrayList<Number>
		oListInteger = m_devolve_List_extends_Number();
		//oArrayListInteger = m_devolve_List_extends_Number();//Type mismatch: cannot convert from List<Number> to ArrayList<Integer>

		//m_pede_ArrayList_extends_Number(oListNumber);//The method m_pede_ArrayList_extends_Number(ArrayList<E>) in the type Exe001 is not applicable for the arguments (List<Number>)
		m_pede_ArrayList_extends_Number(oArrayListNumber);
		//m_pede_ArrayList_extends_Number(oListInteger);//The method m_pede_ArrayList_extends_Number(ArrayList<E>) in the type Exe001 is not applicable for the arguments (List<Integer>)
		m_pede_ArrayList_extends_Number(oArrayListInteger);

		oListNumber = m_devolve_ArrayList_extends_Number();
		oArrayListNumber = m_devolve_ArrayList_extends_Number();
		oListInteger = m_devolve_ArrayList_extends_Number();
		oArrayListInteger = m_devolve_ArrayList_extends_Number();

		System.out.println(oListNumber);
		System.out.println(oArrayListNumber);
		System.out.println(oListInteger);
		System.out.println(oArrayListInteger);

		oListNumber = null;
		oArrayListNumber = null;
		oListInteger = null;
		oArrayListInteger = null;

		System.out.println(oListNumber);
		System.out.println(oArrayListNumber);
		System.out.println(oListInteger);
		System.out.println(oArrayListInteger);

		//oArrayListNumber = new ArrayList<>();
		//oArrayListNumber.add(1);
		oListNumber = oArrayListNumber;
		//oListNumber = (List<Number>) oListInteger;//Cannot cast from List<Integer> to List<Number>
		//oListNumber = (List<Number>) oArrayListInteger;//Cannot cast from ArrayList<Integer> to List<Number>

		System.out.println(oListNumber);

		//oListNumber = new LinkedList<>();
		//oListNumber.add(2);
		oArrayListNumber = (ArrayList<Number>) oListNumber;//ClassCastException: java.util.LinkedList cannot be cast to java.util.ArrayList
		//oArrayListNumber = (ArrayList<Number>) oListInteger;//Cannot cast from List<Integer> to ArrayList<Number>
		//oArrayListNumber = (ArrayList<Number>) oArrayListInteger;//Cannot cast from ArrayList<Integer> to ArrayList<Number>

		System.out.println(oArrayListNumber);

		//oArrayListInteger = new ArrayList<>();
		//oArrayListInteger.add(3);
		//oListInteger = (List<Integer>) oListNumber;//Cannot cast from List<Number> to List<Integer>
		//oListInteger = (List<Integer>) oArrayListNumber;//Cannot cast from ArrayList<Number> to List<Integer>
		oListInteger = (List<Integer>) oArrayListInteger;

		System.out.println(oListInteger);

		//oArrayListInteger = oListNumber;//Type mismatch: cannot convert from List<Number> to ArrayList<Integer>
		//oArrayListInteger = oArrayListNumber;//Type mismatch: cannot convert from ArrayList<Number> to ArrayList<Integer>
		//oArrayListInteger = oListInteger;//Type mismatch: cannot convert from List<Integer> to ArrayList<Integer>

		System.out.println(oArrayListInteger);

	}

}
