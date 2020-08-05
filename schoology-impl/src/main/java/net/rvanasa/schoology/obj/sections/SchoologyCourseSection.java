package net.rvanasa.schoology.obj.sections;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/course-section
 */
public class SchoologyCourseSection extends SchoologyReference<SchoologyCourseSection>
{
	
	@SerializedName(value="id")
	String ID;
	@SerializedName(value="course_title")
	String courseTitle;
	@SerializedName(value="course_code")
	String courseCode;
	@SerializedName(value="course_id")
	String courseID;
	@SerializedName(value="school_id")
	String schoolID;
	@SerializedName(value="building_id")
	String buildingID;
	@SerializedName(value="access_code")
	String accessCode;
	@SerializedName(value="section_title")
	String sectionTitle;
	@SerializedName(value="section_code")
	String sectionCode;
	@SerializedName(value="section_school_code")
	String sectionSchoolCode;
	String synced;
	boolean active;
	String description;
	@SerializedName(value="subject_area")
	String subjectArea;
	@SerializedName(value="grade_level_range_start")
	int gradeLevelRangeStart;
	@SerializedName(value="grade_level_range_end")
	int gradeLevelRangeEnd;
	@SerializedName(value="parent_id")
	String parentID;
	@SerializedName(value="grading_periods")
	int[] gradingPeriods;
	@SerializedName(value="profile_url")
	String profileURL;
	String location;
	@SerializedName(value="meeting_days")
	String[] meetingDays;
	@SerializedName(value="start_time")
	String startTime;
	@SerializedName(value="end_time")
	String endTime;
	String weight;
	SchoologyCourseSectionOptions options;
	boolean admin;
	
	SchoologyLinks links;
	
	public String getID()
	{
	  return ID;
	}
	public String getCourseTitle()
	{
	  return courseTitle;
	}
	public String getCourseCode()
	{
	  return courseCode;
	}
	public String getCourseID()
	{
	  return courseID;
	}
	public String getSchoolID()
	{
	  return schoolID;
	}
	public String getBuildingID()
	{
	  return buildingID;
	}
	public String getAccessCode()
	{
	  return accessCode;
	}
	public String getSectionTitle()
	{
	  return sectionTitle;
	}
	public String getSectionCode()
	{
	  return sectionCode;
	}
	public String getSectionSchoolCode()
	{
	  return sectionSchoolCode;
	}
	public String getSynced()
	{
	  return synced;
	}
	public boolean getActive()
	{
	  return active;
	}
	public String getDescription()
	{
	  return description;
	}
	public String getSubjectArea()
	{
	  return subjectArea;
	}
	public int getGradeLevelRangeStart()
	{
	  return gradeLevelRangeStart;
	}
	public int getGradeLevelRangeEnd()
	{
	  return gradeLevelRangeEnd;
	}
	public String getParentID()
	{
	  return parentID;
	}
	public int[] getGradingPeriods()
	{
	  return gradingPeriods;
	}
	public String getProfileURL()
	{
	  return profileURL;
	}
	public String getLocation()
	{
	  return location;
	}
	public String[] getMeetingDays()
	{
	  return meetingDays;
	}
	public String getStartTime()
	{
	  return startTime;
	}
	public String getEndTime()
	{
	  return endTime;
	}
	public String getWeight()
	{
	  return weight;
	}
	public SchoologyCourseSectionOptions getOptions()
	{
	  return options;
	}
	public boolean getAdmin()
	{
	  return admin;
	}
	public SchoologyLinks getLinks()
	{
	  return links;
	}

	
}

class SchoologyCourseSectionOptions
{
	
	@SerializedName(value="weighted_grading_categories")
	String weightedGradingCategories;
	@SerializedName(value="upload_documents")
	String uploadDocuments;
	@SerializedName(value="create_discussion")
	String createDiscussion;
	@SerializedName(value="member_post")
	String memberPost;
	@SerializedName(value="member_post_comment")
	String memberPostComment;
	@SerializedName(value="default_grading_scale_id")
	boolean defaultGradingScaleID;
	@SerializedName(value="content_index_visibility")
	SchoologyContentIndexVisibility contentIndexVisibility;
	@SerializedName(value="hide_overall_grade")
	boolean hideOverallGrade;
	@SerializedName(value="hide_grading_period_grade")
	boolean hideGradingPeriodGrade;
	@SerializedName(value="allow_custom_overall_grade")
	boolean allowCustomOverallGrade;
	@SerializedName(value="allow_custom_overall_grade_text")
	boolean allowCustomOverallGradeText;
	
	public String getWeightedGradingCategories()
	{
	  return weightedGradingCategories;
	}

	public String getUploadDocuments()
	{
	  return uploadDocuments;
	}

	public String getCreateDiscussion()
	{
	  return createDiscussion;
	}

	public String getMemberPost()
	{
	  return memberPost;
	}

	public String getMemberPostComment()
	{
	  return memberPostComment;
	}

	public boolean getDefaultGradingScaleID()
	{
	  return defaultGradingScaleID;
	}

	public SchoologyContentIndexVisibility getContentIndexVisibility()
	{
	  return contentIndexVisibility;
	}

	public boolean getHideOverallGrade()
	{
	  return hideOverallGrade;
	}

	public boolean getHideGradingPeriodGrade()
	{
	  return hideGradingPeriodGrade;
	}

	public boolean getAllowCustomOverallGrade()
	{
	  return allowCustomOverallGrade;
	}

	public boolean getAllowCustomOverallGradeText()
	{
	  return allowCustomOverallGradeText;
	}

	
	class SchoologyContentIndexVisibility{
		
		boolean topics;
		boolean assignments;
		boolean assessments;
		@SerializedName(value="course_assessment")
		boolean courseAssessment;
		@SerializedName(value="common_assessments")
		boolean commonAssessments;
		boolean documents;
		boolean discussion;
		boolean album;
		boolean pages;
		
		public boolean getTopics()
		{
		  return topics;
		}

		public boolean getAssignments()
		{
		  return assignments;
		}

		public boolean getAssessments()
		{
		  return assessments;
		}

		public boolean getCourseAssessment()
		{
		  return courseAssessment;
		}

		public boolean getCommonAssessments()
		{
		  return commonAssessments;
		}

		public boolean getDocuments()
		{
		  return documents;
		}

		public boolean getDiscussion()
		{
		  return discussion;
		}

		public boolean getAlbum()
		{
		  return album;
		}

		public boolean getPages()
		{
		  return pages;
		}

		
	}
	
}
