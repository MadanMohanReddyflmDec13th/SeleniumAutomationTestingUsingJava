package stringprograms;

public class RemoveWhitespacesfromaString {

	public static void main(String[] args) {
		
		String s=" Ja va Sele niu     m	";
		
		String op=s.replaceAll("\\s","");
		System.out.println(op);
	}

}
