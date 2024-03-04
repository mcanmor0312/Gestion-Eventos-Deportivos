# Gestion Eventos Deportivos

## Marcos Canto Moreno 1

## Sebastián Bohórquez Torres 2
## Pablo García Mangana 3

### **Descripcion del proyecto**
Crear un sistema de gestión de eventos deportivos que permita
almacenar y gestionar información sobre eventos, participantes y
resultados.

### Clases, Herencia e Interfaces
**Ganador**: Una interfaz básica que instancia un arraylist de tipo Participante.
**EventoDeportivo**: Es la clase abstracta y que implementa la interfaz de Ganador.
**Carrera**: Es una clase hija de EventoDeportivo y donde se encuentra un constructor e instanciación de la carrera. 
**Participante**: Contiene un constructor para crear participantes.
**Equipo**: Es una clase hija de la clase java Comparable para comparar puntos de equipos. 
**TorneoDeFutbol**: Clase hija de EventoDeportivo proporciona un método para obtener gnador.
**ParticipanteCarrera**: Clase hija de Participante que añade más datos al constructor.
**GestionEventosDeportivosUtils**: Es nuestra clase principal donde se encuentra el main


### Uso del Proyecto
Para ejecutar el proyecto:

1. Clonar el repositorio.
2. Compilar con intelliJ
3. Ejecutar.

### Licencia
Licencia Creative Commons CC0 1.0 DEED.