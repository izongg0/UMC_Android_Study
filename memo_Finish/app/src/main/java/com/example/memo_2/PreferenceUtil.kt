package com.example.memo_2

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

class PreferenceUtil(private val context: Context) {
    private val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
    private val favoritesKey = "favorites"

    fun addMemoToFavorites(memoId: String) {
        val favoritesSet = getFavoritesSet()
        favoritesSet.add(memoId)
        saveFavoritesSet(favoritesSet)
    }

    fun removeMemoFromFavorites(memoId: String) {
        val favoritesSet = getFavoritesSet()
        favoritesSet.remove(memoId)
        saveFavoritesSet(favoritesSet)
    }

    fun getFavoriteMemos(): Set<String> {
        return getFavoritesSet()
    }

    private fun getFavoritesSet(): MutableSet<String> {
        return sharedPreferences.getStringSet(favoritesKey, mutableSetOf()) ?: mutableSetOf()
    }

    private fun saveFavoritesSet(favoritesSet: MutableSet<String>) {
        sharedPreferences.edit().putStringSet(favoritesKey, favoritesSet).apply()
    }
}