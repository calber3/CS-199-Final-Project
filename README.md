CS199-Final-Project

I had to create a new project because I created the project with IntelliJ instead of Android Studio.

Creating a YouTube player in an Android app using a Youtube API that implements Kotlin. 
This will allow the ability to sort uploaded videos in unique manners such as by upload date or by likes or dislikes. 
This will also be able to play videos through the app.

Checkpoint 2:

So far in my project I have added the Youtube Player to the UI and am almost done getting it to run. I am running into an inflation error with the XML for the UI that says that it cannot inflate the class that I am using (YoutubePlayerView). I believe that his is because the API is based on Java. I finished creating the initializer for the player. The steps that I want to take from here are to fix the XML file so the app can run again then add a text box so the user can put any Youtube link in to play the video. Currently I have the link set to one of Geoff's lectures but I want to be able to watch any video. I am going to do this by taking the video id from the end of the link and use the API to find the video and in turn play it. I am going to try to find a way to sort through videos by video metrics by using the API but I am not sure how I would display that using what I have. 

master and alternate use the same library/plugin but are formatted in different ways. Third Party is a third party option of a youtube player in the app and does not require the plugin.
