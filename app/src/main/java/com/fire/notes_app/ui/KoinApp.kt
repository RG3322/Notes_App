package com.fire.notes_app.ui

import android.app.Application
import androidx.room.Room
import com.fire.notes_app.database.NoteDatabase
import com.fire.notes_app.repositories.NoteRepo
import com.fire.notes_app.repositories.NoteRepoImpl
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.bind
import org.koin.dsl.module

class KoinApp: Application()  {
    override fun onCreate(){
        super.onCreate()
        startKoin{
            modules(module {
                single {
                    Room
                        .databaseBuilder(this@KoinApp, NoteDatabase::class.java,"notes.db")
                        .build()
                }
                single {
                    NoteRepoImpl(database = get())
                } bind NoteRepo::class })
            }
        }



}