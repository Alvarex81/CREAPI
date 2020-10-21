# CREApi
Tarea Grupal 6
Integrantes Grupo 2:
 - Guillermo Soliz Nagatoshi
 - Patricia Cano Encinas
 - Manuel Saavedra
 - Alvaro Cardenas Venegas

# Implementacion
### Paso 1: ### 
Construccion de las clases CREUser, UserData y CREApi, de acuerdo a la descripcion del ejercicio, tomando en cuenta que la estructura de salida de CREApi es un MAP, para el ejercicio se utilizo un TreeMap.

### Paso 2: ###
Sobrecarga del metodo toString() para las clases CREUser y UserData.

### Paso 3: ### 
Construccion de las Clases ConcreteIterador, una que realiza el recorrido ascendente (CREIterator) y otra que permite el recorrido descendente (InverseCREIterator), en ambas clases se utilizaron operaciones de Maps para el recorrido, ambas clases son implementaciones de la interface Iterator. 

### Paso 4: ### 
Construccion de la clase ConcreteAggregate, que es una implementacion de la interface Aggregate y retorna los iteradores ascendentes y descendentes.

### Paso 5: ### 
Modificacion del Main (Applicacion Cliente) para que se instancie el objeto agregador de CRE y se invoque a la funcion de impresion de la lista con los recorridos ascendentes y descendentes.  
