package com.iseepareidolia.androidflickrgag;

public class Post {
	// url to get all posts list
	private static String URL_ALL_POSTS = "http://futebolsa.org/pareidolia/get_all_posts.php";
		
	private int id; 
	private String title;
	private String faceUser; //facebook id of the user who inserted the post
	private String description; 
	private String createdAt; //datetime that the post was created
	//flickr variables
	private int flickrFarm;
	private String flickrId;
	private String flickrSecret;
	private int flickrServer;
	private int clicks; //counter-how many times the post was viewed
}
