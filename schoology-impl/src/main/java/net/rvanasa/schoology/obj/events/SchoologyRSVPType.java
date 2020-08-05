package net.rvanasa.schoology.obj.events;

import com.google.gson.annotations.SerializedName;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/event
 */
public enum SchoologyRSVPType
{
	
	@SerializedName(value="0")
	NO_ONE(0, "No one can RSVP"),
	@SerializedName(value="1")
	INVITE_ONLY(1, "Only people who have been invited to the event"),
	@SerializedName(value="2")
	EVERYONE(2, "Anyone can RSVP");
	
	private final int apiVaule;
	private final String description;
	
	private SchoologyRSVPType(int apiValue, String description)
	{
		this.apiVaule = apiValue;
		this.description = description;
	}
	
	public int getApiVaule()
	{
	  return apiVaule;
	}
	public String getDescription()
	{
	  return description;
	}
	
	public static SchoologyRSVPType getRSVPType(int apiValue)
	{
		for(SchoologyRSVPType eventType : values()) if(eventType.getApiVaule() == apiValue) return eventType;
		
		return null;
	}
	
}
