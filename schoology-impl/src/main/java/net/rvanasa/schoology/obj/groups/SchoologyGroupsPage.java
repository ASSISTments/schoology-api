package net.rvanasa.schoology.obj.groups;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyPage;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/group
 * Represents a page of groups
 */
public class SchoologyGroupsPage extends SchoologyPage<SchoologyGroupsPage>
{
	
	@SerializedName(value="group")
	SchoologyGroup[] groups;
	
	public SchoologyGroup[] getGroups()
	{
	  return groups;
	}

}
