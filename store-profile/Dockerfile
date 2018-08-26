FROM java:7
VOLUME /tmp
EXPOSE 8762
ADD store-profile-provider/target/store-profile-provider-1.0-SNAPSHOT.jar /store-profile.jar
ADD wait-for-it.sh /wait-for-it.sh
RUN bash -c 'touch /store-profile.jar'
RUN bash -c 'chmod 777 /wait-for-it.sh'
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","/store-profile.jar"]