package net.rvanasa.schoology.obj.blog;

import java.util.Date;
import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/blog-post-comment
 */
public class SchoologyBlogPostComment extends SchoologyReference<SchoologyBlogPostComment>
{
	
	@SerializedName(value="id")
	String ID;
	@SerializedName(value="uid")
	String userID;
	String comment;
	Date created;
	boolean status;
	
	SchoologyLinks links;
	
	public String getID()
	{
	  return ID;
	}
	public String getUserID()
	{
	  return userID;
	}
	public String getComment()
	{
	  return comment;
	}
	public Date getCreated()
	{
	  return created;
	}
	public boolean getStatus()
	{
	  return status;
	}
	public SchoologyLinks getLinks()
	{
	  return links;
	}
	
}
