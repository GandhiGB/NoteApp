package net.gbappsolution.noteapp.feature_note.presentation.notes

import net.gbappsolution.noteapp.feature_note.domain.model.Note
import net.gbappsolution.noteapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note):NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSelection: NotesEvent()
}