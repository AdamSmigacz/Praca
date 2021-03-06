package t_13;

public class WhitherStringBuilder {

	public static String implicit(String [] fields){
		String result ="";
		for (int i = 0; i < fields.length; i++) {
			result += fields[i];
		}
		
		return result;
	}
	
	public static String explicit(String [] fields){
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < fields.length; i++) {
			result.append(fields[i]);
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		String [] tabl = {"Ada ","Anna ","Piotr ","Barbara ","Sylwia ","Daniel ", "Paulinka ","Poczta Daniela"};
		
		System.out.println(implicit(tabl));
		System.out.println();
		System.out.println(explicit(tabl));

	}

}
