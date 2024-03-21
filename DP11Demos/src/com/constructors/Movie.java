package com.constructors;

public class Movie {

	private int id,relYear;
	private float duration;
	private String name,language,catagory;
	
	Movie()
	{
		System.out.println("This is Default constructor");
		id=1;
		relYear=2024;
		duration=3;
		name="cinema";
		language="hindi";
		catagory="sci-fi";
	}
	Movie(int id,int relYear,float duration,String name,String language,String catagory)
	{
		System.out.println("This is Prameterize constructor");
		this.id=id;
		this.relYear=relYear;
		this.name=name;
		this.language=language;
		this.catagory=catagory;
	}
	
	public void setid(int id)
	{
		this.id=id;
	}
	
	public int getid()
	{
		return id;
	}
	
	public void setRelYear(int relYear)
	{
		this.relYear=relYear;
	}
	public int getRelYear()
	{
		return relYear;
	}
	
	public void setduration(float duration)
	{
		this.duration=duration;
	}
	public float getduration()
	{
		return duration;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setcatagory(String catagory)
	{
		this.catagory=catagory;
	}
	public String getCatagory()
	{
		return catagory;
	}
	
	public void setLang(String language)
	{
		this.language=language;
	}
	public String getLang()
	{
		return language;
	}
	
	public void show()
	{
		System.out.println("Movie id :"+id+", Movie Name :"+name+", Release Year :"+relYear+", Duration :"+duration+", Catagory :"+catagory+", Language :"+language+"\n");
		
	}
	public Movie checkReleaseYr(Movie m)
	{
		if(this.relYear==m.relYear)
	
			return this;
			else
			return m;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m=new Movie();
		m.setid(2);
		m.getid();
		m.setRelYear(2020);
		m.getRelYear();
		m.setduration(2.5f);
		m.getduration();
		m.setName("Saho");
		m.getName();
		m.setcatagory("action");
		m.getCatagory();
		m.setLang("South");
		m.getLang();
		m.show();
		
		Movie m2=new Movie(5,1997,3.00f,"Thor","fi","English");
		m2.show();
		Movie m3=m.checkReleaseYr(m2);
		System.out.println(m3);
		
		
	}

}
