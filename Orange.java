import java.io.*;

public class Orange
{

	private double prix ;
	private String origine ;
		
	public Orange(double p , String o)
	{	
		if(p >= 0)
		{
			this.prix=p;
		}else
		{
			System.out.println("Prix Negatif");
		}
		this.origine=o;
	}

	public double getPrix()
	{
		return prix ;
	}
	
	public String getOrigine()
	{
		return origine;
	}

	/*public String ToString()
	{
		String s ;
		s += "Orange d'origine :"+ origine ;
		s += "Prix :"+ prix ;
		return s ;
	}*/
	
	public static void main(String[] args)
	{
		Orange a ;
		a = new Orange(-20,"France");
		Orange b ;
		b = new Orange(0.20,"Espagne");
		b.toString();
	}


}



