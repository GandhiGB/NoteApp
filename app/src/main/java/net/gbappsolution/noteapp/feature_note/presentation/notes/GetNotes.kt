package net.gbappsolution.noteapp.feature_note.presentation.notes

import kotlinx.coroutines.flow.Flow
import net.gbappsolution.noteapp.feature_note.domain.model.Note
import net.gbappsolution.noteapp.feature_note.domain.repository.NoteRepository

class GetNotes(
    private val repository: NoteRepository
) {
    operator fun invoke(): Flow<List<Note>>{

    }
}