# mobile-tests-example
# Project with mobile tests for wikipedia app.
<img width="100%" title="wikipedia" src="images/wikipedia.jpeg">

## :page_with_curl: Scope:

- <a href="#computer-сode_stack">Technology and tools</a>
- <a href="#clipboard-Test-cases">Test-cases</a>
- <a href="#Jenkins-job">Jenkins job</a>
- <a href="#keyboard-launch-from-terminal">Launch from terminal</a>
- <a href="#bar_chart-Test-results-report">Test results report</a>
- <a href="#robot-Telegram">Telegram Bot Notifications</a>
- <a href="#film_projector-Example-video-of-test-run-in-Selenoid">Example video of test-run in Selenoid</a>

## :computer: Technology and tools
<p align="left"> 
<img width="6%" title="Java" src="images/java-logo-vector.png">
<img width="10%" title="Selenide" src="images/selenide-logo-big.png">
<img width="6%" title="Allure Report" src="images/allurereport-logo.png">
<img width="6%" title="Gradle" src="images/gradle-knowledge-graph-logo.png">
<img width="6%" title="JUnit5" src="images/junit5-logo.png">
<img width="6%" title="IntelliJ IDEA" src="images/IntelliJ_IDEA_Icon.svg.png">
<img width="6%" title="Selenoid" src="images/selenoid-logo.png">
<img width="6%" title="GitHub" src="images/github-logo.png">
<img width="4%" title="Jenkins" src="images/jenkins-logo.png">
<img width="6%" title="Telegram" src="images/Telegram_2019_Logo.svg.png">
</p>

## :clipboard: Test-cases
First Onboarding page checking
Checking Info about Onboardingsettings
Checking 3rd Onboarding page Offer to join
Checking 4th Onboarding page Get started

## <img width="4%" title="Jenkins Job src="images/jenkins-logo.png"> Jenkins job
 https://jenkins.autotests.cloud/job/HW_22MobileTests/
![image](https://user-images.githubusercontent.com/65370123/180200201-86bbc089-6907-4a0d-8c20-423c930c7cee.png)
![image](https://user-images.githubusercontent.com/65370123/180200851-987bedd8-f403-4138-a058-3a375efac674.png)


## :keyboard: Launch from terminal
Local launch:
```
gradle clean test -Dhost=emulator
```

Remote launch:
```
clean
test
-Dhost=emulator

clean
test
-Dhost=device

clean
test
-Dhost=browserStack

## <img width="4%" title="Allure Report" src="images/allurereport-logo.png"> Test results report [Allure Report]()
### :pushpin: Overview page Allure-report



### :pushpin: Behavior page




### :pushpin: Graph Page

!



## <img width="4%" title="Telegram" src="images/Telegram_2019_Logo.svg.png"> Telegram Bot Notifications

> When build is completed,  the message with test result is sent by bot created in <code>Telegram</code> automatically 

<img title="Telegram Notifications" src="images/telegramnotify.png">



## <img width="4%" title="Telegram" src="images/selenoid-logo.png"> Example video from BrowserStack

Every test contains last screenshots, page source, browser console logs, video in attachments. One of this viedo can see below.
<p align="center">
<img title="Selenoid Video" src="images/videobrowserstack.gif">
</p>
