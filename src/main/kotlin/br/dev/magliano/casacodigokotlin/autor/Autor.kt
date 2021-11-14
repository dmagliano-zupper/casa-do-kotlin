package br.dev.magliano.casacodigokotlin.autor

import javax.persistence.*

@Entity
class Autor(
    var nome: String,
    var email: String,
    @Column(length = 400)
    var descricao: String,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
) {

}
