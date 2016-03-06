package enumet;

public class ColorTest {

	private Color color;

	public ColorTest() {

	}

	public ColorTest(Color color) {

		this.color = color;
	}

	public void setColor(Color color){
		this.color = color ;
	}
	
	
	
	
	public void displayColor() {

		switch (color) {

		case RED:
			System.out.println("ngjyra kuqe");
			break;
		case GREEN:
			System.out.println("ngjyra gjelbert");
			break;
		case BLUE:
			System.out.println("ngjyra kalter");
			break;
		default:
			System.out.println("ngjyra padefinuar");
		}

	}

	
	
	public void displayValues(){
		
		
		for(Color color : color.values()){
			System.out.println("" + color +  " " + color.ordinal());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
