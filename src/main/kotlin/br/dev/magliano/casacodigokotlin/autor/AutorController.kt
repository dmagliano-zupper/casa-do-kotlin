package br.dev.magliano.casacodigokotlin.autor

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/autores")
class AutorController(private val autorRepository: AutorRepository) {

    @PostMapping()
    fun cadastroAutor(@RequestBody autorRequest: AutorRequest) {
        val novoAutor = autorRequest.toEntity()
        autorRepository.save(novoAutor)
    }

}