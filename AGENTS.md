# Instrucciones del proyecto — Actividad 2 de Programación Orientada a Objetos (2026-2)

## Contexto y fuentes de referencia

Esta carpeta corresponde a la **Actividad 2 (20%)** de Programación Orientada a Objetos de la Universidad Nacional de Colombia, docente **Walter Hugo Arboleda Mazo**.

Antes de implementar o modificar un ejercicio, consultar los documentos disponibles en `docs/`:

1. **Enunciado de la Actividad 2:** autoridad principal sobre ejercicios y entregables.
2. **Contenido del curso:** delimita los temas y competencias que se espera aplicar.
3. **Libro _Ejercicios de programación orientada a objetos con Java y UML_, de Leonardo Bermón Angarita:** fuente principal para el enunciado, la solución base, los diagramas y los *ejercicios propuestos*.

No asumir que un PDF se ha leído correctamente: si Cursor no puede acceder a una página, tabla o diagrama, informar cuál y solicitar una extracción o captura legible. No inventar requisitos ni atribuir al profesor instrucciones que no figuren en las fuentes.

## Ejercicios de esta actividad

Trabajar únicamente los ejercicios del capítulo 2 especificados en el enunciado:

| Carpeta | Ejercicio | Tema | Localización aproximada en el libro |
| --- | --- | --- | --- |
| `ejercicio_2_1/` | 2.1 | Clase `Persona` | pp. 61–66; enunciado p. 63 |
| `ejercicio_2_2/` | 2.2 | Clase `Planeta` y enumeraciones | pp. 66–73 |
| `ejercicio_2_3/` | 2.3 | Clase `Automovil`, estado, getters y setters | pp. 73–86 |
| `ejercicio_2_4/` | 2.4 | Figuras geométricas; métodos con y sin retorno | pp. 86–95 |
| `ejercicio_2_5/` | 2.5 | Clase `CuentaBancaria`; métodos con parámetros | pp. 95–101 |

La numeración indicada corresponde a las **páginas impresas** del libro, no necesariamente al índice de páginas mostrado por cada visor PDF.

## Reglas de implementación

- Seguir el enfoque del profesor: resolver los problemas **mediante clases, atributos, constructores, métodos y objetos**, no concentrar toda la lógica en `main`.
- Mantener los nombres, atributos, operaciones y comportamiento exigidos por los enunciados. Si se adaptan nombres para evitar problemas de codificación o mejorar su claridad, conservar la correspondencia con el libro.
- La solución base del libro **ya está resuelta**. Implementarla de forma funcional e **incorporar también las ampliaciones de la sección «Ejercicios propuestos»** de cada ejercicio, salvo instrucción posterior del usuario. No crear una segunda versión independiente si una versión consolidada satisface ambos apartados.
- Trabajar en **Java o Python**, según indique el usuario para cada ejercicio; no generar ambos lenguajes sin que se solicite. Para Java se puede usar un proyecto sencillo con clases separadas; para Python, clases con `__init__` y `self`.
- Conservar una estructura simple y apropiada para una asignatura introductoria. No introducir frameworks, servicios externos, bases de datos, interfaz gráfica, arquitecturas complejas ni dependencias innecesarias en estos ejercicios.
- Separar los datos, la lógica y la ejecución de prueba de forma acorde con el ejemplo del libro y la explicación de clase.
- Cuando se detecte un error tipográfico o lógico en el libro, **no copiarlo silenciosamente**: explicar el problema y aplicar la corrección mínima necesaria para que el programa cumpla el enunciado. No alterar los requisitos por iniciativa propia.
- Comprobar casos típicos y casos límite relevantes; no afirmar que el programa se ejecutó si no se ha ejecutado.

## Diagramas UML

- Preparar **un diagrama de clases para cada ejercicio**, coherente con el código final y con las ampliaciones propuestas. Reflejar clases, atributos con tipos, métodos con parámetros y retornos, constructores y enumeraciones cuando corresponda.
- Usar como referencia la notación del libro y su anexo de UML. No copiar el diagrama original sin actualizarlo si cambió el código.
- El libro presenta también diagramas de objetos; se pueden elaborar como apoyo o si el usuario los solicita, pero **no presentarlos como entregable obligatorio de la Actividad 2** sin comprobarlo en su enunciado.
- Favorecer diagramas editables y reproducibles (por ejemplo, PlantUML) y, cuando sea necesario para el PDF, exportarlos a imagen.

## Entregables de la Actividad 2

La entrega oficial requiere un **archivo PDF con portada**, el **código fuente de cada ejercicio**, el **diagrama de clases de cada ejercicio** y la **URL de cada ejercicio en GitHub**. Mantener el código fuente real en sus carpetas para poder probarlo y subirlo al repositorio.

No generar ni publicar el PDF final ni hacer `commit`/`push` sin que el usuario lo pida. Nunca incluir archivos de `docs/` en un repositorio público sin revisar previamente si el usuario desea publicarlos y si su redistribución está permitida.

## Forma de trabajar

1. Antes de codificar, identificar los requisitos originales y los puntos de «Ejercicios propuestos» del ejercicio correspondiente.
2. Explicar brevemente las clases y métodos previstos.
3. Implementar la versión consolidada y mantenerla legible.
4. Ejecutar o comprobar el programa cuando el entorno lo permita.
5. Generar o actualizar su diagrama UML para que coincida con el código.
6. Indicar qué se completó, qué se verificó y qué falta, sin agregar trabajo fuera del alcance.

**Para el primer trabajo:** centrarse exclusivamente en `ejercicio_2_1/` y en `Persona`, incluidos `paisNacimiento` (`String`) y `genero` (`char`, valores `'H'` o `'M'`), hasta recibir nuevas instrucciones.
