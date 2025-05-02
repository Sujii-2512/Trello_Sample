# Trello-Like Mini Project (Java)

This is a milestone project that simulates a Trello-style social feed system in Java. It allows users to:

- Post tweets
- Follow and unfollow other users
- View a personalized news feed based on their own posts and those of people they follow

## Features

- **Post Tweet**: Users can post a tweet using their username.
- **Follow Users**: Users can follow others to see their tweets in their feed.
- **Unfollow Users**: Users can unfollow others to remove their tweets from their feed.
- **News Feed**: Returns the 10 most recent tweets from the user and people they follow.

## How It Works

- Users are represented by string usernames (e.g., "Alice", "Bob").
- Tweets are represented by an integer tweet ID.

Internally, the system uses:

- `Map<String, Set<String>> follows` – to store followers
- `List<Object[]> tweets` – to store tweets as [username, tweetId]

## Technologies Used

- Java 8+
- Object-Oriented Programming (OOP) Concepts
- GitHub for version control

## File Structure
Milestone/ ├── Trello.java # Main class with logic 
           ├── Main.java # Test/demo class to simulate interaction 
           └── README.md # Project documentation (this file)

## Sample Usage

```java
Trello trello = new Trello();
trello.postTweet("UserA", 101);
trello.postTweet("UserB", 102);
trello.follow("UserA", "Bob");

System.out.println(trello.getNewsFeed("UserA")); 

trello.unfollow("UserA", "UserB");
System.out.println(trello.getNewsFeed("UserA"));

**## Milestone Objectives**
- Understand Java collections like Map and List  
- Apply OOP principles in real-world simulation  
- Use GitHub for collaborative coding  
- Build a functional mini-app with tweet and follow logic  
