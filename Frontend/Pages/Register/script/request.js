export async function registerUser (name, email, password) {
    const dataUser = {
        nome: name,
        email: email,
        senha: password,
        rule: "client" 
    };

    try{
        const response = await fetch("https://localhost:8080/register", {
        method: 'POST',
        headers: 
            {'Content-Type': 'application/json'},
        body: JSON.stringify(dataUser)
    });
    }catch(error){
        console.log(error);
    }

    return response.json();    
}