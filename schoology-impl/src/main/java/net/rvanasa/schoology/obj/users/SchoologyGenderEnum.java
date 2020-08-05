package net.rvanasa.schoology.obj.users;

import com.google.gson.annotations.SerializedName;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/user
 */
public enum SchoologyGenderEnum
{
	
	@SerializedName(value="M")
	MALE("M", "Male"),
	@SerializedName(value="F")
	FEMALE("F", "Female");
	
	private final String apiVaule;
	private final String gender;
	
	private SchoologyGenderEnum(String apiValue, String subjectArea)
	{
		this.apiVaule = apiValue;
		this.gender = subjectArea;
	}
	
	public String getApiVaule()
	{
	  return apiVaule;
	}

	public String getGender()
	{
	  return gender;
	}

	
	public static SchoologyGenderEnum getGender(String apiValue)
	{
		for(SchoologyGenderEnum gender : values()) if(gender.apiVaule.equalsIgnoreCase(apiValue) || gender.gender.equalsIgnoreCase(apiValue)) return gender;
		
		return null;
	}
	
}
