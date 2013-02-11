package com.mtcl.logAnalyzer.execute;

import org.apache.log4j.Logger;

import com.mtcl.logAnalyzer.util.FormatLog;

public class Execute {

	private static Logger log = Logger.getLogger(Execute.class);
	public static void main(String[] args) {
		

		FormatLog fl = new FormatLog();
		log.info("Excel File Generated with "
				+ fl.stringManipulation() + " rows entered.");
	}
}
