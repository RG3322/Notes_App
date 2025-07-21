package com.fire.notes_app.repositories

import com.fire.notes_app.database.NoteEntity
import kotlinx.coroutines.flow.Flow

interface NoteRepo {
    fun getNotes(): Flow<List<NoteEntity>>
    suspend fun addNote(note: NoteEntity)
    suspend fun deleteNote(note: NoteEntity)

}