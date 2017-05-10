package ExceptionHandling;

public class RunThisFinally {

	public static void main(String[] args) {
		System.out.println(RtnInt());
	}

	private static int RtnInt() {
		int s=100;
		try{
			return s;
		}catch(Exception e){
			return s;
		}finally{
			s=7979;
			System.out.println("running finally");
			return s;
		}
	}

}
