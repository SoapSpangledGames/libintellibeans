/*
 * Copyright 2020 by Soap Spangled Games.
 * All Rights Reserved.
 *
 * No portion of this software may be copied, distributed, or modified without
 * the express written permission of the copyright holder.
 */
package com.soapspangledgames.libintellibeans.jfdml.Util;

import java.util.List;

/**
 *
 * @author Soap Spangled Games
 */
public class ListUtil
	{
	public ListUtil()
		{
		
		}
	
	static public String toString(List<String> lstItems, String stSeparator)
		{
		String ret = "";
		
		if (lstItems != null && stSeparator != null)
			{
			int nItems = lstItems.size();
			
			for (int i = 0;i < nItems;i++)
				{
				ret += lstItems.get(i);
				
				if (i < nItems)
					{
					ret += stSeparator;
					}
				}
			}
		return ret;
		}
	}
