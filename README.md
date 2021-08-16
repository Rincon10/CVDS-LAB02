# CVDS-LAB2
CVDS LAB-2

# **La herramienta Maven**

### Cuál es su mayor utilidad

Facilitar la creación y gestión de proyectos de Software, basándose en el concepto de modelo de objeto de proyecto (POM).

Presenta una ventaja y es la conectividad remota a su propio repositorio, permitiendo acceso a utilidades adicionales, que solo son usadas si uno lo desea.

### Fases de Maven

 1. **_compile_**: Genera los archivos __.class__, compilando las fuentes __.java__. No termina este en caso de que en algún __.class__ haya un error.
 2. **_test_**: Ejecuta los test automáticos de **JUnit** existentes, abortando el proceso si alguno de ellos falla.
 3. **_package_**: Genera el **.jar** con los **.class** compilados.
 4. **_install_**: Copia los **.jar** a un directorio en nuestro ordenador, permitiendo que este se pueda usar en otros proyectos **maven** en la misma máquina.
 5. **_deploy_**: Ubica una copia del **.jar** a un servidor remoto, permitiendo el acceso a este a cualquier otro proyecto **maven** que tenga acceso a ese servidor.

### Para qué sirven los plugins

> **¿Qué es un plugin?**
> 
> Un Plugin es un fragmento o componente de código hecho para ampliar las funciones de un programa o de una herramienta.

## Cómo se crea un proyecto en Maven con ayuda de arquetipos

Para poder crear un proyecto en maven con arquetipos es necesario:

```
mvn archetype:generate -Dfilter=maven-archetype-quickstart 
```
Esto nos generará un proyecto de manera interactiva, lo que después nos solicitará:

- Grupo
- Id del artefacto
- Versión
- Paquete

![1](https://github.com/Rincon10/CVDS-LAB2/blob/master/resources/archetypeConfiguration.jpg)

Si nos dirigimos a la carpeta ```Patterns``` y escribimos el comando ```tree```,nos mostrara todos los archivos creados por maven:

```
tree
```
similar a como se muestra a continuación \
![2](https://github.com/Rincon10/CVDS-LAB2/blob/master/resources/tree.jpg)

## Compilando y Ejecutando
Para compilar ejecute el comando:
```
$ mvn package
```
Si maven no actualiza las dependencias utilice la opción -U asi:
```
$ mvn -U package
```
* Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando mvn.
   * El objetivo de package es ***"empaquetar el proyecto"*** por defecto crea un ejecutable ***.jar***


* Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase App.java como parámetro en "mainClass"
   * Para ejecutar el proyecto debe ejecutar el siguiente comando:
      ```
      mvn exec:java -Dexec.mainClass="edu.eci.cvds.patterns.App"
      ```

* Buscar cómo enviar parámetros al plugin "exec".
   * Para enviar parametro ingresesar el siguiente comando 
      ```
      mvn exec: exec -Dexec.executable = "maven" [-Dexec.workingdir = "/ tmp"] -Dexec.args = "- X myproject: dist"
      ```


* Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: ```Hello World!``` \
   ![3](https://github.com/Rincon10/CVDS-LAB2/blob/master/resources/ejecuantandoApp.jpg)
* Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. Ej: ```Hello Pepito!``` \
   ![4](https://github.com/Rincon10/CVDS-LAB2/blob/master/resources/ejecutandoApp1Param.jpg) 
* Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?
   * Al estar solo revisando un parametro, el saludo se mantuvo igual con salida ```Hello nombreIngresado```

* Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido. \
   ![5](https://github.com/Rincon10/CVDS-LAB2/blob/master/resources/ejecutandoApp2Param.jpg) 

## Hacer el esqueleto de la aplicacion
* Finalice el esqueleto de la aplicacion
* Ejecute múltiples veces la clase ShapeMain, usando el plugin exec de maven con los siguientes parámetros y verifique la salida en consola para cada una:
   * ***Sin parámetros:***  \
      ![6](https://github.com/Rincon10/CVDS-LAB2/blob/master/resources/ejecucionSinParam.jpg)  \
      Este no es una entrada valida ya que la clase ```ShapeMain``` requiere un parametro, sin embargo la clase lo maneja y atiende la falta del parametro.
   * ***Parámetro: qwerty***  \
      ![7](https://github.com/Rincon10/CVDS-LAB2/blob/master/resources/ejecucionParamQuerty.jpg)   \
      Este no es una entrada valida ya que la clase ```ShapeMain``` requiere un parametro de una figura establecida en la clase ```RegularShapeType```, sin embargo la clase atrapa y maneja el error.
   * ***Parámetro: pentagon***  \
      ![8](https://github.com/Rincon10/CVDS-LAB2/blob/master/resources/ejecucionParampentagon.jpg)   \
      Este no es una entrada valida ya que la clase ```ShapeMain``` requiere un parametro de una figura establecida en la clase ```RegularShapeType```, sin embargo la clase atrapa y maneja el error. 
   * ***Parámetro Hexagon***  \
      ![9](https://github.com/Rincon10/CVDS-LAB2/blob/master/resources/ejecucionParamHexagon.jpg)   \
      Este es correcto ya que la clase muestra por pantalla el numero de lados de la figura ingresada
 * Investigue para qué sirve ***"gitignore"*** y cómo se usa. Para futuras entregas, debe estar configurado
   * Sirve para decirle a Git qué archivos o directorios completos debe ignorar y no subir al repositorio de código. \
    ***Por ejemplo:*** \
    La notación es muy simple. Por ejemplo, si indicamos la línea
      ```
      bower_components/
      ```
      **Estamos evitando que se procese en el control de versiones todo el contenido de la carpeta "bower_components".**

      Si colocamos la siguiente línea:
      ```
      *.DS_Store
      ```

     Estaremos evitando que el sistema de control de versiones procese todos los archivos acabados de .DS_Store


### __Autores__

* Camilo Rincón [Rincon10](https://github.com/Rincon10)
* Leonardo Galeano [Ersocaut](https://github.com/Ersocaut)




