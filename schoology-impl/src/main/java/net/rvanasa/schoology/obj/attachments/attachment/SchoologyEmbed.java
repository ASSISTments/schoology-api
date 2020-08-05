package net.rvanasa.schoology.obj.attachments.attachment;

import com.google.gson.annotations.SerializedName;

/*
 * https://developers.schoology.com/api/retrieving-attachments#Embed_Object
 */
public class SchoologyEmbed
{
	@SerializedName(value="id")
	String ID;
	@SerializedName(value="embed_code")
	String embedCode;
	
	public String getID()
	{
	  return ID;
	}

	public String getEmbedCode()
	{
	  return embedCode;
	}

}
