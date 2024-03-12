Caso Final Integrador 2 realizado por Sergio Armenteros Rodríguez
https://github.com/Armenteros05/Caso_Final_2.git

Este trabajo se ha realizado con mucha dedicación, cariño y esfuerzo. Gracias por su lectura.

EXPLICACIÓN DEL CÓDIGO:

Primeramente, diseño y clasifico los distintos apartados planteados en el enunciado como distintos "Packages" que son: Animales,Habitats,Mantenimiento y Seguridad y Visitantes. 

En el PACKAGE DE ANIMALES, creo una clase animal donde defino las características basicas y principales requeridas en el enunciado, y más adelante creo otras tres clases ("Acuático, Terrestre y Volador"); donde extiendo los valores de animal y defino los parametros especificos para cada una de las subclases.

En el PACKAGE HABITAT realizo un procedimiento identico al package de animales solo que enfocado a los habitat.

En el PACKAGE DE SEGURIDAD Y MANTENIMIENTO creo tres clases; "Recursos": donde planteo un sistema de inventario y almacennamiento que al final no llego a implantar, "Seguimiento": Donde creo un sistema de salud y mantenimiento de los animales donde la comida planteada en recursos es útil y finalmente "Vigilancia": Donde creo un sistema que registra la hora de entrada al zoo, la hora de salida, hace un seguimiento y plantea un sistema de cronómetro.

Finalmente hallamos el PACKAGE VISITANTE. Este package NO lo he utilizado, ya que la informaciíon contenida no es practica para la realización del ejercicio, pues me proporcionaban información que obtenía en las otras clases y generaba un sistema de tours personalizados del visitante que no estaba acorde a la manera en la que he planteado el ejercicio ya que complicaban el asunto de manera innecesaria.

Fuera de todos los packages encontramos la CLASE MAIN.
En la clase main incluyo todos los packages para que pueda declarar todos sus componentes dentro del main. 
En primer lugar hago una diferenciación entre personal del zoológico y visitante del zoo.

STAFF: dentro de la parte del código enfocada al personal del zoo, creo un breve y sencillo menú que proporciona 5 opciones: 1: Gestion de animales; permite al usuario decir y clasificar un tipo de animal y ver si sus necesidades están cubiertas. 2: Gestión de Habitats; permite al usuario ver un tipo de habitat y que se le muestre las condiciones que presenta el mismo. 3: Gestión de personal, permite al ususario diseñar un sistema de rastreo del empleado, permietendole clasificarlo en función a su disponibilidad y su ocupación. 4: Gestión de Vigilancia y Seguridad, que abre un menú que pregunta al usuario que tipo de habitat desea visitar. En función de lo que se decida se muestra en pantalla una imagen generada por caracteres de tipo ASCII, que simulan lo que se vería si fuese una cámara de verdad, y que al final nos da los datos de las zonas que pueden ser visitadas, la hora y la fecha a la que se accedió por útlima vez al habitat y la duración del tour (esta suele ser baja ya que comienza a contar desde que se ejecuta el codigo en la parte de visitante)

VISITANTE: Dentro de esta parte de código, se le pregunta al usuario acerca del nombre, tipo y habitat del animal que quiere visitar, en función de su habitat, proporciona las características específicas de ese habitat, sus condiciones y un comportamiento específico del animal para cada habitat. Finalmente cuando el tour ha finalizado se emite un mensaje de despedida que da por concluido el tour y cierra la ejecución del código.
