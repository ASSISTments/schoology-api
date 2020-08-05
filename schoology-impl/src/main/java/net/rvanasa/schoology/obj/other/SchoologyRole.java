package net.rvanasa.schoology.obj.other;

import com.google.gson.annotations.SerializedName;

/**
 * Captures the data of a Role JSON object from the Schoology API as a Java class
 * @author jkstpierre
 *
 */
public class SchoologyRole {
  @SerializedName(value="id")
  private String ID;
  private String title;
  private int faculty;
  @SerializedName(value="role_type")
  private int roleType;
  
  public String getID()
  {
    return ID;
  }

  public String getTitle()
  {
    return title;
  }

  public int getFaculty()
  {
    return faculty;
  }

  public int getRoleType()
  {
    return roleType;
  }

}
