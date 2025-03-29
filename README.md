# Calculadora de IMC
## Autor(a): Duda Lucena Miguel - RA: 24025889

## 📂 Atalhos para arquivos principais do projeto

- **Download do APK:**  [Clique para baixar o app-debug.apk](https://raw.githubusercontent.com/DudaLucenaMiguel/Calculadora_de_IMC/main/app-debug.apk)
- **Download do Projeto ZIP:**  [Clique para baixar o Calculadora_IMC.zip](https://raw.githubusercontent.com/DudaLucenaMiguel/Calculadora_de_IMC/main/Calculadora%20IMC.zip)
- **Códigos .java:**  [`/java/br/fecapccp/calculadoraimc`](https://github.com/DudaLucenaMiguel/Calculadora_de_IMC/tree/main/app/src/main/java/br/fecapccp/calculadoraimc)
- **Layouts .xml:**  [`/res/layout`](https://github.com/DudaLucenaMiguel/Calculadora_de_IMC/tree/main/app/src/main/res/layout)

## 📱 Descrição geral do projeto

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;O projeto **"Calculadora de IMC com Feedback Positivo"** consiste no desenvolvimento de um aplicativo Android, utilizando a linguagem **Java**, com o objetivo de calcular o Índice de Massa Corporal (IMC) do usuário a partir dos dados de peso e altura informados. A aplicação conta com **múltiplas telas (Activities)**, cada uma representando uma faixa de classificação do IMC, exibindo **mensagens motivacionais personalizadas**, juntamente com os valores inseridos, o resultado do cálculo e uma imagem correspondente.
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Além de reforçar os conceitos de **manipulação de dados**, **navegação entre telas via `Intent` e `Bundle`**, e uso de componentes como `PlainText`, `TextView`, `Button` e `ImageView`. O projeto segue uma identidade visual padronizada com uma **paleta de cores específica**. A proposta incentiva a criatividade.


### Prints das Telas
<div align="center">
 
| ![Tela Inicial](https://github.com/DudaLucenaMiguel/Calculadora_de_IMC/blob/main/Images/Print_Tela_MainActivity.png?raw=true) | ![Calcular IMC](https://github.com/DudaLucenaMiguel/Calculadora_de_IMC/blob/main/Images/Print_Tela_CalculoIMCActivity.png?raw=true) |
|:--:|:--:|
| **Tela Inicial** | **Calcular IMC** |

| ![Abaixo do Peso](https://github.com/DudaLucenaMiguel/Calculadora_de_IMC/blob/main/Images/Print_Tela_AbaixoDoPesoActivity.png?raw=true) | ![Peso Normal](https://github.com/DudaLucenaMiguel/Calculadora_de_IMC/blob/main/Images/Print_Tela_PesoNormalActivity.png?raw=true) |
|:--:|:--:|
| **Abaixo do Peso** | **Peso Normal** |

| ![Sobrepeso](https://github.com/DudaLucenaMiguel/Calculadora_de_IMC/blob/main/Images/Print_Tela_SobrepesoActivity.png?raw=true) | ![Obesidade I](https://github.com/DudaLucenaMiguel/Calculadora_de_IMC/blob/main/Images/Print_Tela_Obesidade1Activity.png?raw=true) |
|:--:|:--:|
| **Sobrepeso** | **Obesidade I** |

| ![Obesidade II](https://github.com/DudaLucenaMiguel/Calculadora_de_IMC/blob/main/Images/Print_Tela_Obesidade2Activity.png?raw=true) | ![Obesidade III](https://github.com/DudaLucenaMiguel/Calculadora_de_IMC/blob/main/Images/Print_Tela_Obesidade3Activity.png?raw=true) |
|:--:|:--:|
| **Obesidade II** | **Obesidade III** |

</div>

## 🔧 Descrição do Processo de Desenvolvimento 🚧

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;O processo de desenvolvimento do projeto teve início com a criação das **Activities** correspondentes a cada etapa do aplicativo. Em seguida, foram inseridos os elementos visuais (**Views**) em cada tela, nomeando-os de forma clara para facilitar a compreensão e a manutenção do código. Após isso, implementei as **mecânicas de navegação entre as telas**, que incluíram: instanciar variáveis, captar os valores inseridos pelo usuário, definir o comportamento dos botões, realizar o cálculo do IMC com o devido tratamento dos valores inseridos e aplicar as **estruturas condicionais** (`if`, `else if`) para direcionar a tela correta de acordo com o resultado. Também desenvolvi o uso de `Intent` em conjunto com `Bundle` para transmitir os dados entre as telas e implementei a lógica para **captar essas informações nas Activities de destino**. Além disso, tratei os ciclos de vida das telas, utilizando métodos como `onStart`, `onStop`, `onResume`, `onPause`, `onDestroy` e `onRestart` para garantir um comportamento estável do app. Com as funcionalidades prontas, organizei os textos e recursos no arquivo `appValues.xml` e, por fim, refinei os layouts dos arquivos `.xml` de cada tela, aplicando a paleta de cores proposta e ajustando os elementos para garantir um design **funcional e visualmente agradável**.

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Um dos principais desafios durante o desenvolvimento foi **criar um roteiro de construção do aplicativo que otimizasse o tempo e reduzisse retrabalho**. Para isso, foi necessário planejar previamente onde e em quais **Activities** determinadas mecânicas seriam repetidas. Esse planejamento também incluiu a definição de **padrões para os elementos visuais** (`Views`) nos arquivos XML, como botões, textos e campos de entrada, mantendo a consistência visual e funcional entre as telas. Essa organização prévia foi essencial para evitar redundâncias no código, facilitar a manutenção e garantir um fluxo de trabalho mais eficiente.







