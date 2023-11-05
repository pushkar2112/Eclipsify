package com.example.eclipsify.myths


import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.example.eclipsify.Pages
import com.example.eclipsify.myths.models.Quote
import com.google.gson.Gson

object DataManager {


    var data= emptyArray<Quote>()
    var currentPage= mutableStateOf(Pages.LISTING)
    var currentQuote: Quote?=null
    var isDataLoaded= mutableStateOf(false)

    fun loadAssetFromFile(context: Context){
        val inputStream=context.assets.open("quotes.json")
        val size:Int=inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json= String(buffer , Charsets.UTF_8)
        val gson= Gson()
        data=gson.fromJson(json,Array<Quote>::class.java)
        isDataLoaded.value= true

    }


    }
