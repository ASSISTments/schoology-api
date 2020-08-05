package net.rvanasa.schoology.obj.events;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyPage;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/event
 * Represents a page of events
 */
public class SchoologyEventsPage extends SchoologyPage<SchoologyEventsPage>
{
	
	@SerializedName(value="event")
	SchoologyEvent[] events;
	
	public SchoologyEvent[] getEvents()
	{
	  return events;
	}

}
