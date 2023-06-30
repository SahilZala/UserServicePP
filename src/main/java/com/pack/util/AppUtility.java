package com.pack.util;

import java.util.UUID;

public class AppUtility {
	public static String getRandomeId()
	{
		return UUID.randomUUID().toString();
	}
	private AppUtility() {
		super();
		
	}
}
