package com.fusionmug;


import com.fusionmug.base.IQueueCollection;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;


public class QueueCollection implements IQueueCollection
{
	private Map<String, Queue<String>> queueCollection;

	public void QueueCollection()
	{
		this.queueCollection = new HashMap<>();
	}
	
	@Override
	public void add(String key, String payload)
	{
		
	}

	@Override
	public String get(String key)
	{
		return null;
	}
	
}
