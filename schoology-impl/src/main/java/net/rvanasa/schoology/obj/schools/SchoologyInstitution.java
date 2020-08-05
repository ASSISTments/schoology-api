package net.rvanasa.schoology.obj.schools;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * As per API documentation, buildings and schools have the same fields:
 * https://developers.schoology.com/api-documentation/rest-api-v1/building 
 */
public abstract class SchoologyInstitution extends SchoologyReference<SchoologyInstitution>
{
	
	@SerializedName(value="id")
	String ID;
	String title;
	String address1;
	String address2;
	String city;
	String state;
	@SerializedName(value="postal_code")
	String postalCode;
	String country;
	String website;
	String phone;
	String fax;
	@SerializedName(value="picture_url")
	String pictureURL;
	
	SchoologyLinks links;
	
	public String getID()
	{
	  return ID;
	}

	public String getTitle()
	{
	  return title;
	}

	public String getAddress1()
	{
	  return address1;
	}

	public String getAddress2()
	{
	  return address2;
	}

	public String getCity()
	{
	  return city;
	}

	public String getState()
	{
	  return state;
	}

	public String getPostalCode()
	{
	  return postalCode;
	}

	public String getCountry()
	{
	  return country;
	}

	public String getWebsite()
	{
	  return website;
	}

	public String getPhone()
	{
	  return phone;
	}

	public String getFax()
	{
	  return fax;
	}

	public String getPictureURL()
	{
	  return pictureURL;
	}

	public SchoologyLinks getLinks()
	{
	  return links;
	}

	
}
