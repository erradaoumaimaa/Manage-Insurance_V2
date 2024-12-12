FROM tomcat:10.0-jdk17-openjdk

WORKDIR /usr/local/tomcat

RUN rm -rf webapps/ROOT

COPY target/Manage-Insurance_V2-1.0-SNAPSHOT.war webapps/ROOT.war

RUN chmod 755 webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]