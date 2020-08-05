package net.rvanasa.schoology.obj.albums;

import java.util.Date;
import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/media-album#create_2
 * https://developers.schoology.com/api-documentation/rest-api-v1/media-album#list
 * withcontent=1
 */
public class SchoologyMediaAlbumContent extends SchoologyReference<SchoologyMediaAlbumContent>
{
	
	@SerializedName(value="id")
	String ID;
	@SerializedName(value="album_id")
	String albumID;
	String type;
	String caption;
	@SerializedName(value="display_order")
	int displayOrder;
	Date created;
	@SerializedName(value="album_cover")
	boolean albumCover;
	@SerializedName(value="converted_url")
	String convertedURL;
	@SerializedName(value="converted_filesize")
	String convertedFilesize;
	@SerializedName(value="converted_md5_checksum")
	String convertedMD5Checksum;
	@SerializedName(value="content_url")
	String contentURL;
	@SerializedName(value="content_filesize")
	String contentFilesize;
	@SerializedName(value="content_md5_checksum")
	String contentMD5Checksum;
	@SerializedName(value="thumbnail_url")
	String thumbnailURL;
	@SerializedName(value="thumbnail_dimensions")
	String thumbnailDimensions;
	@SerializedName(value="content_dimensions")
	String contentDimensions;
	
	public String getID()
	{
	  return ID;
	}

	public String getAlbumID()
	{
	  return albumID;
	}

	public String getType()
	{
	  return type;
	}

	public String getCaption()
	{
	  return caption;
	}

	public int getDisplayOrder()
	{
	  return displayOrder;
	}

	public Date getCreated()
	{
	  return created;
	}

	public boolean getAlbumCover()
	{
	  return albumCover;
	}

	public String getConvertedURL()
	{
	  return convertedURL;
	}

	public String getConvertedFilesize()
	{
	  return convertedFilesize;
	}

	public String getConvertedMD5Checksum()
	{
	  return convertedMD5Checksum;
	}

	public String getContentURL()
	{
	  return contentURL;
	}

	public String getContentFilesize()
	{
	  return contentFilesize;
	}

	public String getContentMD5Checksum()
	{
	  return contentMD5Checksum;
	}

	public String getThumbnailURL()
	{
	  return thumbnailURL;
	}

	public String getThumbnailDimensions()
	{
	  return thumbnailDimensions;
	}

	public String getContentDimensions()
	{
	  return contentDimensions;
	}

	
}
