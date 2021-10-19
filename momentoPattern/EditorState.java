package com.company.momentoPattern;

/**
 * Momento class. This edirtor class represents the
 * editor state
 */
public class EditorState {
    private final String content;

    public EditorState(String content){
        this.content = content;
    }
    public String getContent() {
        return content;
    }

}
