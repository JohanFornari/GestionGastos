$(document).ready(function () {

});

async function loginUsuario() {

    let datos = {};

    datos.email = document.getElementById('id_email').value;
    datos.password = document.getElementById('id_password').value;

    const request = await fetch('login', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });

    const response = await request.text();

    if(response == "OK"){
        window.location.href = 'tables.html';
    }else{
        alert('Usuario o contraseña incorrectos.')
    }
    
}
