package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private String authorName;
    private int postedBy;
    //Во намутили. И группы, и админы, и платникам и прочее прочее... половины не понятно.
    //Где и как это используется и зачем...
    private String dateTime;
    private String body;
    private boolean isLiked;
    private int likeCounter;
    private boolean isReposted;
    private int repostCounter;
    private int looksCounter;
    private String groupName;
    private int groupId;
    private boolean isSigned;
    private boolean isAdvertising;

    private boolean canDelete;



    // + getters/setters*
}
