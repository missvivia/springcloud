FROM java:7
VOLUME /tmp
EXPOSE 8761
ADD target/svc-center-1.0-SNAPSHOT.jar /eureka.jar
ADD wait-for-it.sh /wait-for-it.sh
RUN bash -c 'touch /eureka.jar'
RUN bash -c 'chmod 777 /wait-for-it.sh'
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","/eureka.jar"]