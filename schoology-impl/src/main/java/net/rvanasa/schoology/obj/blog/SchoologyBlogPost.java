package net.rvanasa.schoology.obj.blog;

import java.util.Date;
import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/blog-post
 */
public class SchoologyBlogPost extends SchoologyReference<SchoologyBlogPost>
{
	
	@SerializedName(value="id")
	String ID;
	String title;
	String body;
	Date created;
	
	SchoologyLinks links;
	
	public String getID()
	{
	  return ID;
	}
	public String getTitle()
	{
	  return title;
	}
	public String getBody()
	{
	  return body;
	}
	public Date getCreated()
	{
	  return created;
	}
	public SchoologyLinks getLinks()
	{
	  return links;
	}
	
}
