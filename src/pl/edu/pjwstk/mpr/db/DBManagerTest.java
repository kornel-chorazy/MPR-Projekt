
import java.sql.Connection;
import java.sql.DriverManager;

import java.util.*;

public class DBManagerTest extends junit.framework.TestCase{
	
	pl.edu.pjwstk.mpr.db.DBManager dbm = new pl.edu.pjwstk.mpr.db.DBManager();
	//@Test
String dbname="dbname";
	
	public void testDBName(){
		
		assertEquals("Zla nazwa bazy",dbname,"dbname");
		//dbm.connect(dbname);
	}
	
}

