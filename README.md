beertech.bancobeer.transfer


To run project, execute in root directory: docker-compose up

After that, go to http://localhost:15672, selecr Queues and after in conta-corrente. 



To send message to queue: 

Deposit example

{
    "tipo": "DEPOSITO",
    "hash": "-97171164",
    "valor": 75
}

Withdrawal example:

{
    "tipo": "SAQUE",
    "hash": "-97171164",
    "valor": 75
}



Transfer exaple:

{
    "hashOrigem": "-97171164",
    "hashDestino": "-688003323",
    "valor": 2
}
