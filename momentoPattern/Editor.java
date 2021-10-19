package com.company.momentoPattern;

/**
 * Momento pattern to restore previous states of
 * Editor
 * */
/**
 * Originator
 */
public class Editor {
    private String content;
    public String getContent() {
        System.out.print("The current state of editor is ");
        return content;
    }
    public void setContent(String content) {
         this.content = content;
    }

    public EditorState createEditorState() {
        return new EditorState(content);
    }
    public void restore(EditorState state) {
        this.content = state.getContent();
    }

}
