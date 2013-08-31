package com.iseepareidolia.androidflickrgag;

public class Post {
	int id; 
	String title;
	String faceUser; //facebook id of the user who inserted the post
	String description; 
	String createdAt; //datetime that the post was created
	//flickr variables
	int flickrFarm;
	String flickrId;
	String flickrSecret;
	int flickrServer;
	int clicks; //counter-how many times the post was viewed
}
