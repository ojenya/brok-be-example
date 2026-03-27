# brok-be-example

Многомодульный Java-проект на Spring Boot для демонстрации работы микросервисной архитектуры.

> **Пример кода для статьи на Хабре.** Этот репозиторий содержит иллюстративный код, который разбирается в соответствующей статье.

## Структура проекта

```
brok-be-example/
├── brok-core/        # Основной модуль (core)
├── brok-bpm/         # Модуль BPM (Business Process Management)
├── brok-context/     # Модуль контекста
├── build.gradle      # Корневой конфигурационный файл Gradle
├── settings.gradle   # Настройки проекта Gradle
└── gradlew / gradlew.bat  # Gradle wrapper
```

## Требования

- Java 17+
- Gradle 8.x

## Сборка и запуск

### Сборка всех модулей

```bash
./gradlew build
```

### Запуск отдельных модулей

```bash
# Запуск brok-core
./gradlew :brok-core:bootRun

# Запуск brok-bpm
./gradlew :brok-bpm:bootRun

# Запуск brok-context
./gradlew :brok-context:bootRun
```

### Сборка JAR-файлов

```bash
./gradlew bootJar
```

JAR-файлы будут созданы в директориях `build/libs/` каждого модуля.

### Копирование JAR для Electron-приложения

```bash
./gradlew copyJarsToDemo
```

Собранные JAR будут скопированы в `../brok-demo/jars`.

## Модули

### brok-core

Основной демо-модуль приложения. Запускается с задержкой 5 секунд для обеспечения порядка старта сервисов.

### brok-bpm

Демо-модуль управления бизнес-процессами. Запускается с задержкой 10 секунд для обеспечения порядка старта сервисов.

### brok-context

Демо-модуль контекста приложения. Запускается с задержкой 15 секунд для обеспечения порядка старта сервисов.

## Технологии

- Spring Boot 3.2.5
- Spring Web
- Spring Actuator
- Java 17
