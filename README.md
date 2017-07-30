"# SeleniumFramework" 

Add exiting local project to Git Hub
https://help.github.com/articles/adding-an-existing-project-to-github-using-the-command-line/

After setting up Git Hub,how to add local changes to remote repository ?

1. Git status
2. Git add filename
3. Git commit -m "commit message"
4. Git push

How to run framework ?
1. Run UI journey with profile
mvn -Puser-journey

2. Run journey with tags
mvn -Dcucumber.options="--tags @user" -Puser-journey

mvn -Dcucumber.options="--tags @smoke" -Puser-journey


3. Run Shopping Cart Example
mvn test -Denv=PRODUCTION

Few Websites to Automate with best pratices.
https://www.ultimateqa.com/best-test-automation-websites-to-practice-using-selenium-webdriver/

Online Shopping Cart:
http://automationpractice.com/index.php

Monte-CC.jar

-add pom.xml wih property <headlessAwtWidgets>false</headlessAwtWidgets>

How to add external jar to your local project ?
run below command to add dependency to your local repository.

1. mvn install:install-file -Dfile=/Users/jpatel5/Downloads/monte-screen-recorder-0.7.7.jar -DgroupId=org.monte -DartifactId=monte-screen-recorder -Dversion=0.7.7  -Dpackaging=jar
<!-- https://mvnrepository.com/artifact/org.monte/screen-recorder -->
Add pom.xml
<dependency>
    <groupId>org.monte</groupId>
    <artifactId>screen-recorder</artifactId>
    <version>0.7.7</version>
</dependency>

2. Add it to your local project in to sub folder and update pom.xml .
 <dependency>
            <groupId>monte</groupId>
            <artifactId>monte-screen-recorder</artifactId>
            <version>0.7.7</version>
            <scope>system</scope>
            <systemPath>${project.basedir}/src/main/resources/monte/monte-screen-recorder-0.7.7.jar</systemPath>
        </dependency>

 3. Directly import in to dependency.


 JPA Database:
 http://www.java2s.com/Tutorial/Java/0355__JPA/SetTableNameForEntity.htm

 https://www.mkyong.com/spring-boot/spring-boot-spring-data-jpa-oracle-example/

