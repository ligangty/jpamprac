Steps to setup the Jpam:

1. download jpam 1.1 from http://sourceforge.net/projects/jpam/files/jpam/jpam-1.1/ according to your platform (this guide is for RHEL 6 x86_64
2. extract the archive.
3. copy libjpam.so to your platform java lib path as below (rhel 6):

 for open jdk:
 /usr/lib/jvm/java-${version}-openjdk-${release}.x86_64/jre/lib/amd64

 for sun hotspot jdk:
 $JAVA_HOME/jre/lib/amd64

 NOTE: if this is for server usage, please copy it to jre/lib/amd64/server
4. replace your /etc/pam.d/system-auth with system-auth file
5. add jpam-1.1.jar to your java classpath(ant lib, maven dependency or anything else)
6. developing your auth api with jpam. sample code see jpamprac code clips.)
