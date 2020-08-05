package net.rvanasa.schoology.obj;

/*
 * Link provided to self
 * Useful for making additional requests to the given endpoint
 */
public class SchoologyLinks
{
	
	String self;
	//Optional URL if next is available
	String next;
	//Optional URL if previous is available
	String previous;
	
	public String getSelf()
	{
	  return self;
	}
	public String getNext()
	{
	  return next;
	}
	public String getPrevious()
	{
	  return previous;
	}
	    
	
}
