package pl.edu.pjwstk.mpr.db;

public class Kredyt {

	private String nazwa;
	private String kwota;
	private String raty;
	public  Kredyt(String nazwa,String kwota,String raty)
	 {
	this.nazwa=nazwa;
	this.kwota=kwota;
	this.raty=raty;

	
	}

	public String getNazwa()
{	return nazwa;
}
public String getKwota()
{	return kwota;
}
public String getRaty()
{	return raty;
}


public void setNazwa(String s)
{
	this.nazwa=s;
}
public void setKwota(String s)
{
	this.kwota=s;
}
public void setRaty(String s)
{
	this.raty=s;
}


	public String toString()
	{
return "nazwa: "+nazwa+", kwota: "+kwota+", raty:"+raty+"\n" ;
	
	}

}