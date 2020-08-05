package net.rvanasa.schoology.obj.attachments;

import net.rvanasa.schoology.obj.attachments.attachment.SchoologyEmbedWrapper;
import net.rvanasa.schoology.obj.attachments.attachment.SchoologyFileWrapper;
import net.rvanasa.schoology.obj.attachments.attachment.SchoologyLinkWrapper;
import net.rvanasa.schoology.obj.attachments.attachment.SchoologyVideoWrapper;

/*
 * https://developers.schoology.com/api/retrieving-attachments
 * Attachments object
 */
public class SchoologyAttachments
{
	
	SchoologyFileWrapper files;
	SchoologyLinkWrapper links;
	SchoologyVideoWrapper videos;
	SchoologyEmbedWrapper embeds;
	
	public SchoologyFileWrapper getFiles()
	{
	  return files;
	}
	public SchoologyLinkWrapper getLinks()
	{
	  return links;
	}
	public SchoologyVideoWrapper getVideos()
	{
	  return videos;
	}
	public SchoologyEmbedWrapper getEmbeds()
	{
	  return embeds;
	}
	
}
