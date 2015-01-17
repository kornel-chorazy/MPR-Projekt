package pl.edu.pjwstk.mpr.db;

public class Klient {

	private String imie;
	private String nazwisko;
	private String pesel;
	private int id_kredyt;
	public  Klient(String imie,String nazwisko,String pesel, int id_kredyt)
	 {
	this.imie=imie;
	this.nazwisko=nazwisko;
	this.pesel=pesel;
	this.id_kredyt=id_kredyt;
	
	}

	public String getImie()
{	return imie;
}
public String getNazwisko()
{	return nazwisko;
}
public String getPesel()
{	return pesel;
}
public int getId_kredyt()
{	return id_kredyt;
}

public void setImie(String s)
{
	this.imie=s;
}
public void setNazwisko(String s)
{
	this.nazwisko=s;
}
public void setPesel(String s)
{
	this.pesel=s;
}
public void setId_kredyt(int s)
{
	this.id_kredyt=s;
}

	public String toString()
	{
return "imie: "+imie+", nazwisko: "+nazwisko+", pesel:"+pesel+", id_kredyt"+id_kredyt+"\n" ;
	
	}

}
