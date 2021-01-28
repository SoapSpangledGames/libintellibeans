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
import com.soapspangledgames.libintellibeans.jfdml.metadata.JFDMFormModel;

/**
 * 
 * @author Soap Spangled Games
 */
public class ParseFormModel
	{
	private final JFDMFormModel m_model = new JFDMFormModel();
	
	private final String m_stData;

	private int m_nOffset;

	public ParseFormModel(String stData)
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
			String stTag = m_stData.substring(m_nOffset, nTemp).toLowerCase();
			
			if (stTag.equals("{"))
				{
				m_nOffset= nTemp;
				parseContent();
				}
			else
				{
				throw new JFDMParseError("Expecting opening brace, but found " + stTag + " at " + m_nOffset);
				}
			}
		}
	
	/**
	 * Parses the content of the FormModel block.
	 */
	private void parseContent()
		{
		int nTemp;
		
		m_nOffset = StringUtil.skipWhiteSpace(m_stData, m_nOffset);
		nTemp = StringUtil.findNextWhiteSpace(m_stData, m_nOffset);
		while (nTemp > m_nOffset)
			{
			String stTag = m_stData.substring(m_nOffset, nTemp).toLowerCase().toLowerCase();
			
			switch (stTag)
				{
				case "}":
					break;
				case "contenttype":
					
					break;
				}
			}
		}
	}
