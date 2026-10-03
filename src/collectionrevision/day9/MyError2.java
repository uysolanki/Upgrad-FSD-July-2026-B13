package collectionrevision.day9;

public enum MyError2 {
	
	ERR01("ERR-01","%s is not a valid Username"),
	ERR02("ERR-02","Please enter valid Password");
	
	private String errorId;
	private String errorName;
	
	private MyError2(String errorId,String errorName)
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

//Please enter valid Username
//alice is not a valid Username
//ben is not a valid Username
