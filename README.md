## Exercício Prático: Aplicação do Factory Method em Java

Este exercício prático tem como objetivo ajudá-lo a compreender e aplicar o padrão Factory Method em Java, construindo uma estrutura básica de fábrica de veículos.

### Instruções

1. Crie uma interface chamada `Vehicle` que declare um método `void start()`.

2. Implemente três classes: `Car`, `Motorcycle` e `Truck`, todas implementando a interface `Vehicle`. Cada uma das classes deve ter um método `start()` que exiba uma mensagem indicando que o veículo está iniciando.

3. Crie uma interface chamada `VehicleFactory` com um método `Vehicle createVehicle()`.

4. Implemente três classes que implementam a interface `VehicleFactory`: `CarFactory`, `MotorcycleFactory` e `TruckFactory`. Cada uma dessas classes deve ter um método `createVehicle()` que retorna uma instância do respectivo tipo de veículo (`Car`, `Motorcycle` ou `Truck`).

5. Crie uma classe `Main` com o método `main` para testar o padrão Factory Method. No método `main`, crie instâncias de cada fábrica (`CarFactory`, `MotorcycleFactory` e `TruckFactory`) e use o método `createVehicle()` para criar instâncias de diferentes tipos de veículos. Em seguida, chame o método `start()` em cada veículo para exibir a mensagem de início correspondente.

### Observações

- Certifique-se de que os veículos criados pelas fábricas correspondam aos tipos corretos (carro, moto, caminhão) e exibam as mensagens de início apropriadas.

- Utilize o padrão Factory Method para criar os objetos de veículo, permitindo uma extensibilidade fácil no futuro para adicionar novos tipos de veículos e fábricas.

### Entrega

Envie o código-fonte completo da sua implementação, incluindo as classes `Vehicle`, `Car`, `Motorcycle`, `Truck`, `VehicleFactory`, `CarFactory`, `MotorcycleFactory`, `TruckFactory` e `Main`.

### Dica

Ao criar as classes e métodos, mantenha o foco na separação das responsabilidades entre as classes e na utilização do Factory Method para criar objetos de diferentes tipos, conforme solicitado pelo enunciado. Isso permitirá um código mais modular e flexível para lidar com diferentes tipos de veículos e futuras expansões.
