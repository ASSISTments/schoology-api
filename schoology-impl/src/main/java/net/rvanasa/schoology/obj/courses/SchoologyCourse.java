package net.rvanasa.schoology.obj.courses;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/course
 */
public class SchoologyCourse extends SchoologyReference<SchoologyCourse>
{
	
	@SerializedName(value="id")
	String ID;
	@SerializedName(value="building_id")
	String buildingID;
	String title;
	@SerializedName(value="course_code")
	String courseCode;
	String department;
	String description;
	double credits;
	boolean synced;
	@SerializedName(value="grade_level_range_start")
	SchoologyGradeRangeEnum gradeLevelRangeStart;
	@SerializedName(value="grade_level_range_end")
	SchoologyGradeRangeEnum gradeLevelRangeEnd;
	@SerializedName(value="subject_area")
	SchoologyCourseSubjectAreaEnum subjectArea;
	
	SchoologyLinks links;
	
	public String getID()
	{
	  return ID;
	}
	public String getBuildingID()
	{
	  return buildingID;
	}
	public String getTitle()
	{
	  return title;
	}
	public String getCourseCode()
	{
	  return courseCode;
	}
	public String getDepartment()
	{
	  return department;
	}
	public String getDescription()
	{
	  return description;
	}
	public double getCredits()
	{
	  return credits;
	}
	public boolean getSynced()
	{
	  return synced;
	}
	public SchoologyGradeRangeEnum getGradeLevelRangeStart()
	{
	  return gradeLevelRangeStart;
	}
	public SchoologyGradeRangeEnum getGradeLevelRangeEnd()
	{
	  return gradeLevelRangeEnd;
	}
	public SchoologyCourseSubjectAreaEnum getSubjectArea()
	{
	  return subjectArea;
	}
	public SchoologyLinks getLinks()
	{
	  return links;
	}

	
}