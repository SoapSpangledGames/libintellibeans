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
import com.soapspangledgames.libintellibeans.jfdml.metadata.JFDMBody;

/**
 *
 * @author Soap Spangled Games
 */
public class ParseJFD7Body
	{
	private final JFDMBody m_body = new JFDMBody();

	private final String m_stData;

	private int m_nOffset;

	public ParseJFD7Body(String stData)
		{
		m_stData = stData;
		}

	public JFDMBody getBody()
		{
		return m_body;
		}

	public void parse(int nOffset) throws JFDMParseError
		{
		int nTemp;

		m_nOffset = StringUtil.skipWhiteSpace(m_stData, nOffset);
		nTemp = StringUtil.findNextWhiteSpace(m_stData, m_nOffset);
		while (nTemp > m_nOffset)
			{
			String stCommand = m_stData.substring(m_nOffset, nTemp).toLowerCase();

			switch (stCommand)
				{
				case "new":
					m_nOffset = nTemp;
					processNewCommand();
					break;
				}
			m_nOffset = nTemp;
			nTemp = StringUtil.findNextWhiteSpace(m_stData, m_nOffset);
			}
		}

	private void processNewCommand() throws JFDMParseError
		{
		int nTemp;

		m_nOffset = StringUtil.skipWhiteSpace(m_stData, m_nOffset);
		nTemp = StringUtil.findNextWhiteSpace(m_stData, m_nOffset);
		while (nTemp > m_nOffset)
			{
			String stType = m_stData.substring(m_nOffset, nTemp).toLowerCase();
			
			switch (stType)
				{
				case "formmodel":
					processFormModel(nTemp);
					break;
				}
			}
		}
	
	private void processFormModel(int nTemp) throws JFDMParseError
		{
		ParseFormModel parse = new ParseFormModel(m_stData);
		
		parse.parse(nTemp);
		}
	}
