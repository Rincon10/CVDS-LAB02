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