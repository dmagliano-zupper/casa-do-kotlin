package br.dev.magliano.casacodigokotlin.autor

data class AutorRequest(
    val nome: String,
    val email: String,
    val descricao: String
) {

    fun toEntity() = Autor(
        nome = this.nome,
        email = this.email,
        descricao = this.descricao
    )

}
