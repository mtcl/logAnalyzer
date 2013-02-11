Read Me:

***********Application Setup***********:
1. Create the folder exactly at this location: c:\logAnalyzer
2. Place followingfiles in above folder location:
	(a) logAnalyzer-x.x.x-SNAPSHOT.jar file in the location
	(b) App_Log.log ELC Application log file
	(c) date-properties.xml : Spring bean configuration file for configuring wily alert date and time



***********Configuring the application ***********
Two parametes can be changed for application configuration in date-properties.xml file: startDate and delta.

If wily alert came in at 7:00 PM on january 1st 2013 and you want to grab formatted logs for 10 minutes before wily occured fllowing configuration needs to be used.
	(a) startDate - "01/23/13 19:00:00"
	(b) delta  - "10"


***********Executing Application***********
Either of the two ways can be used to execute the application.
1. No verbose: Double click the logAnalyzer-x.x.x-SNAPSHOT.jar
2. Verbose: open command promt and type following commands:
	>cd c:\logAnalyzer\
	>java - jar logAnalyzer-1.0.4-SNAPSHOT.jar


***********Output***********
Two files are generated as final output:

1. FormattedLogsELC.xls : Formatted logs excel file.
2. logAnalyzer.log : log file generated with informational messages.