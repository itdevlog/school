# Проверка очереди в 1 класс

**🇷🇺 Русский** · **🇬🇧 [English](README.en.md)**

Десктопное приложение (Java 8 + JavaFX), которое показывает **номер очерёдности ребёнка
при зачислении в 1 класс**. Данные берутся из JSON-ответа портала Департамента
образования Администрации города Екатеринбурга — **edu-inform.ekadm.ru**.

## Возможности

- Получить информацию о номере очереди.
- Отслеживать изменение очереди (сохранённый предыдущий запрос).
- Сохранять настройки между запусками.

## Скриншоты

<img width="964" height="760" alt="Главное окно" src="https://github.com/user-attachments/assets/dd890a03-56ab-46b5-81ff-989a07895f95" />
<img width="964" height="760" alt="Результат проверки" src="https://github.com/user-attachments/assets/d5b917fc-cec9-4793-b893-aef0afe8bdfe" />

## Технологии

| Слой | Технология |
|---|---|
| Язык | **Java 8** (`maven.compiler.source/target = 1.8`) |
| UI | **JavaFX 15** (`javafx-controls`, `javafx-fxml`) |
| Сборка | **Maven** + `javafx-maven-plugin` (пакетирование `EXE`) |
| HTTP/парсинг | `jsoup 1.13.1` |
| JSON | `org.json 20210307`, `json-simple 1.1.1` |

## Требования и сборка

- **JDK 8+** (проект собран под Java 8).
- **Maven**.

```bash
git clone https://github.com/itdevlog/school.git
cd school

mvn -q compile           # сборка
mvn javafx:run           # запуск (javafx-maven-plugin)
```

Плагин настроен на `mainClass = sample.Main`. Бандлер `EXE` предназначен для упаковки
под Windows (`mvn javafx:jfxpackage` приблизительно; точная команда зависит от версии плагина).

## Структура проекта

```
school/
├── pom.xml                        # Maven: Java 8, JavaFX 15, jsoup, JSON
├── src/main/java/sample/
│   ├── Main.java                  # точка входа (JavaFX Application)
│   ├── Controller.java            # логика окна и запросов
│   ├── sample.fxml                # разметка интерфейса
│   └── parser/
│       ├── JsonParser.java        # парсинг ответа портала
│       ├── JsonFile.java          # работа с json.json
│       ├── School.java / Setting.java
│       └── Model/{Root,Items}.java
├── src/main/resources/            # json.json, itog.txt, setting.txt, sample.fxml
├── json.json / itog.txt / setting.txt   # рабочие файлы (данные, очередь, настройки)
└── school.iml                     # модуль IntelliJ IDEA
```

## Файлы данных

- `json.json` — последний полученный JSON с сайта.
- `itog.txt` — данные о номере очереди.
- `setting.txt` — последний запрос.

## Готовые сборки

В README ранее были внешние ссылки на сборки (Google Drive) для Windows и Mac OS.
Они ведут на файлы автора и не проверялись в рамках этой документации — при
необходимости собирайте приложение из исходников (см. раздел «Сборка»).

## ⚠️ Ограничения

- Приложение завязано на конкретный источник данных (портал `edu-inform.ekadm.ru`) и
  его формат JSON.
- Интерфейс и текст — на русском языке.
- Автотестов и CI нет; проверка выполняется запуском приложения.

## 📄 Лицензия

MIT — см. [LICENSE](LICENSE).
