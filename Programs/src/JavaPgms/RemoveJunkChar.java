package JavaPgms;

public class RemoveJunkChar {

	public static void main(String[] args) {
		String before_junk = "@&(#&(&# Aarthi (@&(#&(#&!( Panneer";
		String name=before_junk.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(name);
	}
	

}
