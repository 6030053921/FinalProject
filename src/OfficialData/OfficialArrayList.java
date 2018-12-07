package OfficialData;
import java.util.ArrayList;

public class OfficialArrayList {
	private ArrayList<Official_User> OfficialList;
	
	
	public OfficialArrayList() {
		
	}
	
	public void addOfficial(Official_User O) {
		OfficialList = new ArrayList<>();
		OfficialList.add(O);
	}
	
	public ArrayList<Official_User> getOfficialList() {
		return OfficialList;
	}

}
