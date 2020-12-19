package _05_for_loops._2_badgers;

public class Badger {

	public static void main(String[] args) {
		int num_global = 0;
		int num = 0;
		String final_s = "";
		while(num_global < 2) {
			while(num < 12) {
				final_s += "Badger ";
				num += 1;
			}
			System.out.println(final_s);
			num = 0;
			final_s = "";
			while(num < 2) {
				final_s += "Mushroom ";
				num += 1;
			}
			System.out.println(final_s);
			num_global += 1;
			num = 0;
			final_s = "";
			
		}
		System.out.println("A Snake!");
	}

}
