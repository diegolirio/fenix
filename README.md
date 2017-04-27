# Fenix
[Project Fenix](http://fenix-diegolirio.rhcloud.com/fenix/)

### Técnologias Backend
  - SpringBoot
  - MongoDB
  - Java
  
### Técnologias Frontend
  - Angular
  - Node
  - Material-Designer

## Instalar MongoDB
- Windows: 
   - Baixe [mongodb](https://www.mongodb.org/dl/win32/x86_64-2008plus-ssl?_ga=1.135102456.861908304.1492025397) versão 3.4.2 ---> [mongodb-win32-x86_64-2008plus-ssl-3.4.2.zip](http://downloads.mongodb.org/win32/mongodb-win32-x86_64-2008plus-ssl-3.4.2.zip?_ga=1.133528071.861908304.1492025397)   
   
	
   - Descompact e adicione o %MONGO_HOME%/bin na variavel de ambiente PATH 	
   - No terminal rode o serviço mongodb   
   ```
	$ mongod
   ```
   - Abra um novo terminal e Crie o banco no mongoDB   
   ```   
   $ mongo   
   $ use fenix
   ```
   - ver dados cadastrados      
   ```
   db.oficina.find();   
   db.usuario.find();   
   ```   
   [Mais comandos:](https://gist.github.com/diegolirio/d1dbf4fcd780da38812b2fc2e9e0a413) 	
	
- Linux/Ubuntu:
  ```   
   apt-get install mondodb
  ```
 	
### Habilitar controller de acesso no MongoDB

- Iniciar serviço Mongo sem o controle de acesso
```sh
mongod --port 27017 
```

- Conectar ao Mongo
```
mongo --port 27017
```

- Criar usuario 
```
use fenix
db.removeUser(fenix)
db.createUser({ user: "fenix", pwd: "fenix", roles: [ { role: "readWrite", db: "fenix" } ] })
```

- Reinicie serviço Mongo com o controle de acesso
```sh
mongod --port 27017 --auth 
```

- Autenticar como usuario fenix
```sh
mongo --port 27017 -u "fenix" -p "fenix" --authenticationDatabase "fenix"
```

[Documentação MongoDB](https://docs.mongodb.com/v3.0/tutorial/enable-authentication/)

 	
	
	