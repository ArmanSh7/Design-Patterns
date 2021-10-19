package com.company;

import com.company.momentoPattern.Editor;
import com.company.momentoPattern.History;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("First State");
        history.addEditorState(editor.createEditorState());
        editor.setContent("Second state");
        history.addEditorState(editor.createEditorState());
        editor.setContent("Third state");
        // undo third state
        editor.restore(history.UndoEditorHistory());
        System.out.println(editor.getContent());
    }
}
