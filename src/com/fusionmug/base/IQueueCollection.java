package com.fusionmug.base;


public interface IQueueCollection
{
	/**
	 * @param key
	 * @param payload 
	 */
	public void add(String key, String payload);
	
	/**
	 * @param key
	 * @return null if queue is empty, otherwise payload.
	 */
	public String get(String key);
}
