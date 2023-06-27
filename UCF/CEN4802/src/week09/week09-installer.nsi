# Hello world installer
#
!define APPNAME "Week09 Installer"
!define COMPANYNAME "Eric Willoughby"
!define DESCRIPTION "Hello World Installer"
# These three must be integers
!define VERSIONMAJOR 1
!define VERSIONMINOR 1
!define VERSIONBUILD 1
 
RequestExecutionLevel admin ;Require admin rights on NT6+ (When UAC is turned on)

InstallDir "$PROGRAMFILES\${COMPANYNAME}\${APPNAME}"

Name "${COMPANYNAME} - ${APPNAME}"
outFile "week09-installer.exe"

# Just two pages - install location, and installation
page directory
Page instfiles


section "install"
    setOutPath $INSTDIR
    file "HelloWorld.java"
sectionEnd

