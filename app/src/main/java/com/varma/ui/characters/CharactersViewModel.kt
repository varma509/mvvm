package com.varma.ui.characters

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.varma.data.repository.CharacterRepository

class CharactersViewModel @ViewModelInject constructor(
    private val repository: CharacterRepository
) : ViewModel() {

    val characters = repository.getCharacters()
}
