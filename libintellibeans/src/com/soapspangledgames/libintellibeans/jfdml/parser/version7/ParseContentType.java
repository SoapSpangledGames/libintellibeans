/*
 * Copyright 2020 by Soap Spangled Games.
 * All Rights Reserved.
 *
 * No portion of this software may be copied, distributed, or modified without
 * the express written permission of the copyright holder.
 */
package com.soapspangledgames.libintellibeans.jfdml.parser.version7;

import com.soapspangledgames.libintellibeans.jfdml.metadata.JFDMContentType;

/**
 *
 * @author Soap Spangled Games
 */
public class ParseContentType
	{
	private final JFDMContentType m_model = new JFDMContentType();
	
	private final String m_stData;

	private int m_nOffset;

	public ParseContentType(String stData)
		{
		m_stData = stData;
		}
	}
