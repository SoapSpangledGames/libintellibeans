/*
 * Copyright 2020 by Soap Spangled Games.
 * All Rights Reserved.
 *
 * No portion of this software may be copied, distributed, or modified without
 * the express written permission of the copyright holder.
 */
package com.soapspangledgames.libintellibeans.jfdml.parser;

import com.soapspangledgames.libintellibeans.jfdml.exceptions.JFDMParseError;

/**
 *
 * @author Soap Spangled Games
 */
public interface IJFDMParser
	{
	public void parse() throws JFDMParseError;
	}
