# Gerenciamento de Contatos

## Descrição do Projeto
O projeto implementa um sistema simplificado de gerenciamento de contatos, com a ferramente Java. Este permite adicionar, buscar, remover e listar contatos através de uma estrutura encadeada. Cada contato possui nome, número de telefone e endereço de e-mail.

## Pré-requisitos
Antes de começar, certifique-se de que você tem o seguinte software instalado:
- [Eclipse IDE](https://www.eclipse.org/downloads/) ou qualquer outro IDE de sua preferência.
- [Java JDK 8+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- (Opcional) Se houver persistência de dados: [MySQL](https://www.mysql.com/downloads/), [PostgreSQL](https://www.postgresql.org/download/), ou algum outro banco de dados relacional.

## Configuração do Ambiente

### 1. Instalação do Java
Caso ainda não possua o Java instalado na máquina, siga os passos abaixo:
- Baixe o [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) e siga as instruções de instalação.
Para verificar se o Java foi instalado corretamente, execute o seguinte comando no terminal ou prompt de comando:
  ```bash java -version```

## Softwares Disponíveis
Os softwares utilizados para a construção do sistema foram:
- Eclipse IDE 2024-03: Ambiente de desenvolvimento integrado (IDE) direcionado ao desenvolvimento de aplicações Java. Este software oferece uma interface gráfica amigável e diversas ferramentas de depuração e gerenciamento de projetos.
- JDK Development Kit 22.0.1: Software necessário para compilar e executar códigos Java, que inclui o compilador javac e a Java Virtual Machine (JVM), essenciais para rodar este projeto.

### Usando Eclipse IDE 2024-03
O Eclipse já está instalado e configurado nas máquinas virtuais, facilitando o desenvolvimento do projeto.
Para configurar e rodar o sistema de gerenciamento de contatos, siga as etapas abaixo:

  1. Abrir o Eclipse:
     - Inicie o Eclipse IDE 2024-03 a partir do menu ou da área de trabalho.

  2. Importar o Projeto:
     - Selecione File > Import > Existing Projects into Workspace.
     - Na janela de importação, escolha a pasta do projeto e clique em Finish.

  3. Compilar e Executar o Projeto:
     - Navegue até a classe ContactManager na visualização do Package Explorer.
     - Clique com o botão direito do mouse em ContactManager e selecione Run As > Java Application.
     - O projeto será compilado automaticamente, e o menu principal do sistema será exibido no console do Eclipse.

### Compilando via Linha de Comando (Opcional)
Se preferir compilar e executar o projeto via linha de comando usando o JDK 22.0.1, siga estas etapas:

  1. Abrir o Terminal:
     - Acesse o terminal ou prompt de comando na máquina virtual.

  2. Navegar até o Diretório do Projeto:
     - Use o comando cd para navegar até o diretório onde os arquivos .java estão localizados.
     ```bash cd /caminho/para/o/projeto```
