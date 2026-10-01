package collectionrevision.day9;

public enum MyError {
	
	ERR01("ERR-01","Please enter valid Username"),
	ERR02("ERR-02","Please enter valid Password");
	
	private String errorId;
	private String errorName;
	
	private MyError(String errorId,String errorName)
	{
		this.errorId=errorId;
		this.errorName=errorName;
	}

	public String getErrorId() {
		return errorId;
	}

	public String getErrorName() {
		return errorName;
	}

	
}
