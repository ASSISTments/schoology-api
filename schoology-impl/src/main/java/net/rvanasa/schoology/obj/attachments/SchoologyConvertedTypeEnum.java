package net.rvanasa.schoology.obj.attachments;

import com.google.gson.annotations.SerializedName;

/*
 * https://developers.schoology.com/api/retrieving-attachments#File_Object
 */
public enum SchoologyConvertedTypeEnum
{
	
	@SerializedName(value="1")
	VIDEO(1, "Video"),
	@SerializedName(value="2")
	AUDIO(2, "Audio"),
	@SerializedName(value="3")
	IMAGE(3, "Image"),
	@SerializedName(value="4")
	DOCUMENT(4, "Document"),
	@SerializedName(value="5")
	UNKNOWN(5, "Unknown");
	
	private final int apiVaule;
	private final String type;
	
	private SchoologyConvertedTypeEnum(int apiValue, String type)
	{
		this.apiVaule = apiValue;
		this.type = type;
	}
	
	public int getApiVaule()
	{
	  return apiVaule;
	}
	public String getType()
	{
	  return type;
	}
	
	public static SchoologyConvertedTypeEnum getConvertedType(int apiValue)
	{
		for(SchoologyConvertedTypeEnum type : values()) if(type.apiVaule == apiValue) return type;
		
		return null;
	}
	
}
