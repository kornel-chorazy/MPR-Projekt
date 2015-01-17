package pl.edu.pjwstk.mpr.db;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pl.edu.pjwstk.mpr.db.DBManager;

public class Wyj {
	static List<Klient> listaKlientow=new ArrayList<Klient>();
	static List<Kredyt> listaKredytow=new ArrayList<Kredyt>();
	static DBManager dbManager = new DBManager();
//---------------------------
//Wypisz klientow------------	
	public static void pokazKlient() throws NumberFormatException, IOException, SQLException{
		ArrayList <Integer>listaId=new ArrayList<Integer>();
		ArrayList<String> listaImie=new ArrayList<String>();
		ArrayList<String> listaNazwisko=new ArrayList<String>();
		ArrayList <String>listaPesel=new ArrayList<String>();
		ArrayList <Integer>listaId_kredyt=new ArrayList<Integer>();
            ResultSet rs=DBManager.ZapytanieTablicyKlient(); //wrzucam do  rs wink zapytania select * from tablica
        	
            try
          {
            while (rs.next())
           {
          	listaId.add(rs.getInt("id")); //odwolanie sie do pola id i wyciagniecie numeru i wpakowanie go do listaid
          	listaImie.add(rs.getString("imie")); //jw. tylko nazwe
          	listaNazwisko.add(rs.getString("nazwisko"));
          	listaPesel.add(rs.getString("pesel"));
          	listaId_kredyt.add(rs.getInt("id_kredyt"));
           }
           
            
          } catch (Exception e)
          	{
 		     System.err.println("ERROR: cos nie tak z baza.");
		     e.printStackTrace();
          	}
          System.out.println("TABELA KLIENT");
          System.out.println("ID"+"\t"+"IMIE          "+"\t"+"NAZWISKO      "+"\t"+"PESEL      "+"\t"+"ID_KREDYT");
 
          for (int n=0;n<listaId.size() ;++n){
			System.out.println(listaId.get(n)+"\t"+listaImie.get(n)+"\t"+listaNazwisko.get(n)+"\t"+listaPesel.get(n)+"\t"+listaId_kredyt.get(n));
          }
  		wybor();
	}
//---------------------------
//Wypisz kredyty-------------	
		public static void pokazKredyt() throws NumberFormatException, IOException, SQLException{
			ArrayList <Integer>listaId=new ArrayList<Integer>();
			ArrayList<String> listaNazwa=new ArrayList<String>();
			ArrayList<String> listaKwota=new ArrayList<String>();
			ArrayList <String>listaRaty=new ArrayList<String>();
	            ResultSet rs=DBManager.ZapytanieTablicyKredyt(); //wrzucam do  rs wink zapytania select * from tablica
	        	
	            try
	          {
	            while (rs.next())
	           {
	          	listaId.add(rs.getInt("id")); //odwolanie sie do pola id i wyciagniecie numeru i wpakowanie go do listaid
	          	listaNazwa.add(rs.getString("nazwa")); //jw. tylko nazwe
	          	listaKwota.add(rs.getString("kwota"));
	          	listaRaty.add(rs.getString("raty"));
	           }
	           
	            
	          } catch (Exception e)
	          	{
	 		     System.err.println("ERROR: cos nie tak z baza.");
			     e.printStackTrace();
	          	}
	          System.out.println("TABELA KREDYT");
	          System.out.println("ID"+"\t"+"NAZWA"+"\t"+"\t\t"+"KWOTA "+"\t\t"+"RATY   ");
	 
	          for (int n=0;n<listaId.size() ;++n){
				System.out.println(listaId.get(n)+"\t"+listaNazwa.get(n)+"     "+"\t"+listaKwota.get(n)+"   "+"\t"+listaRaty.get(n));
	          }
	  		wybor();
		}	
//----------------------------------------------------------
//Wypisz klientow posegregowanych do kredytow---------------	
				public static void pokazKlDoKr() throws NumberFormatException, IOException, SQLException{
					ArrayList <Integer>listaId0=new ArrayList<Integer>();
					ArrayList <Integer>listaId1=new ArrayList<Integer>();
					ArrayList <Integer>listaId2=new ArrayList<Integer>();
					ArrayList <Integer>listaId3=new ArrayList<Integer>();
					ArrayList <Integer>listaId4=new ArrayList<Integer>();
					ArrayList<String> listaImie0=new ArrayList<String>();
					ArrayList<String> listaImie1=new ArrayList<String>();
					ArrayList<String> listaImie2=new ArrayList<String>();
					ArrayList<String> listaImie3=new ArrayList<String>();
					ArrayList<String> listaImie4=new ArrayList<String>();
					ArrayList<String> listaNazwisko0=new ArrayList<String>();
					ArrayList<String> listaNazwisko1=new ArrayList<String>();
					ArrayList<String> listaNazwisko2=new ArrayList<String>();
					ArrayList<String> listaNazwisko3=new ArrayList<String>();
					ArrayList<String> listaNazwisko4=new ArrayList<String>();
					ArrayList <String>listaPesel0=new ArrayList<String>();
					ArrayList <String>listaPesel1=new ArrayList<String>();
					ArrayList <String>listaPesel2=new ArrayList<String>();
					ArrayList <String>listaPesel3=new ArrayList<String>();
					ArrayList <String>listaPesel4=new ArrayList<String>();
					
			            ResultSet rs0=DBManager.ZapytanieKlDoKr0(); //wrzucam do  rs wink zapytania select * from tablica
			        	
			            try
			          {
			            while (rs0.next())
			           {
			          	listaId0.add(rs0.getInt("klient.id")); //odwolanie sie do pola id i wyciagniecie numeru i wpakowanie go do listaid
			          	listaImie0.add(rs0.getString("klient.imie")); //jw. tylko nazwe
			          	listaNazwisko0.add(rs0.getString("klient.nazwisko"));
			          	listaPesel0.add(rs0.getString("klient.pesel"));			      
			           }
			           
			            
			          } catch (Exception e)
			          	{
			 		     System.err.println("ERROR: cos nie tak z baza.");
					     e.printStackTrace();
			          	}
			         
			          System.out.println("\nKREDYT HIPOTECZNY");
			          System.out.println("ID"+"\t"+"IMIE          "+"\t"+"NAZWISKO      "+"\t"+"PESEL");
			          
			          for (int n=0;n<listaId0.size() ;++n){
			  			System.out.println(listaId0.get(n)+"\t"+listaImie0.get(n)+"\t"+listaNazwisko0.get(n)+"\t"+listaPesel0.get(n));
			            }
			          ResultSet rs1=DBManager.ZapytanieKlDoKr1(); //wrzucam do  rs wink zapytania select * from tablica
			        	
			            try
			          {
			            while (rs1.next())
			           {
			          	listaId1.add(rs1.getInt("klient.id")); //odwolanie sie do pola id i wyciagniecie numeru i wpakowanie go do listaid
			          	listaImie1.add(rs1.getString("klient.imie")); //jw. tylko nazwe
			          	listaNazwisko1.add(rs1.getString("klient.nazwisko"));
			          	listaPesel1.add(rs1.getString("klient.pesel"));			      
			           }
			           
			            
			          } catch (Exception e)
			          	{
			 		     System.err.println("ERROR: cos nie tak z baza.");
					     e.printStackTrace();
			          	}
			          System.out.println("\nKREDYT DEWIZOWY");
			          System.out.println("ID"+"\t"+"IMIE          "+"\t"+"NAZWISKO      "+"\t"+"PESEL");
			          
			          for (int n=0;n<listaId1.size() ;++n){
			  			System.out.println(listaId1.get(n)+"\t"+listaImie1.get(n)+"\t"+listaNazwisko1.get(n)+"\t"+listaPesel1.get(n));
			            }
			          ResultSet rs2=DBManager.ZapytanieKlDoKr2(); //wrzucam do  rs wink zapytania select * from tablica
			        	
			            try
			          {
			            while (rs2.next())
			           {
			          	listaId2.add(rs2.getInt("klient.id")); //odwolanie sie do pola id i wyciagniecie numeru i wpakowanie go do listaid
			          	listaImie2.add(rs2.getString("klient.imie")); //jw. tylko nazwe
			          	listaNazwisko2.add(rs2.getString("klient.nazwisko"));
			          	listaPesel2.add(rs2.getString("klient.pesel"));			      
			           }
			           
			            
			          } catch (Exception e)
			          	{
			 		     System.err.println("ERROR: cos nie tak z baza.");
					     e.printStackTrace();
			          	}
			          System.out.println("\nKREDYT LOMBARDOWY");
			          System.out.println("ID"+"\t"+"IMIE          "+"\t"+"NAZWISKO      "+"\t"+"PESEL");
			          
			          for (int n=0;n<listaId2.size() ;++n){
			  			System.out.println(listaId2.get(n)+"\t"+listaImie2.get(n)+"\t"+listaNazwisko2.get(n)+"\t"+listaPesel2.get(n));
			            }
			          ResultSet rs3=DBManager.ZapytanieKlDoKr3(); //wrzucam do  rs wink zapytania select * from tablica
			        	
			            try
			          {
			            while (rs3.next())
			           {
			          	listaId3.add(rs3.getInt("klient.id")); //odwolanie sie do pola id i wyciagniecie numeru i wpakowanie go do listaid
			          	listaImie3.add(rs3.getString("klient.imie")); //jw. tylko nazwe
			          	listaNazwisko3.add(rs3.getString("klient.nazwisko"));
			          	listaPesel3.add(rs3.getString("klient.pesel"));			      
			           }
			           
			            
			          } catch (Exception e)
			          	{
			 		     System.err.println("ERROR: cos nie tak z baza.");
					     e.printStackTrace();
			          	}
			          System.out.println("\nKREDYT KOMERCYJNY");
			          System.out.println("ID"+"\t"+"IMIE          "+"\t"+"NAZWISKO      "+"\t"+"PESEL");
			          
			          for (int n=0;n<listaId3.size() ;++n){
			        	  System.out.println(listaId3.get(n)+"\t"+listaImie3.get(n)+"\t"+listaNazwisko3.get(n)+"\t"+listaPesel3.get(n));
			            }
			          ResultSet rs4=DBManager.ZapytanieKlDoKr4(); //wrzucam do  rs wink zapytania select * from tablica
			        	
			            try
			          {
			            while (rs4.next())
			           {
			          	listaId4.add(rs4.getInt("klient.id")); //odwolanie sie do pola id i wyciagniecie numeru i wpakowanie go do listaid
			          	listaImie4.add(rs4.getString("klient.imie")); //jw. tylko nazwe
			          	listaNazwisko4.add(rs4.getString("klient.nazwisko"));
			          	listaPesel4.add(rs4.getString("klient.pesel"));			      
			           }
			           
			            
			          } catch (Exception e)
			          	{
			 		     System.err.println("ERROR: cos nie tak z baza.");
					     e.printStackTrace();
			          	}
			          System.out.println("\nKREDYT PREFERENCYJNY");
			          System.out.println("ID"+"\t"+"IMIE          "+"\t"+"NAZWISKO      "+"\t"+"PESEL");
			          
			          for (int n=0;n<listaId4.size() ;++n){
			        	  System.out.println(listaId4.get(n)+"\t"+listaImie4.get(n)+"\t"+listaNazwisko4.get(n)+"\t"+listaPesel4.get(n));
			            }

			  		wybor();
				}			
//WYBOR!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//----------------------------------
	public static void wybor() throws NumberFormatException, IOException, SQLException{

		System.out.println("\nAby zobaczyc tabele klient wcisnij 1");
		System.out.println("Aby dodać nowego klienta wciśnij 2");
		System.out.println("Aby zobaczyc tabele kredyt wciśnij 3");
		System.out.println("Aby zobaczyc klientow posegregowanych weglug kredytow wciśnij 4");
		
		System.out.println("Aby usunac danego klienta wciśnij 5");
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int b = Integer.parseInt(a.readLine());
  		if( b == 1 ) 
		{
			pokazKlient();
		}
  		else if (b == 2)
  		{
  			dodaj();
  		}
  		else if (b == 3)
  		{
  			pokazKredyt();
  		}
  		else if (b == 4)
  		{
  			pokazKlDoKr();
  		}
  		else if (b == 5)
  		{
  			usun();
  		}
	}
// TUTRAJ PROBLEM !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//----Naprawione ;)
//---Start bazy, jezeli tabela klient jest pusta wypelnia ja klientami	
	public static void start() throws SQLException{
		dbManager.connect("kredytdb");
		DBManager.createKlientTable();
		listaKlientow.add( new Klient("Jan            ","Kowalski       ","90060913150",1));
		listaKlientow.add( new Klient("Jan            ","Murawski       ","90122345675",0));
		listaKlientow.add( new Klient("Zbigniew       ","Jankowski      ","67111123423",2));
		listaKlientow.add( new Klient("Jurek          ","Nowak          ","75010146843",3));
		listaKlientow.add( new Klient("Adam           ","Sosin          ","80090923456",4));
		listaKlientow.add( new Klient("Grzegorz       ","Praski         ","78080865432",3));
		listaKlientow.add( new Klient("Andrzej        ","Wojtowicz      ","60070898765",3));
		listaKlientow.add( new Klient("Izydor         ","Nowak          ","90170864374",2));
		listaKlientow.add( new Klient("Kornel         ","Lecki          ","80110876543",4));
		listaKlientow.add( new Klient("Kamil          ","Gajos          ","56111144444",0));
		listaKlientow.add( new Klient("Igor           ","Turek          ","86121265432",1));
		listaKlientow.add( new Klient("Leon           ","Malinowski     ","87020676565",1));
		listaKlientow.add( new Klient("Wojciech       ","Malinowski     ","88020256789",4));
		listaKlientow.add( new Klient("Andrzej        ","Orzel          ","22030468042",2));
		listaKlientow.add( new Klient("Kacper         ","Goral          ","45030389004",4));
		listaKlientow.add( new Klient("Marek          ","Kownacki       ","78090623456",4));
		listaKlientow.add( new Klient("Czeslaw        ","Kownacki       ","78090609864",0));
		listaKlientow.add( new Klient("Andrzej        ","Gburek         ","89030456784",0));
		listaKlientow.add( new Klient("Andrzej        ","Lehman         ","56050598765",3));
		listaKlientow.add( new Klient("Bartosz        ","Kowalik        ","82090987657",3));
		ArrayList <Integer>listaId=new ArrayList<Integer>();
		ResultSet rs=DBManager.ZapytanieTablicyKlient();
		try
        {
          while (rs.next())
         {
        	listaId.add(rs.getInt("id"));
        	}
        } catch (Exception e)
      	{
		     System.err.println("ERROR: cos nie tak z baza.");
	     e.printStackTrace();
      	}
        if (listaId.size()==0){
		for (int s=listaId.size();s<listaKlientow.size();s++)
			dbManager.saveKlientToDB(listaKlientow.get(s));
        }
        
		DBManager.createKredytTable();
		listaKredytow.add( new Kredyt("Hipoteczny   ","300000","240"));
		listaKredytow.add( new Kredyt("Dewizowy     ","250000","216"));
		listaKredytow.add( new Kredyt("Lombardowy   ","5000 ","12"));
		listaKredytow.add( new Kredyt("Komercyjny   ","10000","36"));
		listaKredytow.add( new Kredyt("Preferencyjny","12000","60"));
		ArrayList <Integer>listaIdd=new ArrayList<Integer>();
		ResultSet rss=DBManager.ZapytanieTablicyKredyt();
		try
        {
          while (rss.next())
         {
        	listaIdd.add(rss.getInt("id"));
        	}
        } catch (Exception e)
      	{
		     System.err.println("ERROR: cos nie tak z baza.");
	     e.printStackTrace();
      	}
        
		for (int s=listaIdd.size();s<listaKredytow.size();s++)
			dbManager.saveKredytToDB(listaKredytow.get(s));

	}
//---Dodaje nowego klienta------------
//------------------------------------
//------------------------------------
//KOMBINUJE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!	
	public static void dodaj() throws IOException, NumberFormatException, SQLException{ 
		BufferedReader klaw = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("IMIE: ");
		String e = klaw.readLine();
		if (e.length()>15){System.out.println("Za dlugie imie");
		wybor();}
		else if(e.length()<6){e =e+"          ";}
		else if(e.length()<11){e =e+"     ";};
		String pierwszaI=e.substring(0,1);
		String dalejI=e.substring(1);
		e=pierwszaI.toUpperCase()+dalejI.toLowerCase();
		System.out.println("NAZWISKO: ");
		String c = klaw.readLine();
		if (c.length()>15){System.out.println("Za dlugie nazwisko");
		wybor();}
		else if(c.length()<6){c =c+"          ";}
		else if(c.length()<11){c =c+"     ";};
		String pierwszaN=c.substring(0,1);
		String dalejN=c.substring(1);
		c=pierwszaN.toUpperCase()+dalejN.toLowerCase();
		System.out.println("PESEL: ");
		String d = klaw.readLine();
		if (d.length()!=11){System.out.println("Zly pesel");
		wybor();};
		System.out.println("ID_KREDYT: ");
		int f = Integer.parseInt(klaw.readLine());
		if (f<0 || f>4){System.out.println("Zle id"); 
		wybor();};
		listaKlientow.add( new Klient(e,c,d,f));
		
		
		for (int s=listaKlientow.size()-1;s<listaKlientow.size();s++)
			dbManager.saveKlientToDB(listaKlientow.get(s));
		DBManager.ZapytanieTablicyKlient();
		wybor();
		}
//---Usuwa danego klient--------------
//------------------------------------
//------------------------------------
//KOMBINUJE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	public static void usun() throws IOException, NumberFormatException, SQLException{ 
		BufferedReader klaw = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Podaj ID klienta, ktorego chcesz usunac \n\nID:");
		int f = Integer.parseInt(klaw.readLine());
		Statement stmt = DBManager.connection.createStatement();
		if (f<0 || f>24){System.out.println("Zle id"); 
		wybor();};
		
		stmt.execute("delete from klient where id="+f);
		wybor();
		}
}
