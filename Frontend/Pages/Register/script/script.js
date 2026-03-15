import {registerUser} from "./request.js";

const form = document.getElementById("form")

form.addEventListener("submit", (e) => {
    e.preventDefault();

    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    registerUser(name, email, password);
    
})