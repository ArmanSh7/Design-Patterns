package com.company.momentoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker
 */
public class History {

    private List<EditorState> EditorHistoryState= new ArrayList<>();

//    public String restore() {
//        EditorState temp = EditorHistory.pop();
//        return temp.getContent();
//    }

    /**
     * adding the editore state to history
     * @param state
     */
    public void addEditorState(EditorState state) {
        EditorHistoryState.add(state);
    }
    public EditorState UndoEditorHistory() {
        EditorState editorPrevState = EditorHistoryState.get(EditorHistoryState.size()-1);
        EditorHistoryState.remove(EditorHistoryState.size()-1);
        return editorPrevState;
    }

}
