package net.rvanasa.schoology.obj.enrollment;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyLinks;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/enrollment
 */
public class SchoologyEnrollment extends SchoologyReference<SchoologyEnrollment> {
  @SerializedName(value = "id")
  String ID;
  @SerializedName(value = "uid")
  String userID;
  @SerializedName(value = "school_uid")
  String schoolUID;
  @SerializedName(value = "name_title")
  String nameTitle;
  @SerializedName(value = "name_title_show")
  boolean nameTitleShow;
  @SerializedName(value = "name_first")
  String nameFirst;
  @SerializedName(value = "name_first_preferred")
  String nameFirstPreferred;
  @SerializedName(value = "use_preferred_first_name")
  boolean usePreferredFirstName;
  @SerializedName(value = "name_middle")
  String nameMiddle;
  @SerializedName(value = "name_middle_show")
  boolean nameMiddleShow;
  @SerializedName(value = "name_last")
  String nameLast;
  @SerializedName(value = "name_display")
  String nameDisplay;
  boolean admin;
  SchoologyEnrollmentStatus status;
  @SerializedName(value = "picture_url")
  String pictureURL;
  // Documentation missing
  @SerializedName(value = "enrollment_source")
  int enrollmentSource;

  SchoologyLinks links;
  
  public String getID()
  {
    return ID;
  }
  public void setID(String ID)
  {
    this.ID = ID;
  }

  public String getUserID()
  {
    return userID;
  }
  public void setUserID(String userID)
  {
    this.userID = userID;
  }

  public String getSchoolUID()
  {
    return schoolUID;
  }
  public void setSchoolUID(String schoolUID)
  {
    this.schoolUID = schoolUID;
  }

  public String getNameTitle()
  {
    return nameTitle;
  }
  public void setNameTitle(String nameTitle)
  {
    this.nameTitle = nameTitle;
  }

  public boolean getNameTitleShow()
  {
    return nameTitleShow;
  }
  public void setNameTitleShow(boolean nameTitleShow)
  {
    this.nameTitleShow = nameTitleShow;
  }

  public String getNameFirst()
  {
    return nameFirst;
  }
  public void setNameFirst(String nameFirst)
  {
    this.nameFirst = nameFirst;
  }

  public String getNameFirstPreferred()
  {
    return nameFirstPreferred;
  }
  public void setNameFirstPreferred(String nameFirstPreferred)
  {
    this.nameFirstPreferred = nameFirstPreferred;
  }

  public boolean getUsePreferredFirstName()
  {
    return usePreferredFirstName;
  }
  public void setUsePreferredFirstName(boolean usePreferredFirstName)
  {
    this.usePreferredFirstName = usePreferredFirstName;
  }

  public String getNameMiddle()
  {
    return nameMiddle;
  }
  public void setNameMiddle(String nameMiddle)
  {
    this.nameMiddle = nameMiddle;
  }

  public boolean getNameMiddleShow()
  {
    return nameMiddleShow;
  }
  public void setNameMiddleShow(boolean nameMiddleShow)
  {
    this.nameMiddleShow = nameMiddleShow;
  }

  public String getNameLast()
  {
    return nameLast;
  }
  public void setNameLast(String nameLast)
  {
    this.nameLast = nameLast;
  }

  public String getNameDisplay()
  {
    return nameDisplay;
  }
  public void setNameDisplay(String nameDisplay)
  {
    this.nameDisplay = nameDisplay;
  }

  public boolean getAdmin()
  {
    return admin;
  }
  public void setAdmin(boolean admin)
  {
    this.admin = admin;
  }

  public SchoologyEnrollmentStatus getStatus()
  {
    return status;
  }
  public void setStatus(SchoologyEnrollmentStatus status)
  {
    this.status = status;
  }

  public String getPictureURL()
  {
    return pictureURL;
  }
  public void setPictureURL(String pictureURL)
  {
    this.pictureURL = pictureURL;
  }

  public int getEnrollmentSource()
  {
    return enrollmentSource;
  }
  public void setEnrollmentSource(int enrollmentSource)
  {
    this.enrollmentSource = enrollmentSource;
  }

  public SchoologyLinks getLinks()
  {
    return links;
  }
  public void setLinks(SchoologyLinks links)
  {
    this.links = links;
  }


}
