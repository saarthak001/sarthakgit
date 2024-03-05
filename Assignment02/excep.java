public class excep{
	
	public static void operation(){
		try{
			int x=10/1;
			String s ="";
			System.out.println("length of s:"+ s.length());
			int y=10/0;
			System.out.println(x+y);
		}
		catch (NullPointerException e){
			System.out.println("nullexception :"+e);
			
		}
		catch(ArithmeticException ex2){
			System.out.println("arithmaticexception :"+ex2);
		}
		catch(Exception ex){
			System.out.println("Exception :"+ex);
		}
		
	}
	
	public static void main(String[]args){
		operation();
	}
}	