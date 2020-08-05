package net.rvanasa.schoology.obj.discussions;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyPage;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/discussion-reply
 * Represents a page of discussion replies
 */
public class SchoologyDiscussionRepliesPage extends SchoologyPage<SchoologyDiscussionRepliesPage>
{
	
	@SerializedName(value="comment")
	SchoologyDiscussionReply[] comments;
	
	public SchoologyDiscussionReply[] getComments()
	{
	  return comments;
	}

}
