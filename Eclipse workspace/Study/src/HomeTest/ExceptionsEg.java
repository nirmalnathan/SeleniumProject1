public class ExceptionsEg {

	/**
	 * @param args
	 * @throws MyException 
	 */
	public static void main(String[] args) throws MyException {
		div(3, 0);
	}

	public static int div(int a, int b) throws MyException {
		try {
			int C = a / b;
			System.out.println(C);
		}
		
		catch (ArithmeticException e) {
			throw new MyException(e.getMessage());
		}
		
		catch(Exception e){
			System.out.println(e);
		}  
		
		finally{}
		return b;
	}

}
