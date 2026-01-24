package pkgs.pkgExes;

enum DaysOff {
	Thanksgiving, PresidentsDay, ValentinesDay
}

public class Exe001 {



	public static void main(String[] args) {

		final DaysOff input = DaysOff.Thanksgiving;
		switch(input) {
			default:
				//break;
			case ValentinesDay:
				System.out.print("1");
				//break;
			case PresidentsDay:
				System.out.print("2");
				//break;
		}

	}



}
