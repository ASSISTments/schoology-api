package net.rvanasa.schoology.obj.attachments;

import com.google.gson.annotations.SerializedName;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/updates#Fields
 * attachment/type
 */
public enum SchoologyAttachmentTypeEnum
{
	
	@SerializedName(value="file")
	FILE("file"),
	@SerializedName(value="link")
	LINK("link"),
	@SerializedName(value="video")
	VIDEO("video"),
	@SerializedName(value="embed")
	EMBED("embed");
	
	private final String apiVaule;
	
	private SchoologyAttachmentTypeEnum(String apiValue)
	{
		this.apiVaule = apiValue;
	}
	
	public String getApiVaule()
	{
	  return apiVaule;
	}
	
	public static SchoologyAttachmentTypeEnum getAttachmentType(String apiValue)
	{
		for(SchoologyAttachmentTypeEnum type : values()) if(type.apiVaule.equalsIgnoreCase(apiValue)) return type;
		
		return null;
	}
	
}
