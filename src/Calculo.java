
class Calculo {

	public static void main (String[] args){
		String str1="El lenguaje Java";
    	String str2="El lenguaje Java";
    	String str3="el lenguaje java";
    	String str4=new String("El lenguaje Java");
    
    	System.out.println(str1 == str2);   // Esto devuelve TRUE
	System.out.println(str1 == str3);   // Esto devuelve FALSE
    	System.out.println(str1 == str4); // Esto devuelve FALSE



    }

}
