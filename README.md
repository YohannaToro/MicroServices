
# Amazon Gateway y Lambda
1.  Usando Amazon Gateway y lambda crear un servicio que reciba un parámetro numérico y retorne el cuadrado del número.
![enter image description here](https://lh3.googleusercontent.com/VaQRN7-PPaXTKkG0o9CdXedU1sCeLGy4vXQtSnO3m-ywagyRnP43ro3EoJfzEzldaTeTDVxigPs)

![enter image description here](https://lh3.googleusercontent.com/5sJheRji8Kk8B0aFyRL01sQ72lQAds-IdtEu1g69QwckFnfxF2cExu7KShG9xUqsyRuAprJe-x0)
2.  Crear una máquina virtual Linux en AWS
![enter image description here](https://lh3.googleusercontent.com/bOZzcH3Tr_LojrZwXTRZbIV2jQEQjkeWRSqFNUPRDTAahLgbWOMX3VQgDe5Coe2ZFERduQ3_P1U)
3.  Crear una aplicación WEB, usando Spark, Que tenga un formulario que le pida al usuario un número y le regrese el cuadrado del mismo. Esta se debe desplegar en AWS. **OJO: La aplicación Web debe usar el servicio de de Amazon GateWay para calcular el valor. **Configure la aplicación dentro de un grupo de autoescalabilidad.****

![enter image description here](https://lh3.googleusercontent.com/2ncY0YbdkX1vJmPbVAuS1StvAEIt8pzXsIsHUP8JX-zv7rE1VlrUQRY5m23fvIZCUKhx_5YmFeQ)

![enter image description here](https://lh3.googleusercontent.com/e12pYnC9hPV8tnE5kxsmYTxtA41MiWbJMuD_9VJvJYSkSspWYK9t-P6sBvzTCsZKykVcyFCA_mI)
4.  Probar la aplicación WEB.
![enter image description here](https://lh3.googleusercontent.com/Oqc1OamUou8kxP8Gla20GtGLO5QQzqPV6_Au6lwgOpK7xl95YUxrUeBOHuKP0O_D3-PkxXc8vZM)

	![enter image description here](https://lh3.googleusercontent.com/fpyhX8oQvzBXAgCsdEVGf6R2G3N3o5CP9KAy4EPAAhD_FAnCFfb5WlimPJNeIAMbQ5w99cifM4U)
![enter image description here](https://lh3.googleusercontent.com/YKxsUff50cGRyVHaSxFC2jS6j3lPdIYml9XzG3nkErGfhmriF0U0Wtu6hAGqyNPaPGt-sF5U43k)
![enter image description here](https://lh3.googleusercontent.com/vtoRgbP21-GBaYH3Eh-_K-pfz5x5BEjr7IipSkCUTgMvf_QCLOZ-4O1874WlQYW7qritw485U68)
5.  Entregue el código desarrollado en Github y un reporte de las pruebas.

### Pre-requisitos

Es necesario tener instalado:


```
*  Maven 3.6 en caso de no tener istalado maven siga el siguiente tutorial dependiendo del sistema operativo que posea https://maven.apache.org/install.html
* Java 1.8 si no tiene instalado java en su dispositivo siga el sigueinte tutorial https://java.com/en/download/help/download_options.xml
* Git tutorial: https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
* Heroku 
* Spark 
```

## Instalaciòn y ejecucion del proyecto

### De forma local
Descargue el repositorio lo puede realizar de dos formas descargando el .zip o usando git 

En caso de usar git la linea de comando para clonar el repositiorio es:

```
git clone https://github.com/YohannaToro/Calculator
```

Descargar dependencias

```
mvn package
```
Compilar proyecto

```
mvn compile
```
instalar dependencias

```
mvn clean install
```
Compilar proyecto

```
mvn clean install
```
Ejecutar proyecto
```
Heroku local web
```
Url
```
localhost:5000/inputdata
```
### Heroku
```
https://morning-cove-97366.herokuapp.com/inputdata
```
### Ejecutar pruebas y aplicaciòn

Ejecutra pruebas
```
mvn test
```
Ejecutar aplicaciòn

```
java -cp target\calculator-1.0-SNAPSHOT.jar edu.escuelaing.arep.Calculator
```



### Casos de prueba

![enter image description here](https://lh3.googleusercontent.com/YgF6pFc5Fg6PORbBR6IfjoPx42GVKv9XPC35nauSoUTDsT75vJ8fKWnmZofsIYjvGXKvRorOZVI)


Algunos de los casos probados fueron estos dos devido probamos un grupo de numeros reales tanto enteros como complejos y con las formulas ya mencioandas obtenemos la desviaciòn estandar y la media


### Codigo de pruebas

Para realizar las prubas se probaron dos funciones la desviacion estandar y la media:
en cada una de ellas ejecutamos la aplicacion de un grupo de datos y se realiza la correspondiente comparaciòn entre el valor esperado y el que se obtiene para saber si es correcto o incorrecto


## Built With
* [Maven](https://maven.apache.org/) - Dependency Management


## Autor

* **Yohanna Toro**  - [YohannaToro](https://github.com/YohannaToro)


## Licencia

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


