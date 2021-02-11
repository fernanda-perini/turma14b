function autenticar(event) {
    event.preventDefault(); // interrompe o envio do formulário que é feito por padrão

    let usuario = document.getElementById("txtUser").value; //pegar o valor que esta dentro do campo
    let senha = document.getElementById("txtSenha").value;

    let objUsuario = {
        email: usuario,
        racf: usuario,
        senha: senha
    }

    let msg = {
        method: 'POST',
        body: JSON.stringify(objUsuario), //transforma um objeto javascript em um texto json
        headers: {
            'Content-type': 'application/json'
        }
    }

    fetch("http://localhost:8080/usuario/login", msg)
        .then(res => tratarResposta(res));
}

function tratarResposta(retorno) {
    if (retorno.status == 200) {
        retorno.json().then(dados => fazerLogin(dados));
    } else {
        document.getElementById('msgError').innerHTML = 'Usuário ou senha inválido';
    }
}

function fazerLogin(usuario) {
    localStorage.setItem("userLogged", JSON.stringify(usuario));
    window.location = "dashmenu.html";
}

