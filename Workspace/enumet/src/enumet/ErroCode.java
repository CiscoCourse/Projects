package enumet;
public enum ErroCode {


	
	ERR1("001", "Error1 occurred"),
	ERR("002", "Error2 occured");
	
	private  String code;
	private String description;
	
	
	private ErroCode(String code , String description){
		this.code = code ;
		this.description = description;
	}
	
	public String getCode(){
		return this.code ;
	}
	
	public String getDescription(){
		return this.description;
				
	}
}
