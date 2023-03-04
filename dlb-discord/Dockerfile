FROM eclipse-temurin:19-jdk-alpine
VOLUME /tmp
ADD ./build/libs/discord-2023.1.jar discord-leo-bot.jar
ENTRYPOINT ["java", "-jar", "discord-leo-bot.jar"]