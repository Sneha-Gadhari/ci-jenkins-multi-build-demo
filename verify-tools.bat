@echo off
echo Checking Java...
java -version
echo.
echo Checking javac...
javac -version
echo.
echo Checking Git...
git --version
echo.
echo Checking Maven...
mvn -version
echo.
echo Checking Ant...
ant -version
echo.
echo Checking Gradle...
gradle -version
echo.
echo All checks complete.
pause
