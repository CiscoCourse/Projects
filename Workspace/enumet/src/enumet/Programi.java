package enumet;

public class Programi {

	public static void main(String[] args) {
		
		
		
		Color color = Color.BLUE;
		
		ColorTest colorTest = new ColorTest(color);
		
		 colorTest.displayColor();
		
		 
		
		 
		 ColorTest colorTest1 = new ColorTest();
			colorTest1.setColor(color);
		 
		 colorTest.displayColor();
		colorTest.displayValues();
		
		
		System.out.println("**Error codes*** ");
         ErroCode errorCode = ErroCode.ERR1;
         System.out.println("code = "  + errorCode.getCode() + " description = "+  errorCode.getDescription());	
	}

}
