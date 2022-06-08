# ClipboardHealth_Assessment

This project is for Web automation of amazon.in application.

My framework is Cucumber BDD POM design pattern framework with Java. Maven is used as build dependency tool for auto update of Selenium version.

Selenium Webdriver (3.141.59) is used to automate my browsers.

I used POM Desing Pattern in order to keep my code organized and clean.

I have separate classes where I keep my implemented step definitions. Also, for each scenario(positive or negative) I created CUCUMBER FEATURE FILES where I used GHERKIN

language in order to describe my test scenarios, by doing that I'm making sure that my test cases are understandable for each member of my team, even for 

those who aren't technically strong.

Another separate package for my UTILITIES where I would store all my drivers, page files or utilities that I could possibly run.

Reporting is done in cucumber with Cucumber HTML Report and Jenkins.

My framework uses Selenium WebDriver for browser automation, and JUnit for starting my tests and for assertions.

 I have HOOK class that implements my codes which run before and after all my tests this is where I invoke my TakeScreenShot for each failure. 
 
 My framework supports Data-Driven testing using Apache POI, Scenario Outline, Excel and .csv files.
