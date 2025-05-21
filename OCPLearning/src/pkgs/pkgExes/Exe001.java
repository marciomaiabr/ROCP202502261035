package pkgs.pkgExes;

import java.time.LocalDateTime;
import java.util.*;

class ListMM<E> {
	public int size() {
		return 0;
	}

	public boolean isEmpty() {
		return false;
	}

	public boolean contains(Object o) {
		return false;
	}

	public Iterator<E> iterator() {
		return null;
	}

	public Object[] toArray() {
		return null;
	}

	public <T> T[] toArray(T[] a) {
		return null;
	}

	public boolean add(E e) {
		return false;
	}

	public void qqcMM1(E e) {
	}

	public boolean remove(Object o) {
		return false;
	}

	public boolean containsAll(Collection<?> c) {
		return false;
	}

	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	public boolean addAll(int index, Collection<? extends E> c) {
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		return false;
	}

	public void clear() {
	}

	public E get(int index) {
		return null;
	}

	public E set(int index, E element) {
		return null;
	}

	public void add(int index, E element) {
	}

	public E remove(int index) {
		return null;
	}

	public int indexOf(Object o) {
		return 0;
	}

	public int lastIndexOf(Object o) {
		return 0;
	}

	public ListIterator<E> listIterator() {
		return null;
	}

	public ListIterator<E> listIterator(int index) {
		return null;
	}

	public List<E> subList(int fromIndex, int toIndex) {
		return null;
	}
}

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
		mqqc1(null);
		mqqc1(null);
	}

	public static void mqqc1(ListMM<? extends Object> list) {
		System.out.println("Exe001.mqqc1()");
		list.qqcMM1(LocalDateTime.now());
	}

	public static void mqqc2(ListMM<? super Object> list) {
		System.out.println("Exe001.mqqc2()");
		list.qqcMM1(LocalDateTime.now());
	}

}

/*
eu acho q ele da erro de compilação ao adicionar, pq ele não sabe o que adicionar...
*/
