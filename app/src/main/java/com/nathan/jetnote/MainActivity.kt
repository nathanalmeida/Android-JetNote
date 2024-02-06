package com.nathan.jetnote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.nathan.jetnote.screen.NotesViewModel
import com.nathan.jetnote.screen.NotesScreen
import com.nathan.jetnote.ui.theme.JetNoteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetNoteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val notesViewModel: NotesViewModel by viewModels()
                    NotesApp(notesViewModel)

                }
            }
        }
    }
}

@Composable
fun NotesApp(notesViewModel: NotesViewModel) {
    val notesList = notesViewModel.getNotes()
    NotesScreen(notes = notesList,
        onAddNote = notesViewModel::addNote,
        onRemoveNote = notesViewModel::removeNote
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetNoteTheme {

    }
}