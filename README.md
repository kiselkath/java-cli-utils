📘 Задание: Java CLI Утилиты — IntelliJ + Git через терминал
🎯 Цель:
Ты создашь простое Java-приложение с помощью IntelliJ IDEA и будешь полностью управлять проектом через Git в терминале.

Ты научишься:

Как вручную создать Java-проект в IntelliJ (без Maven)

Как отслеживать изменения с помощью Git

Как создавать ветки, коммитить, пушить и управлять удалёнными репозиториями, как профессионал

🧰 Требования:
IntelliJ IDEA (Community или Ultimate)

Установленный Git (доступен в терминале)

Аккаунт на GitHub

Java JDK версии 11 или выше

🧱 Пошаговое выполнение
✅ Шаг 1: Создание репозитория на GitHub
🎓 Цель: подготовить удалённый репозиторий

Перейди на GitHub

Создай новый репозиторий:

Название: java-cli-utils

Без README / .gitignore / лицензии

Скопируй ссылку репозитория:

bash
Копировать
Редактировать
https://github.com/<твоё_имя_пользователя>/java-cli-utils.git
✅ Шаг 2: Создай Java-проект в IntelliJ (без Maven)
🎓 Цель: вручную собрать простой Java-проект

Открой IntelliJ IDEA → New Project → Java

Сними галочку “Add sample code”

Укажи:

Название проекта: java-cli-utils

Папка проекта: любая локальная директория

После открытия проекта, создай структуру вручную:

css
Копировать
Редактировать
src/
└── utils/
    └── HelloUtils.java
📄 Содержимое HelloUtils.java:

java
Копировать
Редактировать
package utils;

public class HelloUtils {
    public static String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
💾 Сохрани все файлы в IntelliJ

✅ Шаг 3: Инициализация Git и подключение к GitHub
🎓 Цель: настроить Git и связать с удалённым репозиторием (только через терминал!)

Открой терминал в корне проекта (где находится папка src/):

bash
Копировать
Редактировать
git init
git remote add origin https://github.com/<твоё_имя_пользователя>/java-cli-utils.git
git remote -v   # Проверка добавленных репозиториев
✅ Шаг 4: Отслеживание и первичный push кода
bash
Копировать
Редактировать
git add .
git commit -m "Initial commit with HelloUtils"
git branch -M main
git push -u origin main
✅ Шаг 5: Создай фичеветку
🎓 Цель: безопасно добавить новую функциональность

bash
Копировать
Редактировать
git checkout -b feature/add-greet-method
✏️ Обнови HelloUtils.java, добавив метод:

java
Копировать
Редактировать
public static String greetTimeOfDay(String name, String time) {
    return "Good " + time + ", " + name + "!";
}
💾 Сохрани изменения

✅ Закоммить и запушь изменения:
bash
Копировать
Редактировать
git add .
git commit -m "Add greetTimeOfDay method"
git push origin feature/add-greet-method
✅ Шаг 6: Слей фичу в main
bash
Копировать
Редактировать
git checkout main
git merge feature/add-greet-method
git push origin main
✅ Шаг 7: Практика управления удалёнными репами
bash
Копировать
Редактировать
git remote add backup https://github.com/<твоё_имя_пользователя>/backup-repo.git
git remote -v
git remote rename backup archive
git remote remove archive
✅ Шаг 8: Проверка статуса и истории проекта
bash
Копировать
Редактировать
git status
git log --oneline
✅ Шаг 9: Практика fetch / pull / merge
bash
Копировать
Редактировать
git fetch
git merge origin/main
git pull
📤 Что нужно сдать:
Ссылка на GitHub-репозиторий java-cli-utils

В файле HelloUtils.java — минимум два метода

Аккуратная история Git с использованием веток и коммитов

Все Git-команды — исключительно через терминал

Проект без Maven (только .java и папки)

🏁 Бонус (по желанию):
Создай дополнительный класс MathUtils.java, и пройди весь Git-процесс заново в новой ветке 🎯
