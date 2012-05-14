package org.wrml.utils;

public class UtilityFunctions
{

	public static String arrayJoin(Object[] array, String glue)
	{
		if (array.length == 0)
		{
			return "";
		}
		
		int est = (array[0].toString().length() + glue.length()) * array.length;
		StringBuilder sb = new StringBuilder(est);
		
		int i;
		for (i = 0; i < array.length - 2; i++)
		{
			sb.append(array[i].toString());
			sb.append(glue);
		}
		sb.append(array[i]);
		
		return sb.toString();
	}
	
/*	public static String arrayJoin(Object[] array, String glue, Method transform, Object... args)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
		if (array.length == 0)
		{
			return "";
		}
		
		int est = (transform.invoke(array[0], args).toString().length() + glue.length()) * array.length;
		StringBuilder sb = new StringBuilder(est);
		
		int i;
		for (i = 0; i < array.length - 2; i++)
		{
			sb.append(transform.invoke(array[i], args).toString());
			sb.append(glue);
		}
		sb.append(array[i]);
		
		return sb.toString();
	} */
	
	public static boolean arrayContains(Object[] array, Object target)
	{
		for (Object el : array)
		{
			if (el.equals(target))
				return true;
		}
		return false;
	}
}
