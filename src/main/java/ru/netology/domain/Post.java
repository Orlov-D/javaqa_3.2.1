package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String postType;
    private int signedId;
    private boolean canPin;
    private boolean canEdit;
    private boolean canDelete;
    private boolean isPinned;
    private boolean markAsAds;
    private boolean isFavorite;
    private int postponedId;

    private Comment comment;
    private Copyright copyright;
    private Donut donut;
    private Geo geo;
    private Like like;
    private Repost repost;
    private Viev viev;

    // + getters/setters*
}
