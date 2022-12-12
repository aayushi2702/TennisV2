# TennisV2
Tennis Game

The scoring system is rather simple:

1. Each player can have either of these points in one game 0 15 30 40

2. If you have 40 and you win the ball you win the game, however there are special rules.

3. If both have 40 the players are deuce. 

    a. If the game is in deuce, the winner of a ball will have advantage and game ball. 

    b. If the player with advantage wins the ball he wins the game 

    c. If the player without advantage wins they are back at deuce.

1. A game is won by the first player to have won at least four points in total and at least two points more than the opponent.

2. The running score of each game is described in a manner peculiar to tennis: scores from zero to three points are described as “love”, “fifteen”, “thirty”, and “forty” respectively.

3. If at least three points have been scored by each player, and the scores are equal, the score is “deuce”.

4. If at least three points have been scored by each side and a player has one more point than his opponent, the score of the game is “advantage” for the player in the lead.

## **Purpose**
Develop a simple Tennis game written in Java and Spring Boot using Test Driven Development (TDD) process.

## **Prerequisites**
- Java 
- Spring Boot 2.7.5
- Maven
- IDE : Spring Tool Suite

## **How to build the application**
1. Clone this repository ```https://github.com/aayushi2702/TennisV2.git```
2. You can build the project and run the tests by running ```maven clean build```

## **How to run the application**
- By default, the application will start on port 8080. If you want the application to run on different port 8081, you can pass additional parameter --server.port=8081 while starting the application
- Once successfully built, you can run the service by using one of below commands:

```
  java -jar build/libs/TennisV2.jar
                    or 
                    
  java -jar build/libs/TennisV2.jar --server.port=8081
```
