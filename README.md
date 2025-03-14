# Demo SOAP Web Service

Este repositório contém um exemplo de serviço web SOAP. Siga as instruções abaixo para configurar e executar o serviço.

## Pré-requisitos

Certifique-se de ter os seguintes itens instalados em sua máquina:

- **Java JDK** (versão 8 ou superior)
- **Maven** (para gerenciamento de dependências)
- Um IDE como **Eclipse** ou **IntelliJ IDEA** (opcional)

## Passos para executar o serviço

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/seu-usuario/demo-soap-webservice.git
    cd demo-soap-webservice
    ```

2. **Compile o projeto**:
    Execute o comando abaixo para baixar as dependências e compilar o projeto:
    ```bash
    mvn clean install
    ```

3. **Execute o serviço**:
    Inicie o serviço SOAP com o seguinte comando:
    ```bash
    mvn spring-boot:run
    ```

4. **Acesse o WSDL**:
    Após iniciar o serviço, o WSDL estará disponível no seguinte endereço:
    ```
    http://localhost:8080/ws/demo.wsdl
    ```

## Testando o serviço

Você pode testar o serviço SOAP utilizando ferramentas como:

- **SOAP UI**: Importe o WSDL e envie requisições.
- **Postman**: Configure uma requisição SOAP manualmente.
- **Cliente SOAP customizado**: Crie um cliente SOAP em sua linguagem de preferência.

## Estrutura do projeto

- `src/main/java`: Contém o código-fonte do serviço.
- `src/main/resources`: Contém arquivos de configuração, como `application.properties`.

## Contribuição

Sinta-se à vontade para abrir issues ou enviar pull requests para melhorias.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

## Como executar uma requisição SOAP utilizando o Postman

Para testar este serviço SOAP usando o Postman, siga os passos abaixo:

1. **Abra o Postman**: Certifique-se de que o Postman está instalado e aberto em sua máquina.

2. **Crie uma nova requisição**:
   - Clique em "New" e selecione "Request".
   - Dê um nome à sua requisição e salve-a em uma coleção, se desejar.

3. **Configure o método e a URL**:
   - No campo de URL, insira o endpoint do serviço SOAP (por exemplo, `http://localhost:8080/seu-servico`).
   - Certifique-se de que o método HTTP está definido como `POST`.

4. **Adicione o cabeçalho SOAP**:
   - Vá até a aba "Headers".
   - Adicione o cabeçalho `Content-Type` com o valor `text/xml`.

5. **Insira o corpo da requisição SOAP**:
   - Vá até a aba "Body".
   - Selecione a opção "raw".
   - Insira o XML da requisição SOAP no corpo. Por exemplo:
     ```xml
     <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ex="http://example.com/">
         <soapenv:Header/>
         <soapenv:Body>
             <ex:YourOperation>
                 <ex:Parameter1>Value1</ex:Parameter1>
                 <ex:Parameter2>Value2</ex:Parameter2>
             </ex:YourOperation>
         </soapenv:Body>
     </soapenv:Envelope>
     ```

6. **Envie a requisição**:
   - Clique no botão "Send".
   - O Postman enviará a requisição para o endpoint especificado.

7. **Verifique a resposta**:
   - A resposta do serviço será exibida na parte inferior do Postman.
   - Se o serviço estiver configurado corretamente, você verá o XML de resposta retornado pelo servidor.

### Observações
- Certifique-se de que o serviço SOAP está em execução e acessível no endpoint especificado.
- Caso o serviço exija autenticação, configure-a na aba "Authorization" do Postman.
- Consulte a documentação do serviço para detalhes sobre os parâmetros e operações disponíveis.

Com esses passos, você poderá testar e validar o funcionamento do serviço SOAP diretamente no Postman.