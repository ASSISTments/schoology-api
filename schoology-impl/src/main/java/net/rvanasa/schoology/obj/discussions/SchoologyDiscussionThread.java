package net.rvanasa.schoology.obj.discussions;

import java.util.Date;
import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/discussion-thread
 */
public class SchoologyDiscussionThread extends SchoologyReference<SchoologyDiscussionThread>
{
	
	@SerializedName(value="id")
	String ID;
	@SerializedName(value="uid")
	String userID;
	String title;
	String body;
	boolean graded;
	Date due;
	@SerializedName(value="grade_item_id")
	int gradeItemID;
	@SerializedName(value="grading_scale")
	int gradingScale;
	@SerializedName(value="grading_period")
	int gradingPeriod;
	@SerializedName(value="grading_category")
	int gradingCateogry;
	@SerializedName(value="max_points")
	float maxPoints;
	float factor;
	@SerializedName(value="is_final")
	boolean isFinal;
	boolean published;
	@SerializedName(value="require_initial_post")
	boolean requireInitialPost;
	//No documentation available
	@SerializedName(value="completion_status")
	boolean completionStatus;
	
	SchoologyLinks links;
	
	public String getID()
	{
	  return ID;
	}

	public String getUserID()
	{
	  return userID;
	}

	public String getTitle()
	{
	  return title;
	}

	public String getBody()
	{
	  return body;
	}

	public boolean getGraded()
	{
	  return graded;
	}

	public Date getDue()
	{
	  return due;
	}

	public int getGradeItemID()
	{
	  return gradeItemID;
	}

	public int getGradingScale()
	{
	  return gradingScale;
	}

	public int getGradingPeriod()
	{
	  return gradingPeriod;
	}

	public int getGradingCateogry()
	{
	  return gradingCateogry;
	}

	public float getMaxPoints()
	{
	  return maxPoints;
	}

	public float getFactor()
	{
	  return factor;
	}

	public boolean getIsFinal()
	{
	  return isFinal;
	}

	public boolean getPublished()
	{
	  return published;
	}

	public boolean getRequireInitialPost()
	{
	  return requireInitialPost;
	}

	    //No documentation available
	public boolean getCompletionStatus()
	{
	  return completionStatus;
	}

	public SchoologyLinks getLinks()
	{
	  return links;
	}

	
}
