package net.rvanasa.schoology.obj.attachments.attachment;

import java.util.Date;
import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.attachments.SchoologyConvertedStatusEnum;
import net.rvanasa.schoology.obj.attachments.SchoologyConvertedTypeEnum;

/*
 * https://developers.schoology.com/api/retrieving-attachments#File_Object
 */
public class SchoologyFile
{
	
	@SerializedName(value="id")
	String ID;
	String title;
	String filename;
	@SerializedName(value="md5_checksum")
	String md5Checksum;
	Date timestamp;
	@SerializedName(value="download_path")
	String downloadPath;
	String extension;
	@SerializedName(value="converted_status")
	SchoologyConvertedStatusEnum convertedStatus;
	@SerializedName(value="converted_type")
	SchoologyConvertedTypeEnum convertedType;
	//Converted information is only given for audio and video files
	@SerializedName(value="converted_filename")
	String convertedFilename;
	@SerializedName(value="converted_download_path")
	String convertedDownloadPath;
	@SerializedName(value="converted_extension")
	String convertedExtension;
	@SerializedName(value="converted_filesize")
	int convertedFilesize;
	@SerializedName(value="converted_md5_checksum")
	String convertedMD5Checksum;
	
	public String getID()
	{
	  return ID;
	}

	public String getTitle()
	{
	  return title;
	}

	public String getFilename()
	{
	  return filename;
	}

	public String getMd5Checksum()
	{
	  return md5Checksum;
	}

	public Date getTimestamp()
	{
	  return timestamp;
	}

	public String getDownloadPath()
	{
	  return downloadPath;
	}

	public String getExtension()
	{
	  return extension;
	}

	public SchoologyConvertedStatusEnum getConvertedStatus()
	{
	  return convertedStatus;
	}

	public SchoologyConvertedTypeEnum getConvertedType()
	{
	  return convertedType;
	}

	public String getConvertedFilename()
	{
	  return convertedFilename;
	}

	public String getConvertedDownloadPath()
	{
	  return convertedDownloadPath;
	}

	public String getConvertedExtension()
	{
	  return convertedExtension;
	}

	public int getConvertedFilesize()
	{
	  return convertedFilesize;
	}

	public String getConvertedMD5Checksum()
	{
	  return convertedMD5Checksum;
	}

	
}
