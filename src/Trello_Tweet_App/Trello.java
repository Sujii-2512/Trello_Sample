package Trello_Tweet_App;

import java.util.*;

public class Trello {

    // Map to store which users follow whom (usernames as Strings)
    private Map<String, Set<String>> follows;

    // List to store tweets with [userName, tweetId]
    private List<Object[]> tweets;

    public Trello() {
        follows = new HashMap<>();
        tweets = new ArrayList<>();
    }

    // Method to post a new tweet (username as String, tweetId as int)
    public void postTweet(String username, int tweetId) {
        tweets.add(new Object[]{username, tweetId});
    }

    // Method to get the 10 most recent tweets from user or followed users
    public List<Integer> getNewsFeed(String username) {
        List<Integer> feed = new ArrayList<>();

        Set<String> following = follows.getOrDefault(username, new HashSet<>());

        for (int i = tweets.size() - 1; i >= 0 && feed.size() < 10; i--) {
            Object[] tweet = tweets.get(i);
            String tUser = (String) tweet[0];
            int tId = (int) tweet[1];

            if (tUser.equals(username) || following.contains(tUser)) {
                feed.add(tId);
            }
        }

        return feed;
    }

    // Method to follow another user
    public void follow(String followerId, String followeeId) {
        if (followerId.equals(followeeId)) return;
        follows.putIfAbsent(followerId, new HashSet<>());
        follows.get(followerId).add(followeeId);
    }

    // Method to unfollow another user
    public void unfollow(String followerId, String followeeId) {
        if (follows.containsKey(followerId)) {
            follows.get(followerId).remove(followeeId);
        }
    }
}
