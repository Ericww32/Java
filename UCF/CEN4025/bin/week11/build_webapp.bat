setlocal
SET JAVA_HOME=C:\Program Files\Java\jdk1.8.0_60
SET ANT_HOME=C:\Users\Eric\Desktop\apache-ant\apache-ant-1.10.1
SET ANT_BAT=%ANT_HOME%\bin\ant.bat
SET BUILD_XML=E:\Documents\workspace\CEN4025\src\week11\build\build.xml
SET WEBAPP_DST_FLDR=E:\Documents\workspace\CEN4025\src\week11\webapp
SET SRC_FLDR=E:\Documents\workspace\CEN4025\src

%ANT_BAT% -buildfile %BUILD_XML% -DsrcFolder=%SRC_FLDR% -DwebappDstFolder=%WEBAPP_DST_FLDR% %1

endlocal