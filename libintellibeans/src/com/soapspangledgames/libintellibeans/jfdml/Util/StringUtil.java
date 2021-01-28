/*
 * Copyright 2020 by Soap Spangled Games.
 * All Rights Reserved.
 *
 * No portion of this software may be copied, distributed, or modified without
 * the express written permission of the copyright holder.
 */
package com.soapspangledgames.libintellibeans.jfdml.Util;

/**
 *
 * @author Soap Spangled Games
 */
public class StringUtil
	{
	public StringUtil()
		{

		}

	static public int skipWhiteSpace(String stData, int nOffset)
		{
		int ret = nOffset;

		if (stData != null && nOffset >= 0)
			{
			int nLength = stData.length();

			while (nOffset < nLength && StringUtil.isWhiteSpace(stData.charAt(ret)))
				{
				++ret;
				}
			}
		return ret;
		}

	static public int findNextWhiteSpace(String stData, int nOffset)
		{
		int ret = nOffset;

		if (stData != null && nOffset >= 0)
			{
			int nLength = stData.length();

			while (nOffset < nLength && !StringUtil.isWhiteSpace(stData.charAt(ret)))
				{
				++ret;
				}
			}
		return ret;
		}

	static public boolean isWhiteSpace(char c)
		{
		return c < '!' || c > '~';
		}
	}
