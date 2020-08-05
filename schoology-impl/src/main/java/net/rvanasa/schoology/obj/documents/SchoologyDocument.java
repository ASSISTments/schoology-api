package net.rvanasa.schoology.obj.documents;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;
import net.rvanasa.schoology.obj.attachments.SchoologyAttachments;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/documents
 */
public class SchoologyDocument extends SchoologyReference<SchoologyDocument>
{
	
	@SerializedName(value="id")
	String ID;
	String title;
	@SerializedName(value="course_fid")
	String courseFID;
	boolean available;
	boolean published;
	@SerializedName(value="completion_status")
	String completionStatus;
	boolean completed;
	SchoologyAttachments attachments;
	
	SchoologyLinks links;
	
	public String getID()
	{
	  return ID;
	}

	public String getTitle()
	{
	  return title;
	}

	public String getCourseFID()
	{
	  return courseFID;
	}

	public boolean getAvailable()
	{
	  return available;
	}

	public boolean getPublished()
	{
	  return published;
	}

	public String getCompletionStatus()
	{
	  return completionStatus;
	}

	public boolean getCompleted()
	{
	  return completed;
	}

	public SchoologyAttachments getAttachments()
	{
	  return attachments;
	}

	public SchoologyLinks getLinks()
	{
	  return links;
	}

}
