package Trello_Tweet_App;

public class Main {
    public static void main(String[] args) {
        Trello trello = new Trello();

        trello.postTweet("UserA", 12001);
        trello.postTweet("UserB", 12002);
        trello.follow("UserA", "UserB");

        System.out.println("UserA feed: " + trello.getNewsFeed("UserA"));

        trello.unfollow("UserA", "UserB");
        System.out.println("UserA feed after unfollowing: " + trello.getNewsFeed("UserA"));
    }
}

