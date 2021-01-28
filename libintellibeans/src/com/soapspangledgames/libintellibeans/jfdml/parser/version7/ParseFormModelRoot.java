/*
 * Copyright 2020 by Soap Spangled Games.
 * All Rights Reserved.
 *
 * No portion of this software may be copied, distributed, or modified without
 * the express written permission of the copyright holder.
 */
package com.soapspangledgames.libintellibeans.jfdml.parser.version7;

import com.soapspangledgames.libintellibeans.jfdml.Util.StringUtil;
import com.soapspangledgames.libintellibeans.jfdml.exceptions.JFDMParseError;

/**
 *
 * @author Soap Spangled Games
 */
public class ParseFormModelRoot
	{
	private final JFDMFormRoot m_model = new JFDMFormRoot();
	
	private final String m_stData;

	private int m_nOffset;

	public ParseFormModelRoot(String stData)
		{
		m_stData = stData;
		}

	public void parse(int nOffset) throws JFDMParseError
		{
		int nTemp;

		m_nOffset = StringUtil.skipWhiteSpace(m_stData, nOffset);
		nTemp = StringUtil.findNextWhiteSpace(m_stData, m_nOffset);
		if (nTemp > m_nOffset)
			{
			}
		}
	}
