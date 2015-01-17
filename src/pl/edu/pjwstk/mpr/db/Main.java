package pl.edu.pjwstk.mpr.db;

import java.io.IOException;
import java.sql.SQLException;
import pl.edu.pjwstk.mpr.db.DBManager;



public class Main {

	public static void main(String [] args) throws SQLException, IOException{
		System.out.println("==========================\n"+
				   "| KREDYTY |\n"+
				   "==========================");
		Wyj.start();
		DBManager.ZapytanieTablicyKlient();
		Wyj.wybor();
		
		
	}

}
