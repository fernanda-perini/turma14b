function buscarCliente() {
    let id = document.getElementById("idcliente").value; // buscado o valor que foi preenchido no componente

    const url = "http://localhost:8080/cliente/id/" + id;

    fetch(url)
        .then( retorno => tratarRetorno(retorno) ); // espera o retorno do fetch para continuar...

}

/*

function name(param) {
    console.log(param);
}

equivale à:

param => console.log(param);

*/

function tratarRetorno(ret) {
    if(ret.status == 200) {
        ret.json().then( cliente => exibirDados(cliente) );
    }else{
        document.getElementById("dados").innerHTML = "Cliente não encontrado.";
    }
}

function exibirDados(dados) {
    let tela = `<b>ID:</b> ${dados.id} <b>NOME:</b> ${dados.nome} <b>CPF:</b> ${dados.cpf}`;

    document.getElementById("dados").innerHTML = tela;
}

function listarTodos() {
    const url = "http://localhost:8080/cliente/all";

    fetch(url)
        .then( retorno => tratarRetornoTodos(retorno) ); 
}

function tratarRetornoTodos(dados) {
    // assumindo que o retorno é sempre status 200
    dados.json().then( clientes => exibirLista(clientes) );
}

function exibirLista(lista) {
    let tabela = '<table> <tr> <th>ID</th> <th>Nome</th> <th>CPF</th> </tr>';

    for (let i = 0; i < lista.length; i++) {
        tabela = tabela + `<tr> <td>${lista[i].id}</td> <td>${lista[i].nome}</td> <td>${lista[i].cpf}</td> </tr>`
    }

    tabela += '</table>';

    document.getElementById("lista").innerHTML = tabela;
}