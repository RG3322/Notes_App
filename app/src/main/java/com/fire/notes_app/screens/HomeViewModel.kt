package com.fire.notes_app.screens

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class HomeViewModel : ViewModel()
{







    private val _notes = ArrayList<NoteModel>()
    val notes =_notes.toList()



    fun listItemOnClick(id : Int){
        Log.d(TAG,"listItemOnClick: ")
    }

    fun addNewNote(){
        Log.d(TAG,"addNewNote: ")
    }







}