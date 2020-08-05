package net.rvanasa.schoology.impl;

import net.rvanasa.schoology.ISchoologyNodeParser;
import net.rvanasa.schoology.impl.json.JsonSchoologyResponseHandler;
import net.rvanasa.schoology.impl.xml.XmlSchoologyResponseHandler;

public enum SchoologyContentTypeEnum
{
	JSON("application/json", "JSON", JsonSchoologyResponseHandler.DEFAULT),
	XML("text/xml", "XML", XmlSchoologyResponseHandler.DEFAULT);
	
	private final String ID;
	private final String name;
	private final ISchoologyNodeParser parser;
	
	private SchoologyContentTypeEnum(String ID, String name, ISchoologyNodeParser parser)
	{
		this.ID = ID;
		this.name = name;
		this.parser = parser;
	}
	
	public String getID()
	{
	  return ID;
	}
	public String getName()
	{
	  return name;
	}
	public ISchoologyNodeParser getParser()
	{
	  return parser;
	}
	
}
