# NewProject2Framework
# Swag Labs
# Overview

In this Project we are going to do automation testing for SauceDemo website.In this we write scenarios in BDD format which is understood easily by non testing team members and is implemented by a test automation tool called Selenium.
To create this project we need to know what test automation is and how this project is created and executed in Intellij by Test Runner.
# Table of Contents:
1. What is Test Automation?
2. Pre-requisites
3. Cloning the Repository
4. Running the BDD scenarios

# What is Test Automation?
est automation is the process of using automation tools to maintain test data, execute tests, and analyze test results to improve software quality. Test automation is also known as automation testing or automated QA testing.
 # Why do we use Test Automation?

Automated Testing helps Developers and Testers.
Tests can run automatically whenever source code changes are checked in and notify the team or the developer if they fail. Features like these save developers time and increase their confidence.


# What is an automation tool?

Automation software is something that turns repetitive tasks into automated actions. 

# How do you automate a test plan?

7 Steps to Create an Effective Automation Test Plan

Analyzing Requirements and Identifying Test Scenarios.
Choosing the Right Automation Framework and Tools. 
Designing Test Data and Environment Setup. 
Defining Your Test Execution Strategy and Schedule. 
Figuring Out Your Metrics. 

# Pre-requisites:
1.Intellij
2.Maven
3.Cucumber
4.GIT

1. What is Intellij Idea and How to Install.

Intellij Idea is a type of development enviroment popularly used and designed to develop applications written in JVM based languages like Java,Ruby,Kotlin etc. JetBrains has developed this java IDE. It is supported on all operating systems like Windows, Mac, Linux.

 **Steps to install Intellij Idea:**

Community edition - Free and open source. Intellij Idea Ultimate edition - For commercial purposes.

Steps

1.Search intellij Idea on Google

2.Next, Go to https://www.jetbrains.com/idea/

3.Follow the Community Edition.



**Adding the following dependencies from Maven repository to POM.xml file:**

1.Junit

2.Selenium WebDriver

3.Cucumber

4.Cucumber Junit

Link to Maven repo - https://mvnrepository.com/

**Introduction to Cucumber.**

Cucumber is a tool that supports Behaviour-Driven Development(BDD). If you’re new to Behaviour-Driven Development read our BDD introduction first.

Cucumber reads executable specifications written in plain text and validates that the software does what those specifications say. The specifications consist of multiple examples, or scenarios.

Eg: Given
,When  ,
Then 

For Cucumber to understand the scenarios, they must follow some basic syntax rules, called Gherkin.

**What is Gherkin?**

Gherkin is a set of grammar rules that makes plain text structured enough for Cucumber to understand. The scenario above is written in Gherkin.

Gherkin documents are stored in. feature text files and are typically versioned in source control alongside the software. 

**What are Step Definitions?**

Step definitions connect Gherkin's steps to programming code. A step definition carries out the action that should be performed by the step.

Once all the dependencies are added on POM.XML file, we create a project by writing the BDD Scenarios using Gherkin Language which is understood easily by non-Programmers also.

**Based on the Scenarios we create:**

Step Definitions: Snippets generated when we run Scenarios.

Page Objects class: we write code for the objects located in base page.

Test Runner class: using cucumber options we set the file path and to store the output in Html we use tool called Pretty .

Constant Utils: the elements which are constant we write in this class so we can use it when needed.

# GIT and installing Git on Windows and Mac
Git has been designed with performance, security and flexibility in mind.
Install Git on Windows:

Git for Windows stand-alone installer

1. Download the latest Git for Windows installer.

2. When you've successfully started the installer, you should see the Git Setup wizard screen. Follow the Next and Finish prompts to complete the installation. The default options are sensible for most users.

3. Open a Command Prompt (or Git Bash if during installation you elected not to use Git from the Windows Command Prompt).

Git for Mac Installer

The easiest way to install Git on a Mac is via the stand-alone installer:

1. Download the latest Git for Mac installer.

2. Follow the prompts to install Git.

3. Open a terminal and verify the installation was successful by typing git --version:


# Instructions to Clone the GitHub Repository
To clone this repository, follow these steps:

Open your Git Bash by right clicking in Projects folder.

Run the following command to clone the repository:

git clone

Navigate to the cloned repository.
