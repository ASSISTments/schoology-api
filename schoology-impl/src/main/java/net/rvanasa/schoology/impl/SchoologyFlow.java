package net.rvanasa.schoology.impl;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.SignatureType;
import org.scribe.oauth.OAuthService;

public class SchoologyFlow
{
	public static OAuthService createService(SchoologyResourceLocator locator, String key, String secret, String callbackUrl)
	{
		return new ServiceBuilder()
				.provider(new OAuthSchoologyApi(locator))
				.apiKey(key)
				.apiSecret(secret)
				.callback(callbackUrl)
				.signatureType(SignatureType.Header)
				.build();
	}
	
	private final SchoologyResourceLocator resourceLocator;
	
	private final OAuthService service;
	
	public SchoologyFlow(SchoologyResourceLocator locator, String key, String secret, String callbackUrl)
	{
		this(locator, createService(locator, key, secret, callbackUrl));
	}
	
	public SchoologyResourceLocator getResourceLocator()
	{
	  return resourceLocator;
	}
	
	public OAuthService getService()
	{
	  return service;
	}
	
	public SchoologyFlow(SchoologyResourceLocator locator, OAuthService service)
	{
		this.resourceLocator = locator;
		this.service = service;
	}
	
	public SchoologyToken createRequestToken()
	{
		return new SchoologyToken(this, getService().getRequestToken());
	}
}
