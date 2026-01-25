package pkgs.pkgExes;

//abstract enum DaysOff {//Illegal modifier for the enum DaysOff; only public is permitted
enum DaysOff {
	Thanksgiving{
		void ma() {}
	},
	PresidentsDay{
		void ma() {}
	},
	ValentinesDay{
		void ma() {}
	};
	abstract void ma();
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
