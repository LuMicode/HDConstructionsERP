package lk.hdconstructions.erp.utils.constants;

public class QueryConstants {
	
	
	// Construction
	public static final String ADD_NEW_CONSTRUCTION = "INSERT INTO construction(cid, name, address, constructionJob, description)"
			+ " VALUES(?, ?, ?, ?, ?)";
	public static final String GET_ALL_CONSTRUCTIONS = "SELECT * FROM construction";
}
