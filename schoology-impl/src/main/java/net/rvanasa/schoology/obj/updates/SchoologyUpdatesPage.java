package net.rvanasa.schoology.obj.updates;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyPage;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/updates
 * Represents a page of updates for given course
 */
public class SchoologyUpdatesPage extends SchoologyPage<SchoologyUpdatesPage>
{
	
	@SerializedName(value="update")
	SchoologyUpdate[] updates;
	
	public SchoologyUpdate[] getUpdates()
	{
	  return updates;
	}

}
