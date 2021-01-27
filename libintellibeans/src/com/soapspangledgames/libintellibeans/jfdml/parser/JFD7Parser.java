/*
 * Copyright 2020 by Soap Spangled Games.
 * All Rights Reserved.
 *
 * No portion of this software may be copied, distributed, or modified without
 * the express written permission of the copyright holder.
 */
package com.soapspangledgames.libintellibeans.jfdml.parser;

import com.soapspangledgames.libintellibeans.jfdml.exceptions.JFDMParseError;
import com.soapspangledgames.libintellibeans.jfdml.metadata.JFDMHeader;
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
public class JFD7Parser
	{
	private JFDMHeader m_header = new JFDMHeader();
	
	private final String m_stData;
	
	private int m_nOffset;
	
	/**
	 * 
	 * @param stData The complete markup file.
	 */
	public JFD7Parser(String stData)
		{
		m_stData = stData;
		}
	
	public void parse() throws JFDMParseError
		{
		m_nOffset = 0;
		parseHeader();
		}
	
	private void parseHeader() throws JFDMParseError
		{
		parseIdentifier();
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
	
	public static void main(String[] args) throws IOException, JFDMParseError
		{
		List<String> lstLines = Files.readAllLines(Paths.get("/home/personal/temp/test.jfdm"));
		JFD7Parser parser = new JFD7Parser(lstLines.toString().replace("[", "").replace("]", ""));
		
		parser.parse();
		}
	}
