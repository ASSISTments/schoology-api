package net.rvanasa.schoology.obj.updates.comments;

import java.util.Date;
import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/update-comment
 */
public class SchoologyUpdateComment extends SchoologyReference<SchoologyUpdateComment>
{
	
	@SerializedName(value="id")
	String ID;
	@SerializedName(value="uid")
	String userID;
	String comment;
	Date created;
	@SerializedName(value="parent_id")
	String parentID;
	boolean status;
	int likes;
	@SerializedName(value="user_like_action")
	boolean userLikeAction;
	
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

	public String getParentID()
	{
	  return parentID;
	}

	public boolean getStatus()
	{
	  return status;
	}

	public int getLikes()
	{
	  return likes;
	}

	public boolean getUserLikeAction()
	{
	  return userLikeAction;
	}

	public SchoologyLinks getLinks()
	{
	  return links;
	}

}