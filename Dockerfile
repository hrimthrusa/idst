# Используем официальный образ Maven для сборки
FROM maven:3-openjdk-17 AS builder

# Устанавливаем рабочую директорию
WORKDIR /app

# Клонируем репозиторий в контейнер
RUN git clone https://github.com/hrimthrusa/idst.git .


# Собираем проект
RUN mvn clean install

# Указываем порт, который будет слушать приложение
EXPOSE 8080

# Запускаем приложение
CMD ["java", "-jar", "/app/target/demo-0.0.1-SNAPSHOT.jar"]