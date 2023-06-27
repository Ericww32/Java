setlocal
##
## Tomcat batch files require JAVA_HOME and CATALINA_HOME be defined
## Since we are creating our own batch file we have to specify it
##
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_45
SET CATALINA_HOME=C:\Program Files\Apache Software Foundation\Tomcat 8.5

##
## No changes should be required here
##
SET TOMCAT_BIN=%CATALINA_HOME%\bin
SET STOP=shutdown.bat

%TOMCAT_BIN%\%STOP% 

endlocal