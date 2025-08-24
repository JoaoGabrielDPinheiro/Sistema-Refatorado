# Sistema-Refatorado
Sistema pós refatoração

```markdown
# Sistema de Monitoramento de Sala (Versão Refatorada com Padrões GOF)

Este projeto é uma versão evoluída do sistema de monitoramento, com aplicação dos padrões de projeto Strategy, Factory, Observer e Decorator. Ele simula sensores inteligentes em uma sala, com lógica extensível e modular.

## 📦 Estrutura de Pacotes

- `main`: ponto de entrada (`App.java`)
- `model`: classes de domínio (`Sala`, `Sensor`, `SensorTemperatura`, `SensorPresenca`, `SensorFactory`)
- `strategy`: lógica de acionamento (`AcionamentoStrategy`, `AcionamentoPresenca`)
- `observer`: observadores de sensores (`SensorObserver`, `Luz`)
- `decorator`: extensão de sensores (`SensorDecorator`)

## 🛠️ Requisitos

- Java 11 ou superior
- IDE compatível (IntelliJ, Eclipse, VS Code)
- Nenhuma dependência externa

## ▶️ Como Executar

1. Clone o repositório ou copie os arquivos para seu ambiente local.
2. Certifique-se de que a estrutura de pacotes está correta.
3. Compile todos os arquivos:
   ```bash
   javac main/App.java model/*.java strategy/*.java observer/*.java decorator/*.java