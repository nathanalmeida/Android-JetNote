package com.nathan.jetnote.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.nathan.jetnote.data.NotesDataSource
import com.nathan.jetnote.model.Note

class NotesViewModel: ViewModel() {
    private var notesList = mutableStateListOf<Note>()

    init {
        notesList.addAll(NotesDataSource().loadNotes())
    }

    fun addNote(note: Note) {
        notesList.add(note)
    }

    fun removeNote(note: Note) {
        notesList.remove(note)
    }

    fun getNotes(): List<Note> {
        return notesList
    }
}