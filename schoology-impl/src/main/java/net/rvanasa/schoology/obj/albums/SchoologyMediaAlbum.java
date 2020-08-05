package net.rvanasa.schoology.obj.albums;

import java.util.Date;
import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/media-album
 */
public class SchoologyMediaAlbum extends SchoologyReference<SchoologyMediaAlbum>
{
	
	@SerializedName(value="id")
	String ID;
	String title;
	String description;
	@SerializedName(value="setting_comments")
	boolean settingComments;
	@SerializedName(value="setting_member_post")
	boolean settingMemberPost;
	boolean published;
	@SerializedName(value="photo_count")
	int photoCount;
	@SerializedName(value="video_count")
	int videoCount;
	@SerializedName(value="audio_count")
	int audioCount;
	@SerializedName(value="cover_image_url")
	String coverImageURL;
	Date created;
	boolean available;
	boolean completed;
	//No documentation available
	@SerializedName(value="completion_status")
	String completionStatus;
	
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

	public boolean getSettingComments()
	{
	  return settingComments;
	}

	public boolean getSettingMemberPost()
	{
	  return settingMemberPost;
	}

	public boolean getPublished()
	{
	  return published;
	}

	public int getPhotoCount()
	{
	  return photoCount;
	}

	public int getVideoCount()
	{
	  return videoCount;
	}

	public int getAudioCount()
	{
	  return audioCount;
	}

	public String getCoverImageURL()
	{
	  return coverImageURL;
	}

	public Date getCreated()
	{
	  return created;
	}

	public boolean getAvailable()
	{
	  return available;
	}

	public boolean getCompleted()
	{
	  return completed;
	}

	public String getCompletionStatus()
	{
	  return completionStatus;
	}

	public SchoologyLinks getLinks()
	{
	  return links;
	}

	
}
