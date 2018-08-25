FROM java:7
VOLUME /tmp
EXPOSE 8800
ADD target/store-front-1.0-SNAPSHOT.jar /app.jar
ADD wait-for-it.sh /wait-for-it.sh
RUN bash -c 'touch /app.jar'
RUN bash -c 'chmod 777 /wait-for-it.sh'
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","/app.jar"]