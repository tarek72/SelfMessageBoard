package com.example.hassanmoura.test1;

/**
 * Created by hassanmoura on 4/21/18.
 */

public class Message {
    private String name;
    private String content;
    private long timestamp;;

    public Message(String name, String content, long timestamp) {
        this.name = name;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
