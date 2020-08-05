package net.rvanasa.schoology.grades;

import com.google.gson.annotations.SerializedName;

/**
 * Java object to represent Schoology API's Grade JSON. See:
 * https://developers.schoology.com/api-documentation/rest-api-v1/grade for more
 * information
 * 
 * @author jkstpierre
 *
 */
public class SchoologyGrade {
  @SerializedName(value = "enrollment_id")
  String enrollmentID;
  @SerializedName(value = "assignment_id")
  String assignmentID;
  String grade;
  String exception;
  @SerializedName(value = "max_points")
  String maxPoints;
  String comment;
  @SerializedName(value = "comment_status")
  String commentStatus;
  String override;
  @SerializedName(value = "calculated_grade")
  String calculatedGrade;
  String timestamp;
  @SerializedName(value = "is_final")
  Boolean isFinal;
  String type;
  String pending;
  String location;
  @SerializedName(value = "scale_id")
  String scaleID;
  @SerializedName(value = "scale_type")
  String scaleType;
  @SerializedName(value = "category_id")
  String categoryID;
  
  public String getEnrollmentID()
  {
    return enrollmentID;
  }

  public String getAssignmentID()
  {
    return assignmentID;
  }

  public String getGrade()
  {
    return grade;
  }

  public String getException()
  {
    return exception;
  }

  public String getMaxPoints()
  {
    return maxPoints;
  }

  public String getComment()
  {
    return comment;
  }

  public String getCommentStatus()
  {
    return commentStatus;
  }

  public String getOverride()
  {
    return override;
  }

  public String getCalculatedGrade()
  {
    return calculatedGrade;
  }

  public String getTimestamp()
  {
    return timestamp;
  }

  public Boolean getIsFinal()
  {
    return isFinal;
  }

  public String getType()
  {
    return type;
  }

  public String getPending()
  {
    return pending;
  }

  public String getLocation()
  {
    return location;
  }

  public String getScaleID()
  {
    return scaleID;
  }

  public String getScaleType()
  {
    return scaleType;
  }

  public String getCategoryID()
  {
    return categoryID;
  }

}
