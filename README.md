# Проект по автоматизации тестовых сценариев для ["ВТБ"](https://www.vtb.ru/)

## :clipboard: Содержание:

- [Технологии и инструменты](#computer-технологии-и-инструменты)
- [Сборка в Jenkins](#img-srcmediaiconsjenkinssvg-titlejenkins-width3-сборка-в-jenkins)
- [Allure-отчет](#img-srcmediaiconsallure_reportsvg-titleallure_report-width3-allure-отчет-)
  - [Overview](#overview)
  - [Детализаци отчета](#детализация-отчета)
- [Видео выполнения автотеста](#movie_camera-видео-выполнения-автотеста)
- [Интеграция с Allure TestOps](#img-srcmediaiconsjirasvg-titlejira-width3-интеграция-с-allure-testops)
  - [Дашборд](#дашборд)
- [Интеграция с Jira](#img-srcmediaiconsjirasvg-idjira-width3-интеграция-с-jira)
- [Уведомление в Telegram](#img-srcmediaiconstelegramsvg-titlejira-width3-уведомление-в-telegram)


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
![Jenkins_build.png](media/screenshots/Jenkins_build.png)

## <img src="media/icons/Allure_Report.svg" title="Allure_Report" width="3%"/> Allure-отчет:  
### Overview

![Allure_report.png](media/screenshots/Allure_report.png)

### Детализация отчета

![Allure_report_steps.png](media/screenshots/Allure_report_steps.png)

## :movie_camera: Видео выполнения автотеста:

<video src="media/Video.mp4" controls="controls" autoplay="autoplay" width="600" height="400">
</video>

## <img src="media/icons/Jira.svg" title="Jira" width="3%"/> Интеграция с Allure TestOps:
### Дашборд

![TestOpsDashboard.png](media/screenshots/TestOpsDashboard.png)

### Тест-кейсы

![TestOps.png](media/screenshots/TestOps.png)

## <img src="media/icons/Jira.svg" id="Jira" width="3%"/> Интеграция с Jira:

![Jira.png](media/screenshots/Jira.png)

## <img src="media/icons/Telegram.svg" title="Jira" width="3%"/> Уведомление в Telegram: