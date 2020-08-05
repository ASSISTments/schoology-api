package net.rvanasa.schoology.submissions;

import com.google.gson.annotations.SerializedName;

/**
 * Represents a Schoology API's Submission JSON object as a Java object. See
 * https://developers.schoology.com/api-documentation/rest-api-v1/submissions
 * for more info.
 * 
 * @author jkstpierre
 *
 */
public class SchoologySubmission {
  @SerializedName(value = "revision_id")
  String ID;
  @SerializedName(value = "uid")
  String userID;
  String created;
  Integer late;
  @SerializedName(value = "num_items")
  String numItems;
  Boolean draft;
  String body;
  
  public String getID()
  {
    return ID;
  }

  public String getUserID()
  {
    return userID;
  }

  public String getCreated()
  {
    return created;
  }

  public Integer getLate()
  {
    return late;
  }

  public String getNumItems()
  {
    return numItems;
  }

  public Boolean getDraft()
  {
    return draft;
  }

  public String getBody()
  {
    return body;
  }

}
