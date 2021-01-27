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
import com.soapspangledgames.libintellibeans.jfdml.parser.IJFDMParser;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * This parses version 7 of the IntelliJ Form Designer Markup Language, and
 * creates the corresponding Java metadata that will be used to create the
 * correponding Netbeans form.
 * 
 * @author Soap Spangled Games
 */
public class JFD7Parser implements IJFDMParser
	{
	private final String m_stData;
	
	private int m_nOffset;
	
	private ParseJFD7Header m_parseHeader;
	
	/**
	 * 
	 * @param stData The complete markup file.
	 */
	public JFD7Parser(String stData)
		{
		m_stData = stData;
		m_parseHeader = new ParseJFD7Header(stData);
		}
	
	@Override
	public void parse() throws JFDMParseError
		{
		m_nOffset = 0;
		m_parseHeader.parse();
		}
	
	public static void main(String[] args) throws IOException, JFDMParseError
		{
		List<String> lstLines = Files.readAllLines(Paths.get("test.jfdm"));
		JFD7Parser parser = new JFD7Parser(lstLines.toString().replace("[", "").replace("]", ""));
		
		parser.parse();
		}
	}
