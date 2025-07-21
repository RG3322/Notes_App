package com.fire.notes_app.repositories

import com.fire.notes_app.database.NoteDatabase
import com.fire.notes_app.database.NoteEntity
import kotlinx.coroutines.flow.Flow

class NoteRepoImpl(private val database: NoteDatabase): NoteRepo {
    private val dao = database.noteDao()

    override fun getNotes(): Flow<List<NoteEntity>> =
         dao.getNotes()


    override suspend fun addNote(note: NoteEntity) =
        dao.addNote(note)


    override suspend fun deleteNote(note: NoteEntity) =
        dao.deleteNote(note)

}