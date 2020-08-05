package net.rvanasa.schoology.obj.courses;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyPage;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/course
 * Represents a page of courses
 */
public class SchoologyCoursesPage extends SchoologyPage<SchoologyCoursesPage>
{
	
	@SerializedName(value="course")
	SchoologyCourse[] courses;
	
	public SchoologyCourse[] getCourses()
	{
	  return courses;
	}

}
