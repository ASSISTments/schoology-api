package net.rvanasa.schoology.obj.attachments.attachment;

import com.google.gson.annotations.SerializedName;

/*
 * https://developers.schoology.com/api/retrieving-attachments#Link_Object
 */
public class SchoologyLink
{
	@SerializedName(value="id")
	String ID;
	String title;
	@SerializedName(value="url")
	String URL;
	String summary;
	String favicon;
	String thumbnail;
	
	public String getID()
	{
	  return ID;
	}

	public String getTitle()
	{
	  return title;
	}

	public String getURL()
	{
	  return URL;
	}

	public String getSummary()
	{
	  return summary;
	}

	public String getFavicon()
	{
	  return favicon;
	}

	public String getThumbnail()
	{
	  return thumbnail;
	}

	
}
