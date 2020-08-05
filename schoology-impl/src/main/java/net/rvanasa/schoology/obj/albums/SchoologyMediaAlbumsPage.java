package net.rvanasa.schoology.obj.albums;

import com.google.gson.annotations.SerializedName;
import net.rvanasa.schoology.obj.SchoologyPage;

/*
 * https://developers.schoology.com/api-documentation/rest-api-v1/media-album
 */
public class SchoologyMediaAlbumsPage extends SchoologyPage<SchoologyMediaAlbumsPage>
{

	@SerializedName(value="album")
	SchoologyMediaAlbum[] albums;
	
	public SchoologyMediaAlbum[] getAlbums()
	{
	  return albums;
	}

}
