package net.rvanasa.schoology.obj.events;

import java.util.Date;
import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.impl.SchoologyRealm;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/event
 */
public class SchoologyEvent extends SchoologyReference<SchoologyEvent>
{
	
	@SerializedName(value="id")
	String ID;
	String title;
	String description;
	Date start;
	@SerializedName(value="has_end")
	boolean hasEnd;
	Date end;
	@SerializedName(value="all_day")
	boolean allDay;
	boolean editable;
	SchoologyRSVPType rsvp;
	@SerializedName(value="comments_enabled")
	boolean commentsEnabled;
	SchoologyEventType type;
	SchoologyRealm realm;
	//Depends on realm
	@SerializedName(value="school_id")
	String schoolID;
	@SerializedName(value="group_id")
	String groupID;
	@SerializedName(value="section_id")
	String sectionID;
	
	SchoologyLinks links;
	
	public String getID()
	{
	  return ID;
	}

	public String getTitle()
	{
	  return title;
	}

	public String getDescription()
	{
	  return description;
	}

	public Date getStart()
	{
	  return start;
	}

	public boolean getHasEnd()
	{
	  return hasEnd;
	}

	public Date getEnd()
	{
	  return end;
	}

	public boolean getAllDay()
	{
	  return allDay;
	}

	public boolean getEditable()
	{
	  return editable;
	}

	public SchoologyRSVPType getRsvp()
	{
	  return rsvp;
	}

	public boolean getCommentsEnabled()
	{
	  return commentsEnabled;
	}

	public SchoologyEventType getType()
	{
	  return type;
	}

	public SchoologyRealm getRealm()
	{
	  return realm;
	}

	    //Depends on realm
	public String getSchoolID()
	{
	  return schoolID;
	}

	public String getGroupID()
	{
	  return groupID;
	}

	public String getSectionID()
	{
	  return sectionID;
	}

	public SchoologyLinks getLinks()
	{
	  return links;
	}

}
