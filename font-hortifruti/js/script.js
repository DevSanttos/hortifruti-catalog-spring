document.getElementById("login-form").addEventListener("submit", async function(event) {
    event.preventDefault();

    const login = document.getElementById("login").value;
    const password = document.getElementById("senha").value;

    if (!login || !password) {
        alert("Por favor, preencha todos os campos.");
        return;
    }

    try {
        const response = await fetch("http://localhost:8080/admin/gest-hortifruti/auth", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({ login: login, password: password })
        });

        if (!response.ok) {
            throw new Error("Erro ao realizar login");  
        }
        
        const data = await response.text();

        alert(data);
        console.log("Login realizado com sucesso:", data);
        window.location.href = "dashboard.html";

    } catch (error) {
        alert(error);
        console.error("Erro ao realizar login:", error);
    }
});
