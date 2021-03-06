package net.rvanasa.schoology.obj.blog;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/blog-post-comment
 */
@Getter
public class SchoologyBlogPostComment extends SchoologyReference<SchoologyBlogPostComment>
{
	
	@SerializedName(value="id")
	String ID;
	@SerializedName(value="uid")
	String userID;
	String comment;
	Date created;
	boolean status;
	
	SchoologyLinks links;
	
}
