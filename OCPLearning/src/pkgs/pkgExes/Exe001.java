package pkgs.pkgExes;

import java.util.*;

class MMKey {
	private Long key;
	public MMKey(Long key) {
		super();
		this.key = key;
	}
	@Override
	public String toString() {
		return "[MMKey][key="+key+"]";
	}
	@Override
	public int hashCode() {
		int inthashCode = Objects.hash(key);
		System.out.println("[MMKey][hashCode()][this="+this+"]"+"[inthashCode="+inthashCode+"]");
		return inthashCode;
	}
	@Override
	public boolean equals(Object obj) {
		boolean booleanequals = this.key.equals(((MMKey) obj).key);
		System.out.println("[MMKey][equals(Object obj)][this="+this+"]"+"[booleanequals="+booleanequals+"]");
		return booleanequals;
	}
}

class MMId {
	private Long id;
	public MMId(Long id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "[MMId][id="+id+"]";
	}
	@Override
	public int hashCode() {
		int inthashCode = Objects.hash(id);
		System.out.println("[MMId][hashCode()][this="+this+"]"+"[inthashCode="+inthashCode+"]");
		return inthashCode;
	}
	@Override
	public boolean equals(Object obj) {
		boolean booleanequals = this.id.equals(((MMId) obj).id);
		System.out.println("[MMId][equals(Object obj)][this="+this+"]"+"[booleanequals="+booleanequals+"]");
		return booleanequals;
	}
}

class MMObject {
	private MMId id;
	private String value;
	public MMObject(MMId id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	@Override
	public String toString() {
		return "[MMObject]"+"[id="+id+"]"+"[value="+value+"]";
	}
	@Override
	public int hashCode() {
		System.out.println("[MMObject][hashCode()]");
		int inthashCode = id.hashCode();
		System.out.println("[MMObject][hashCode()][this="+this+"]"+"[inthashCode="+inthashCode+"]");
		return inthashCode;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("[MMObject][equals(Object obj)]"+"[this="+this+"]"+"[obj="+obj+"]");
		boolean booleanequals = this.id.equals(obj);
		System.out.println("[MMObject][equals(Object obj)]"+"[booleanequals="+booleanequals+"]");
		return booleanequals;
	}
}

public class Exe001 {



	public static void main(String[] args) {

		MMKey key1A = new MMKey(1l);
		MMKey key1B = new MMKey(1l);

		MMId id100A = new MMId(100l);
		MMId id100B = new MMId(100l);

		MMObject objectA_X_id100A = new MMObject(id100A, "X");
		MMObject objectB_X_id100A = new MMObject(id100A, "X");

		System.out.println();

		Set set = null;

		set = new HashSet<>();
		System.out.println("[set.add(key1A, objectA_X_id100A)="+(set.add(objectA_X_id100A))+"]");
		System.out.println();
		System.out.println("[set.add(key1A, objectA_X_id100A)="+(set.add(objectA_X_id100A))+"]");
		set.forEach(System.out::println);

		System.out.println('\n');

		set = new TreeSet<>();
		//System.out.println("[set.add(objectA_X_id100A)="+(set.add(objectA_X_id100A))+"]");//ClassCastException: pkgs.pkgExes.MMObject cannot be cast to java.lang.Comparable
		set.forEach(System.out::println);

		System.out.println();

		Map map = null;

		map = new HashMap<>();
		System.out.println("[map.put(key1A, objectA_X_id100A)="+(map.put(key1A, objectA_X_id100A))+"]");
		System.out.println();
		System.out.println("[map.put(key1A, objectA_X_id100A)="+(map.put(key1A, objectA_X_id100A))+"]");
		map.forEach((k,v)->System.out.println("[k="+(k)+"]"+"[v="+(v)+"]"));

		System.out.println('\n');

		map = new TreeMap<>();
		//System.out.println("[map.put(key1A, objectA_X_id100A)="+(map.put(key1A, objectA_X_id100A))+"]");//ClassCastException: pkgs.pkgExes.MMKey cannot be cast to java.lang.Comparable
		map.forEach((k,v)->System.out.println("[k="+(k)+"]"+"[v="+(v)+"]"));

	}

}
