FROM tomcat:8.5-jdk17

#RUN cp -R webapps.dist/* webapps
ADD target/test.war /usr/local/tomcat/webapps/
#COPY tomcat-users.xml /usr/local/tomcat/conf/
#COPY context.xml /usr/local/tomcat/conf/
#CMD ["catalina.sh", "run"]
