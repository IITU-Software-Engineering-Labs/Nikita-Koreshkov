# Используем официальное изображение OpenJDK 17
FROM openjdk:17-slim

# Копируем собранный JAR файл в контейнер
COPY target/tas3-1.0-SNAPSHOT.jar app.jar

# Открываем порт 8080 для доступа к приложению
EXPOSE 8080

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "app.jar"]