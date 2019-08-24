package com.example.fireapp;

public class Artist {
    private String userId;
    private String userName;
    private String Receiver;

    public Artist(){
        //this constructor is required
    }

    public Artist(String userId, String userName, String Receiver) {
        this.userId = userId;
        this.userName = userName;
        this.Receiver = Receiver;
    }

    public String getArtistId() {
        return userId;
    }

    public String getArtistName() {
        return userName;
    }

    public String getArtistGenre() {
        return Receiver;
    }
}
