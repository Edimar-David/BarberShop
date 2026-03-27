interface serviceData {
    barber: number
    name: string
    description: string
    price: number
    duration: number
};

export async function createServiceOffering(services: serviceData): Promise<string> {
    try{
        const response = await fetch("http://localhost:8080/services", {
            method: "POST",
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(services)
        });

        if(!response.ok){
            throw new Error(`Erro: ${response.status}`)
        };

        const data = await response.text();

        return data;

    }catch (error) {
        throw new Error(`Erro: ${error}`)
    }
}


