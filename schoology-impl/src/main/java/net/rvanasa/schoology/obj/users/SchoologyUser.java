package net.rvanasa.schoology.obj.users;

import org.json.JSONObject;
import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.impl.SchoologyRealm;
import net.rvanasa.schoology.obj.SchoologyReference;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/user
 */
public class SchoologyUser extends SchoologyReference<SchoologyUser>
{
  /*
   * https://developers.schoology.com/api-documentation/rest-api-v1/user
   * Must request extended user info to receive
   */
  public static class SchoologyProfileInfo
  {
    
    //Teacher only
    @SerializedName(value="subjects_taught")
    String subjectsTaught;
    @SerializedName(value="grades_taught")
    String gradesTaught;
    String position;
    String department;
    
    //All users (teachers + students)
    String bio;
    String phone;
    String website;
    String address;
    String interests;
    String activities;
    @SerializedName(value="birthday_date")
    String birthdayDate;
    String birthday;
    
    public String getSubjectsTaught()
    {
      return subjectsTaught;
    }

    public String getGradesTaught()
    {
      return gradesTaught;
    }

    public String getPosition()
    {
      return position;
    }

    public String getDepartment()
    {
      return department;
    }

    public String getBio()
    {
      return bio;
    }

    public String getPhone()
    {
      return phone;
    }

    public String getWebsite()
    {
      return website;
    }

    public String getAddress()
    {
      return address;
    }

    public String getInterests()
    {
      return interests;
    }

    public String getActivities()
    {
      return activities;
    }

    public String getBirthdayDate()
    {
      return birthdayDate;
    }

    public String getBirthday()
    {
      return birthday;
    }

  }
  
  /*
   * No documentation available
   */
  public static class SchoologyPermissions
  {

    @SerializedName(value="is_directory_public")
    boolean isDirectoryPublic;
    @SerializedName(value="allow_connections")
    boolean allowConnection;
    
    public boolean getIsDirectoryPublic()
    {
      return isDirectoryPublic;
    }

    public boolean getAllowConnection()
    {
      return allowConnection;
    }

  }

	//Same as uid
	@SerializedName(value="id")
	String ID;
	@SerializedName(value="uid")
	String userID;
	@SerializedName(value="school_id")
	String schoolID;
	@SerializedName(value="building_id")
	String buildingID;
	@SerializedName(value="school_uid")
	String schoolUID;
	@SerializedName(value="name_title")
	String nameTitle;
	@SerializedName(value="name_title_show")
	boolean nameTitleShow;
	@SerializedName(value="name_first")
	String nameFirst;
	@SerializedName(value="name_first_preferred")
	String nameFirstPreferred;
	@SerializedName(value="name_middle")
	String nameMiddle;
	@SerializedName(value="name_middle_show")
	String nameMiddleShow;
	@SerializedName(value="name_last")
	String nameLast;
	@SerializedName(value="name_display")
	String nameDisplay;
	String username;
	@SerializedName(value="primary_email")
	String primaryEmail;
	String position;
	SchoologyGenderEnum gender;
	@SerializedName(value="grad_year")
	int gradYear;
	@SerializedName(value="birthday_date")
	String birthdayDate;
	//Must have 'Administer users' permission
	String password;
	//Must have 'Administer users' permission
	@SerializedName(value="role_id")
	int roleID;
	@SerializedName(value="email_login_info")
	boolean emailLoginInfo;
	@SerializedName(value="picture_url")
	String pictureURL;
	@SerializedName(value="tz_name")
	String tzName;
	// 'View user parents' permission required from schoology API to access this information
	SchoologyUser[] parents;
	//TODO: comma-delimited list of integers
	@SerializedName(value="parent_uids")
	String parentUIDs;
	//TODO: comma-delimited list of integers
	@SerializedName(value="advisor_uids")
	String advisorUIDs;
	//TODO: comma-delimited list of integers
	@SerializedName(value="child_urls")
	String childURLs;
	@SerializedName(value="send_message")
	int sendMessage;
	boolean synced;
	@SerializedName(value="profile_picture_fid")
	int profilePictureFID;
	//TODO: comma-delimited list of integers
	@SerializedName(value="additional_buildings")
	String additionalBuildings;
	
	@SerializedName(value="profile_info")
	SchoologyProfileInfo profileInfo;
	
	//Missing from API documentation on Schoology
	@SerializedName(value="use_preferred_first_name")
	boolean usePreferredFirstName;
	//Missing from schoology documentation
	boolean admin;
	boolean status;
	
	public String getID()
	{
	  return ID;
	}

	public String getUserID()
	{
	  return userID;
	}

	public String getSchoolID()
	{
	  return schoolID;
	}

	public String getBuildingID()
	{
	  return buildingID;
	}

	public String getSchoolUID()
	{
	  return schoolUID;
	}

	public String getNameTitle()
	{
	  return nameTitle;
	}

	public boolean getNameTitleShow()
	{
	  return nameTitleShow;
	}

	public String getNameFirst()
	{
	  return nameFirst;
	}

	public String getNameFirstPreferred()
	{
	  return nameFirstPreferred;
	}

	public String getNameMiddle()
	{
	  return nameMiddle;
	}

	public String getNameMiddleShow()
	{
	  return nameMiddleShow;
	}

	public String getNameLast()
	{
	  return nameLast;
	}

	public String getNameDisplay()
	{
	  return nameDisplay;
	}

	public String getUsername()
	{
	  return username;
	}

	public String getPrimaryEmail()
	{
	  return primaryEmail;
	}

	public String getPosition()
	{
	  return position;
	}

	public SchoologyGenderEnum getGender()
	{
	  return gender;
	}

	public int getGradYear()
	{
	  return gradYear;
	}

	public String getBirthdayDate()
	{
	  return birthdayDate;
	}

	public String getPassword()
	{
	  return password;
	}

	public int getRoleID()
	{
	  return roleID;
	}

	public boolean getEmailLoginInfo()
	{
	  return emailLoginInfo;
	}

	public String getPictureURL()
	{
	  return pictureURL;
	}

	public String getTzName()
	{
	  return tzName;
	}

	public SchoologyUser[] getParents()
	{
	  return parents;
	}

	public String getParentUIDs()
	{
	  return parentUIDs;
	}

	public String getAdvisorUIDs()
	{
	  return advisorUIDs;
	}

	public String getChildURLs()
	{
	  return childURLs;
	}

	public int getSendMessage()
	{
	  return sendMessage;
	}

	public boolean getSynced()
	{
	  return synced;
	}

	public int getProfilePictureFID()
	{
	  return profilePictureFID;
	}

	public String getAdditionalBuildings()
	{
	  return additionalBuildings;
	}

	public SchoologyProfileInfo getProfileInfo()
	{
	  return profileInfo;
	}

	public boolean getUsePreferredFirstName()
	{
	  return usePreferredFirstName;
	}

	public boolean getAdmin()
	{
	  return admin;
	}

	public boolean getStatus()
	{
	  return status;
	}

	
	public boolean setNameFirstPreferred(String nameFirstPreferred)
	{
		try {
			schoology.put(SchoologyRealm.USER + ID, new JSONObject().put("name_first_preferred", nameFirstPreferred).toString()).requireSuccess();
			
			this.nameFirstPreferred = nameFirstPreferred;
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}