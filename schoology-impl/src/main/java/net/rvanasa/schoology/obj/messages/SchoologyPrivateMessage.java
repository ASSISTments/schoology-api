package net.rvanasa.schoology.obj.messages;

import java.util.Date;
import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/private-messaging
 */
public class SchoologyPrivateMessage extends SchoologyReference<SchoologyPrivateMessage>
{
	
	@SerializedName(value="id")
	String ID;
	String subject;
	@SerializedName(value="recipient_ids")
	String recipientIDs;
	@SerializedName(value="last_updated")
	Date lastUpdated;
	//mid is undocumented
	String mid;
	@SerializedName(value="author_id")
	String authorID;
	@SerializedName(value="message_status")
	SchoologyMessageStatus messageStatus;
	String message;
	
	SchoologyLinks links;
	
	public String getID()
	{
	  return ID;
	}

	public String getSubject()
	{
	  return subject;
	}

	public String getRecipientIDs()
	{
	  return recipientIDs;
	}

	public Date getLastUpdated()
	{
	  return lastUpdated;
	}

	public String getMid()
	{
	  return mid;
	}

	public String getAuthorID()
	{
	  return authorID;
	}

	public SchoologyMessageStatus getMessageStatus()
	{
	  return messageStatus;
	}

	public String getMessage()
	{
	  return message;
	}

	public SchoologyLinks getLinks()
	{
	  return links;
	}

}
