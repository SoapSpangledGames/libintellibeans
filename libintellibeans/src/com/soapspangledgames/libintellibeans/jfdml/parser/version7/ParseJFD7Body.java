/*
 * Copyright 2020 by Soap Spangled Games.
 * All Rights Reserved.
 *
 * No portion of this software may be copied, distributed, or modified without
 * the express written permission of the copyright holder.
 */
package com.soapspangledgames.libintellibeans.jfdml.parser.version7;

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
		}
	}
