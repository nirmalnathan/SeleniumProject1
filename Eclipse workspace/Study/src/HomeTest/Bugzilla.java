import com.j2bugzilla.base.*;
import com.j2bugzilla.rpc.*;
import com.j2bugzilla.rpc.BugSearch.SearchLimiter;
import com.j2bugzilla.rpc.BugSearch.SearchQuery;



public class Bugzilla {

	/**
	 * @param args
	 * @throws ConnectionException 
	 */
	public static void main(String[] args) throws ConnectionException {
		BugzillaConnector b = new BugzillaConnector ();
		b.connectTo("http://bugzilla.jstpl.com", "nnathan@jamcracker.com", "Root123#");
		BugSearch search = new BugSearch(new SearchQuery(SearchLimiter.ALIAS, "carmen@sandiego.us"));
		search.equals("test");
			
		System.out.println("connected to bugzilla");

	}

}
