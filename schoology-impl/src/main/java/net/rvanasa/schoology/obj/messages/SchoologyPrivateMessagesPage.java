package net.rvanasa.schoology.obj.messages;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyPage;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/private-messaging
 * Represents a page of private messages
 */
public class SchoologyPrivateMessagesPage extends SchoologyPage<SchoologyPrivateMessagesPage>
{
	
	@SerializedName(value="message")
	SchoologyPrivateMessage[] messages;
	
	@SerializedName(value="unread_count")
	int unreadCount;
	
	public SchoologyPrivateMessage[] getMessages()
	{
	  return messages;
	}

	public int getUnreadCount()
	{
	  return unreadCount;
	}

}
