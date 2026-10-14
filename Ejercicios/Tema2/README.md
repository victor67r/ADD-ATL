# 1. PushbackReader

## ¿El uso de read modifica el archivo?

No. El método `read()` lee caracteres del archivo, pero no modifica su contenido. Lo que cambia es la posición de lectura dentro del flujo.

![Captura de la lectura del archivo](imagenes/hola1.png)

## ¿Utilizando read(), puedo leer más de un carácter?

Sí. El método `read()` permite leer más de un carácter realizando varias llamadas. Cada llamada lee un carácter y devuelve `-1` cuando se alcanza el final del archivo. Mediante un bucle `while`, podemos leer todo el contenido del archivo carácter por carácter.

![Captura del código y resultado de read()](imagenes/hola1.png)

## ¿Qué ocurre si hago unread() sin leer previamente un carácter?

El método `unread()` permite introducir un carácter en el búfer de retroceso sin necesidad de haberlo leído previamente del archivo. Por ejemplo, si ejecutamos `unread('X')` y después llamamos a `read()`, se leerá primero la letra `X`, aunque no estuviera en el archivo original.

Sin embargo, si el búfer está lleno y se intenta introducir otro carácter, se producirá una excepción `IOException`.

![Prueba del método unread()](imagenes/hola2.png)