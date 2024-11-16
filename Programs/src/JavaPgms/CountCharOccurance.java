package JavaPgms;

public class CountCharOccurance {

	public static void main(String[] args) {
		String name = "Test automation with auto skils of aarthi";
		int total_count=name.length();//Full length
		int Removed_count=name.replace("a", "").length();//a replaced with "" - this count
		int count = total_count-Removed_count;
		System.out.println(count);
	}

}
