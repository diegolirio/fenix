# Fenix
Project Fenix

### Técnologias Backend
  - SpringBoot
  - MongoDB
  - Java
  
### Técnologias Frontend
  - Angular
  - Node
  - Material-Designer

### Instalar MongoDB
- Windows: 
   - Baixe [mongodb](https://www.mongodb.org/dl/win32/x86_64-2008plus-ssl?_ga=1.135102456.861908304.1492025397) versão 3.0.14 ---> mongodb-win32-x86_64-2008plus-ssl-3.0.14.zip
	
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
 	
	
	