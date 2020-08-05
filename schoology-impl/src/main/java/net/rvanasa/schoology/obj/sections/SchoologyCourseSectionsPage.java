package net.rvanasa.schoology.obj.sections;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyPage;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/course-section
 * Represents a page of sections for given course
 */
public class SchoologyCourseSectionsPage extends SchoologyPage<SchoologyCourseSectionsPage>
{
	
	@SerializedName(value="section")
	SchoologyCourseSection[] sections;
	
	public SchoologyCourseSection[] getSections()
	{
	  return sections;
	}

}
