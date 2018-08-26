FROM java:7
VOLUME /tmp
EXPOSE 8763
ADD store-order-provider/target/store-order-provider-1.0-SNAPSHOT.jar /store-order.jar
ADD wait-for-it.sh /wait-for-it.sh
RUN bash -c 'touch /store-order.jar'
RUN bash -c 'chmod 777 /wait-for-it.sh'
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=docker","-jar","/store-order.jar"]