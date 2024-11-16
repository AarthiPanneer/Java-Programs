package JavaPgms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String name = "kula theivam kali amman karuppar iya    sirippu papa etc  god";
		String without_spaces=name.replaceAll("\\s", "");
		System.out.println(without_spaces);
	}

}
