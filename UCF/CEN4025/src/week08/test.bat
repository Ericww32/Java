 startlocal
 SET LIB=C:\Users\scottl\school\ucf\sw2\2014-fall\svn\src\cen4025\lib\
 SET CP=.;%LIB%jdom-2.0.5.jar;%LIB%jdom-2.0.5.jar;%LIB%mysql-connector-java-5.1.32-bin.jar;%LIB%hamcrest-core-1.3.jar;%LIB%junit-4.11.jar
 java -cp %CP% org.junit.runner.JUnitCore week08.test.JUnitAppTest
 java -cp %CP% org.junit.runner.JUnitCore week08.test.JUnitDataAccessTest
 endlocal