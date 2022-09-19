Стек: Kotlin + Gradle + Fuel + Jackson + Junit5 + Selenide + Allure

Запуск тестов:

    Склонировать репозиторий - git clone git@github.com:we1rd1k/stesting.git
    Перейти в директорию с проектом
    Запустить тесты промаркерованные тегом API: ./gradlew clean runApiTestSet
    Запустить тесты промаркерованные тегом UI: ./gradlew clean runUITestSet

Для получения отчета в формате Allure выполнить ./gradlew allureServe
