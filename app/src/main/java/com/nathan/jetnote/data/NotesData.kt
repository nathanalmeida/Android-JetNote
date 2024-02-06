package com.nathan.jetnote.data

import com.nathan.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "A good day", description = "We went on a vacation by the lake"),
            Note(title = "Android Compose", description = "Working on Android Compose course today"),
            Note(title = "Keep at it...", description = "Sometimes things just happen"),
            Note(title = "A movie day", description = "Watching a movie with my family today"),
            Note(title = "A movie day", description = "Watching a movie with my family today"),
            Note(title = "A movie day", description = "Watching a movie with my family today"),
            Note(title = "A movie day", description = "Watching a movie with my family today"),
            Note(title = "A movie day", description = "Watching a movie with my family today"),
            Note(title = "A movie day", description = "Watching a movie with my family today"),
            Note(title = "A movie day", description = "Watching a movie with my family today"),
        )
    }
}