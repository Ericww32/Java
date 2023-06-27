setlocal
SET SRC=E:\Documents\workspace\CEN4025\src\week12\week12app_Willoughby.war
SET DST=C:\Users\Eric\Desktop\apache-tomcat\apache-tomcat-8.0.14\webapps
xcopy %SRC% %DST% /Y
endlocal