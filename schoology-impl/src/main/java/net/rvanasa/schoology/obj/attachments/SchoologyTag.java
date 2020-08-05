package net.rvanasa.schoology.obj.attachments;

import com.google.gson.annotations.SerializedName;

/*
 * https://developers.schoology.com/api/retrieving-attachments#The_tags_Object
 */
public class SchoologyTag
{
	
	String title;
	String description;
	@SerializedName(value="id")
	String ID;
	@SerializedName(value="vid")
	String VID;
	
	public String getTitle()
	{
	  return title;
	}

	public String getDescription()
	{
	  return description;
	}

	public String getID()
	{
	  return ID;
	}

	public String getVID()
	{
	  return VID;
	}

}
