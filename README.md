# Gestión de Clientes con Historial de Visitas en ObjectDB

Este proyecto es una aplicación de consola en Java enfocada en la gestión de clientes, desarrollada para el módulo de **Acceso a Datos (AD)** del ciclo formativo **DAM (Desarrollo de Aplicaciones Multiplataforma)** en CESUR Andalucía. [cite_start]Su característica principal es la capacidad de almacenar un historial de fechas de visitas para cada cliente, utilizando ObjectDB como base de datos orientada a objetos.

## Sobre el Proyecto

El objetivo de esta aplicación es simular un sistema para que el departamento de ventas registre y consulte las visitas realizadas a los clientes. [cite_start]Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre la entidad `Cliente`, y destaca por la capacidad de añadir y gestionar un *array* o lista de fechas de visitas para cada cliente. [cite_start]La interfaz es a través de la consola, lo que facilita la interacción directa con la base de datos ObjectDB.

## Características

* [cite_start]**Gestión de Clientes:** Permite registrar, consultar, actualizar y eliminar clientes. 
* [cite_start]**Historial de Visitas:** Cada cliente puede tener asociado un historial de fechas de visitas. 
* [cite_start]**Base de Datos Orientada a Objetos:** Utiliza ObjectDB, lo que simplifica el mapeo de objetos Java directamente a la base de datos sin necesidad de ORMs complejos.
* [cite_start]**Aplicación de Consola:** Interacción con el usuario mediante comandos en la consola.

## Tecnologías Utilizadas

* [cite_start]**Java:** Lenguaje de programación principal. 
* [cite_start]**Maven:** Herramienta de gestión de proyectos y dependencias. 
* [cite_start]**ObjectDB:** Base de datos orientada a objetos. 
* [cite_start]**JUnit:** Utilizado para pruebas unitarias.
* [cite_start]**IntelliJ IDEA:** Entorno de Desarrollo Integrado (IDE) utilizado para el desarrollo. 

## Instalación y Uso

Sigue estos pasos para configurar y ejecutar el proyecto localmente:

### 1. Configuración de ObjectDB

* [cite_start]**Descarga de la librería:** Descarga el archivo `objectdb.jar` desde el sitio oficial de ObjectDB. 
* [cite_start]**Añadir al Classpath:** Agrega `objectdb.jar` como librería a tu proyecto en IntelliJ IDEA (o tu IDE preferido). 
* [cite_start]**Archivo de configuración:** Crea un archivo `objectdb.conf` en la raíz de tu proyecto con la siguiente estructura, especificando la ruta de tu base de datos (ej. `db/ClientesDB.odb`): 

    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <objectdb>
        <database>
            <path>db/ClientesDB.odb</path>
        </database>
    </objectdb>
    ```

### 2. Configuración del Proyecto Maven en IntelliJ IDEA

1.  Clona este repositorio.
2.  Abre el proyecto en IntelliJ IDEA. [cite_start]El IDE debería reconocer y descargar las dependencias de Maven. 
3.  [cite_start]Verifica la configuración en el `pom.xml` para asegurar que las dependencias de ObjectDB y JUnit estén correctamente definidas. 

### 3. Estructura de Clases Clave

El proyecto está organizado en las siguientes clases principales:

* **`Cliente.java`**: Modela la entidad `Cliente` con atributos como `id`, `nombre`, `apellidos`, `comercialPrincipal`, `idEmpresa`, y un `List<String>` para `visitas`. [cite_start]Las anotaciones JPA se usan para el mapeo a ObjectDB. 
* [cite_start]**`ConexionDB.java`**: Se encarga de establecer y gestionar la conexión con la base de datos ObjectDB. 
* [cite_start]**`ClienteDAO.java`**: Contiene los métodos para realizar las operaciones CRUD (Agregar, Buscar, Actualizar, Eliminar) sobre la entidad `Cliente`. 
* [cite_start]**`InterfazUsuario.java`**: Maneja la entrada y salida de datos a través de la consola, facilitando la interacción con el usuario. 
* [cite_start]**`App.java`**: La clase principal que coordina el flujo de la aplicación, interactuando con el usuario y utilizando el `ClienteDAO` para las operaciones de base de datos. 

### 4. Ejecución de la Aplicación

1.  Navega a la clase principal: `com.empresa.gestionclientes.App` (o la ruta correspondiente).
2.  [cite_start]Ejecuta el método `main`. 

[cite_start]La aplicación se ejecutará en la consola y te permitirá interactuar con la gestión de clientes, incluyendo la adición de visitas a cada cliente. 

## Aprendizajes Clave

Este ejercicio ha sido fundamental para:

* [cite_start]**Desarrollo de aplicaciones Java con bases de datos orientadas a objetos:** Familiarización con ObjectDB y su integración con Java. 
* [cite_start]**Implementación de operaciones CRUD:** Refuerzo de las habilidades para gestionar datos (crear, leer, actualizar, eliminar). 
* [cite_start]**Manejo de colecciones de datos complejos:** Almacenamiento de un array de fechas dentro de una entidad. 
* [cite_start]**Gestión de dependencias con Maven:** Uso efectivo de Maven para la configuración del proyecto y las librerías. 
* [cite_start]**Estructura modular del código:** Organización del proyecto en capas (`ConexionDB`, `ClienteDAO`, `InterfazUsuario`, `App`) para una mayor mantenibilidad. 

Este proyecto demuestra una comprensión sólida de la persistencia de datos en entornos orientados a objetos y la implementación de funcionalidades empresariales básicas.
