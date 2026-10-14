# First-Grade Queue Check

**🇬🇧 English** · **🇷🇺 [Русский](README.md)**

A desktop application (Java 8 + JavaFX) that shows the **queue position of a child
applying for first grade**. Data comes from the JSON response of the portal of the
Department of Education of the Yekaterinburg city administration — **edu-inform.ekadm.ru**.

## Features

- Get the current queue number.
- Track queue changes (compared to the saved previous request).
- Persist settings between runs.

## Screenshots

<img width="964" height="760" alt="Main window" src="https://github.com/user-attachments/assets/dd890a03-56ab-46b5-81ff-989a07895f95" />
<img width="964" height="760" alt="Check result" src="https://github.com/user-attachments/assets/d5b917fc-cec9-4793-b893-aef0afe8bdfe" />

## Technologies

| Layer | Technology |
|---|---|
| Language | **Java 8** (`maven.compiler.source/target = 1.8`) |
| UI | **JavaFX 15** (`javafx-controls`, `javafx-fxml`) |
| Build | **Maven** + `javafx-maven-plugin` (`EXE` bundler) |
| HTTP/parsing | `jsoup 1.13.1` |
| JSON | `org.json 20210307`, `json-simple 1.1.1` |

## Requirements and build

- **JDK 8+** (the project targets Java 8).
- **Maven**.

```bash
git clone https://github.com/itdevlog/school.git
cd school

mvn -q compile           # build
mvn javafx:run           # run (javafx-maven-plugin)
```

The plugin is configured with `mainClass = sample.Main`. The `EXE` bundler is intended for
Windows packaging.

## Project structure

```
school/
├── pom.xml                        # Maven: Java 8, JavaFX 15, jsoup, JSON
├── src/main/java/sample/
│   ├── Main.java                  # entry point (JavaFX Application)
│   ├── Controller.java            # window logic and requests
│   ├── sample.fxml                # UI layout
│   └── parser/
│       ├── JsonParser.java        # parses the portal response
│       ├── JsonFile.java          # works with json.json
│       ├── School.java / Setting.java
│       └── Model/{Root,Items}.java
├── src/main/resources/            # json.json, itog.txt, setting.txt, sample.fxml
├── json.json / itog.txt / setting.txt   # working files (data, queue, settings)
└── school.iml                     # IntelliJ IDEA module
```

## Data files

- `json.json` — the last JSON fetched from the site.
- `itog.txt` — queue number data.
- `setting.txt` — the last request.

## Prebuilt binaries

The README previously linked to external builds (Google Drive) for Windows and Mac OS.
Those point to the author's files and were not verified as part of this documentation —
build the app from source if needed (see "Requirements and build").

## ⚠️ Limitations

- The app is tied to a specific data source (`edu-inform.ekadm.ru`) and its JSON format.
- The interface and text are in Russian.
- No automated tests or CI; verification is done by running the app.

## 📄 License

MIT — see [LICENSE](LICENSE).
