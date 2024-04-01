# DESAFÍO TÉCNICO ACCENTURE - APP MOBILE SWAGS LABS

_Automatización de las funcionalidades de login y de compra de productos en el app swags labs_

## Comenzando 🚀

_El repositorio del proyecto se encuentra alojado en github. Puedes tener acceso a este respositorio desde el link:_
https://github.com/joseramosr/swagsLabs

### Pre-requisitos 📋

_Software necesario:_

```
1.Gradle
2.Java(JDK)
3.Android SDK(Android Studio)
4.Appium Destop
5.IDE de preferencia con plugin Cucumber for java instalado(Recomendado IntelliJ IDEA)
6. Appium inspector
7. Kobiton
```

## Ejecutando las pruebas ⚙️

_Las pruebas se podrán ejecutar de la siguiente forma:_


**En tu máquina local:** _Para esto es necesario tener instalado el software descrito en la sección de Pre-requisitos.
Una vez instalados debes ejecutar el servidor de appium y el Emulador de Android Studio donde ejecutarás los test; Recuerda
asignar la configuración necesaria de los capabilities en el archivo serenity.properties. Luego puedes ejecutar los tests
desde tu IDE con el runner respectivo o ubicándote en la raíz del proyecto y en un CMD ejecutar el comando:
"gradle clean test -i"._

**En Kobiton:** _Para esto es necesario tener instalado el software descrito en la sección de Pre-requisitos.
Una vez instalados debes ejecutar el servidor de appium. Para dispositivos Ios se ejecutaran las pruebas en Kobiton, para esto recuerda utilizar el arcvhivo .properties adecuado. Luego puedes ejecutar los tests desde tu IDE con el runner respectivo o ubicándote en la raíz del proyecto y en un CMD ejecutar el comando:
"gradle clean test -i"._

### Causas de error en la ejecución de las pruebas ⚙

_Estas pruebas podrían fallar al haber cambios en las pantallas del app probada_

### Analice las pruebas end-to-end 🔩

_Estas pruebas realizan el happy path para la funcionalidad de login y para la funcionalidad de compra de productos.

## Construido con 🛠️

_Este proyecto fue construidos con las siguientes herramientas:_

* **Java** - Lenguaje de programación.
* **Gradle** - Herramienta para la compilación del código y la gestión de dependencias.
* **Screenplay** - Patrón de diseño.
* **SerenityBDD(Java)** - Framework para la construcción de pruebas automatizadas en java.
* **Cucumber** - Herramienta utilizada para implementar BDD y escribir nuestros escenarios en lenguaje Gherkin.
* **Appium** - Framework de automatización de pruebas para aplicaciones nativas, móviles e híbridas tanto para iOS y
Android utilizando el protocolo WebDriver.
* **Appium Inspector** - Inspector de GUI para aplicaciones móviles, impulsado por un servidor Appium.
* **Kobiton** - Plataforma para el testeo de aplicaciones móviles. 

## Versionado 📌

Se usó [Git](https://git-scm.com/) como herramienta para el versionado del código.

## Autor ✒️

* **José Julián Ramos** - *Creador*

---
⌨️ con ❤️ por José Julián 😊
