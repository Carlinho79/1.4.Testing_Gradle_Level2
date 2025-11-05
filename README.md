## 🧪 Nivel 2 — Testing con AssertJ y Gradle
### 📚 Descripción general
En este nivel se practican aserciones avanzadas con la librería AssertJ, abarcando siete ejercicios que exploran la comparación de valores, referencias, arrays, colecciones, mapas, excepciones y Optional.
El proyecto usa Gradle como gestor de dependencias y sigue la estructura modular recomendada.

### ⚙️ Dependencias principales
```groovy
dependencies {
    testImplementation 'org.assertj:assertj-core:3.25.3'
    testImplementation 'org.junit.jupiter:junit-jupiter:5.10.0'
}
````

Para ejecutar:
```bash
gradle test
````

### 🧠 Ejercicio 1 — Igualdad de valores (e1_Equality)
Comprueba la igualdad y desigualdad entre enteros.
#### 📸 Ejemplo:
```java
assertThat(a).isEqualTo(b);
assertThat(a).isNotEqualTo(c);
````
Objetivo: aprender la diferencia entre igualdad de valor y referencia.

### 🔗 Ejercicio 2 — Igualdad de referencia (e2_Reference)
Compara si dos variables apuntan al mismo objeto.
#### 📸 Ejemplo:
```java
assertThat(s1).isSameAs(s2);
assertThat(s1).isNotSameAs(s3);
````

### 🧩 Ejercicio 3 — Arrays (e3_Array)
Compara arrays de enteros.
#### 📸 Ejemplo:
```java
assertThat(arr1).isEqualTo(arr2);
````
Objetivo: comprobar contenido exacto entre arrays.

### 🐾 Ejercicio 4 — Colecciones (e4_Collection)
Se usan objetos de tipo Animal y un List para verificar:
* Orden de inserción.
* Ausencia de elementos.
* Presencia sin importar el orden.
* Coincidencias mediante filtros.

#### 📸 Ejemplo:
```java
assertThat(animals)
.containsExactly(dog, cat, tiger)
.doesNotContain(lion)
.filteredOn(a -> a.equals(dog))
.hasSize(1);
````

### 🗺️ Ejercicio 5 — Mapas (e5_Map)
Comprueba que el Map contiene una key, una entry y tiene el tamaño esperado.
#### 📸 Ejemplo:
```java
assertThat(map)
.containsKey("familia")
.containsEntry("amigos", 2);
````

### 💥 Ejercicio 6 — Excepciones (e6_Exception)
Verifica que una operación provoca una excepción específica.
#### 📸 Ejemplo:
```java
assertThatThrownBy(() -> {
int[] nums = {1, 2, 3};
int x = nums[5];
}).isInstanceOf(ArrayIndexOutOfBoundsException.class);
````

### 🔘 Ejercicio 7 — Optional (e7_Optional)
Valida que un Optional está vacío.
#### 📸 Ejemplo:
```java
Optional<String> optional = Optional.empty();
assertThat(optional).isEmpty();
````


### ✅ Conclusión
Este nivel demuestra:
* Uso avanzado de AssertJ.
* Aserciones para colecciones, mapas y excepciones.
* Validaciones más expresivas y legibles que con JUnit puro.
* Comprensión de la diferencia entre valor, referencia y estado de objetos.

### 📁 Estructura de carpetas
```bash
nivel2_gradle_assertj/
├── build.gradle
├── src/
│   ├── main/java/level2_gradle/model/... (e4_Animal)
│   ├── main/java/level2_gradle/testing/... (e1...e7)
│   ├── main/java/level2_gradle/app/MainAssertJ.java
│   └── test/java/... (e1Test...e7Test)
└── README.md
````

### ▶️ Ejecución manual
También puedes ejecutar todos los ejemplos desde la clase:
`gradle run`

```java
public static void main(String[] args) {
e1_Equality.demo();
e2_Reference.demo();
e3_Array.demo();
e4_Collection.demo();
e5_Map.demo();
e6_Exception.demo();
e7_Optional.demo();
}
````

## 👩‍💻 Autor
**Nom:** *Carlos Alberto Garzón Bedoya*  
**Curs:** Java Backend - IT Academy  
**Sprint:** 1. Tasca 4 — Testing

