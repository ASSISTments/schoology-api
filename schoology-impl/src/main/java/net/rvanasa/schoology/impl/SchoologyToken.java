package net.rvanasa.schoology.impl;

import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class SchoologyToken
{
	private final SchoologyFlow flow;
	private final Token token;
	
	public SchoologyToken(SchoologyFlow flow, Token token)
	{
		this.flow = flow;
		this.token = token;
	}
	
	public SchoologyFlow getFlow()
	{
	  return flow;
	}
	public Token getToken()
	{
	  return token;
	}
	
	public OAuthService getService()
	{
		return getFlow().getService();
	}
	
	public String getAuthorizationUrl()
	{
		return getService().getAuthorizationUrl(getToken());
	}
}
