
public class FinallyExample {

	public static void main(String[] args) {
			try{
			int a =0;
			int b=20/a;
			System.out.println(b);
			System.out.println("Ending of the try block");
			}
			catch(NullPointerException e){
			System.out.println("Exception was not handled");
			}
			catch(Exception e){
			System.out.println("Exception occured");
			}
			finally {
			System.out.println("Ending of try-catch block in java");
			}
	}
	}

