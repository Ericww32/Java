setlocal
SET SRC=C:\Users\scottl\school\ucf\sw2\2014-fall\svn\src\cen4025\src\week09\week09app.war
SET DST=D:\tools\java\jboss-as-7.1.1.Final\jboss-as-7.1.1.Final\standalone\deployments
xcopy %SRC% %DST% /Y
endlocal