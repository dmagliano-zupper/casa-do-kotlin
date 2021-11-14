package br.dev.magliano.casacodigokotlin.autor

import org.springframework.data.repository.CrudRepository

interface AutorRepository : CrudRepository<Autor, Long> {
}