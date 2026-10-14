# 1. PushbackReader

## ¿El uso de read modifica el archivo?

No. El método `read()` lee caracteres del archivo, pero no modifica su contenido. Lo que cambia es la posición de lectura dentro del flujo.

![Captura de la lectura del archivo](imagenes/hola1.png)

## ¿Utilizando read(), puedo leer más de un carácter?

Sí. El método `read()` permite leer más de un carácter realizando varias llamadas. Cada llamada lee un carácter y devuelve `-1` cuando se alcanza el final del archivo. Mediante un bucle `while`, podemos leer todo el contenido del archivo carácter por carácter.