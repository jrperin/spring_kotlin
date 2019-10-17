package br.com.jrperin.estudo.repository

import br.com.jrperin.estudo.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository: CrudRepository<Note, Long> {

}