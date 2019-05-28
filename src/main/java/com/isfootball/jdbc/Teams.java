package com.isfootball.jdbc;

import org.springframework.data.domain.Persistable;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * This class is generated by Spring Data Jdbc code generator.
 *
 * @author Spring Data Jdbc Code Generator
 */
public class Teams implements Persistable<String>
{

	private static final long serialVersionUID = 1L;

	private String team;

	private String nameRus;

	private String country;

	private String league;

	private transient boolean persisted;


	public Teams ()
	{

	}

	public String getId ()
	{
		return this.team;
	}

	public boolean isNew ()
	{
		return this.team == null;
	}

	public void setTeam (String team)
	{
		this.team = team;
	}

	public String getTeam ()
	{
		return this.team;
	}

	public void setNameRus (String nameRus)
	{
		this.nameRus = nameRus;
	}

	public String getNameRus ()
	{
		return this.nameRus;
	}

	public void setCountry (String country)
	{
		this.country = country;
	}

	public String getCountry ()
	{
		return this.country;
	}

	public void setLeague (String league)
	{
		this.league = league;
	}

	public String getLeague ()
	{
		return this.league;
	}

	public void setPersisted (Boolean persisted)
	{
		this.persisted = persisted;
	}

	public Boolean getPersisted ()
	{
		return this.persisted;
	}

	@Override
	public String toString () 
	{
		return ToStringBuilder.reflectionToString (this); 
	}

	/* START Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/

	/* END Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/

}