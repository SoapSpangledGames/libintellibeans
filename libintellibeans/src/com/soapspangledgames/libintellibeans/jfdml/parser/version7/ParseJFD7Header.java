/*
 * Copyright 2020 by Soap Spangled Games.
 * All Rights Reserved.
 *
 * No portion of this software may be copied, distributed, or modified without
 * the express written permission of the copyright holder.
 */
package com.soapspangledgames.libintellibeans.jfdml.parser.version7;

import com.soapspangledgames.libintellibeans.jfdml.exceptions.JFDMParseError;
import com.soapspangledgames.libintellibeans.jfdml.metadata.JFDMHeader;

/**
 *
 * @author Soap Spangled Games
 */
public class ParseJFD7Header
	{
	private JFDMHeader m_header = new JFDMHeader();
	
	private final String m_stData;
	
	private int m_nOffset = 0;
	
	public ParseJFD7Header(String stLine)
		{
		m_stData = stLine;
		}
	
	public void parse() throws JFDMParseError
		{
		parseIdentifier();
		parseProgramName();
		}
	
	private void parseIdentifier() throws JFDMParseError
		{
		int nTemp = m_stData.indexOf(" ", m_nOffset);
		
		if (nTemp != -1)
			{
			m_header.m_stIdentifier = m_stData.substring(m_nOffset, nTemp);
			
			m_nOffset += nTemp + 1;
			}
		else
			{
			throw new JFDMParseError("Could not find the JFDM identifier at offset " + m_nOffset);
			}
		}
	
	private void parseProgramName() throws JFDMParseError
		{
		
		}
	}
