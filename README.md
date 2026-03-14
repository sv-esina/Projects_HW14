# Проект по автоматизации тестовых сценариев для ["ВТБ"](https://www.vtb.ru/)

## :clipboard: Содержание:

- [Технологии и инструменты](#laptop-технологии-и-инструменты)
- [Запуск автотестов](#arrow_forward-прогон-автотестов)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Пример Allure-отчета](#-пример-allure-отчета)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testOps)
- [Интеграция с Jira](#-интеграция-с-jira)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Видео примера запуска тестов в Selenoid](#-видео-примера-запуска-теста-в-selenoid)

## :computer: Технологии и инструменты:

<p align="center">
<img width="5%" title="IntelliJ IDEA" src="media/icons/Intelij_IDEA.svg">
<img width="5%" title="Gradle" src="media/icons/Gradle.svg">
<img width="5%" title="Java" src="media/icons/Java.svg">
<img width="5%" title="Selenide" src="media/icons/Selenide.svg">
<img width="5%" title="JUnit5" src="media/icons/JUnit5.svg">
<img width="5%" title="GitHub" src="media/icons/GitHub.svg">
<img width="5%" title="Selenoid" src="media/icons/Selenoid.svg">
<img width="5%" title="Allure Report" src="media/icons/Allure_Report.svg">
<img width="5%" title="Allure TestOps" src="media/icons/AllureTestOps.svg">
<img width="5%" title="Jenkins" src="media/icons/Jenkins.svg">
<img width="5%" title="Telegram" src="media/icons/Telegram.svg">
<img width="5%" title="Jira" src="media/icons/Jira.svg">
</p>

- В данном проекте представлены автоматизированные тесты разработанные на языке <code>Java</code> с использованием фреймворка <code>Selenide</code>.
- В качестве сборщика использован <code>Gradle</code>.  
- В качестве фреймворка модульного тестирования использован <code>JUnit 5</code>.
- Для прогона тестов в браузере используется [Selenoid](https://aerokube.com/selenoid/).
- Для удаленного запуска тестов реализована джоба в [Jenkins](https://jenkins.autotests.cloud/view/java_students/job/SvetlanaV_Esina-Jenkins_first-project/).
- Реализовано формирование [Allure-отчета](https://jenkins.autotests.cloud/view/java_students/job/SvetlanaV_Esina-Jenkins_first-project/26/allure/) с отправкой результатов прогона тестов в <code>Telegram</code> при помощи бота.
- В проекте так же задействована интеграция с [Allure TestOps](https://allure.autotests.cloud/project/5150/test-cases/43456?treeId=0) и [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1589).

## <img src="media/icons/Jenkins.svg" title="Jenkins" width="3%"/> Сборка в Jenkins:
<p align="center">
<img title="Jenkins Build" src="media/screenshots/Jenkins_build.png">
</p>

## <img src="media/icons/Allure_Report.svg" title="Allure_Report" width="3%"/> Allure-отчет:  
### Allure Report - Overwiew
<p align="center">
<img title="Overwiew" src="media/screenshots/Allure_report.png">
</p>

### Allure Report - Детализация отчета
<p align="center">
<img title="Suites" src="media/screenshots/Allure_report_steps.png">
</p>

## :movie_camera: Видео выполнения автотеста:



## <img src="media/icons/AllureTestOps.svg" title="Allure TestOps" width="3%"/> Интеграция с Allure TestOps:
<p align="center">
<img title="TestOps" src="media/screenshots/TestOps.png">
</p>

## <img src="media/icons/Jira.svg" title="Jira" width="3%"/> ВИнтеграция с Jira:
<p align="center">
<img title="Jira" src="media/screenshots/Jira.png">
</p>

