# Programación Orientado a Objetos

- - - - - - -

## Elementos de la programación Orientada a Objetos

- CLASE:
  Es la descripción de los datos y de las operaciones que describen el
  comportamiento de cierto conjunto de elementos homogéneos.
  Es la definición de los atributos y métodos que describen el comportamiento
  de un cierto conjunto de objetos homogéneos.

```
Clase Intervalo
- datos: extremos inferiores y superiores
- operaciones: intersección, longitud, desplazar, ... 
```

- OBJETO:
  Es un ejemplar (instancia) de una clase que responde al comportamiento
  definido por las operaciones de la clase a la cual pertenece, adaptandose
  al estado de sus datos particulares, definido en la clase.
  Es un ejemplar concreto de una clase que responde a los mensaje (invocar los
  métodos)
  correspondientes a los métodos de ésta, adecuándose al estado de sus
  atributos.

```
Objeto de la clase Intervalo
- constantes: (8, 10), (-100, 100), ...
- variables: misHorasDeTrabajo, miPresiónArterial, ... 
```

## Constructor

Son funciones especiales que contienen las clases, el cual permite la
creación de objetos.
Pueden recibir datos/parametros ( todos sus atributos ), o tambien puede estar
vacío.
Llevan el mismo nombre de la clase a la cual pertenece.
Los constructores no retornan ningún valor ( ni void ).

## Parámetro vs Argumento

- Parámetro: Es una declaración de variable u objeto.

```
public void sumar(int a, int b ) {}
```

- Argumento: Es un valor que se envía

```
sumar(2, 25);
```

## Características de POO:

### Abstracción

Es obtener todas las características y comportamientos más importante de un objeto.

### Encapsulamiento

Consiste en definir todas sus propiedades y comportamientos de una clase dentro de si misma.
Ejemplo:

```
class Coche {
    // atributos
    // métodos
}

class Libro {
    // atributos
    // métodos
}
```

El encapsulamiento permite 3 nievel de acceso.

Esto es conocido como:

- Ambito y Visibilidad de los elementos (atributo, método) de una clase.

- - - -

                        Misma clase | mismo paquete | En subclase | Fuera del paquete |

- - - -
| PUBLIC ( publico )        | SI | SI | SI | SI
- - -
| PRIVATE ( privado )       | SI | NO | NO | NO
- - -
| PROTECTED ( protegido)    | SI | SI | SI | NO
- - -
| SIN ESPECIFICAR | SI | SI | NO | NO
- - -

### Polimorfismo

Poli: Muchas
Morfismo: Formas

### Herencia

Las clases pueden compartir sus características.
Los nuevos objetos de la nueva clase heredan los atributos y métodos de la clase original, la cual se denomina
superclase.
La nueva clase, la cual se denomina subclase, puede poseer atributos y métodos propios, que no existen en la clase
principal ( superclase).

### UML

## Miembros estáticos

Tambíen se lo conocen como miembros de clase.
Cuando se define un miembro estático, este yo no lo pertenece al objeto ( intancia o ejemplar ), sino que le
pertenece a la clase directamente.

Cuando los miembros de clase son estaticos, no hace falta crear un objeto (ejemplar y/o instancia) de la clase.

Los miembros de clase:

- Los atributos
- Métodos

Cuando hay un miembro estático en una clase, y este modifica su valor, hará que todos tomen el último el cambío que
se hizo, sin importar donde se encuentren.

Y cuando ya se define un miembro estático para acceder lo hacemos de la siguiente manera:

```
// Nombramos a la clase, siguiendo el atributo o método accesor.
Estatico.title; 
Estatico.getTitle();
```

```
public class Estatico {
    private String frase = "POO - Estáticos";
	private static String title = "Miembros Estáticos en Java";

	public Estatico() {}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String _frase) {
		this.frase = _frase;
	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String _title) {
		Estatico.title = _title;
	}
}

public class Main {
	public static void main(String[] args) {
		Estatico obj1 = new Estatico();
		Estatico obj2 = new Estatico();

		obj2.setFrase("Obj2 - POO - Estáticos");

		System.out.println(obj1.getFrase());
		System.out.println(obj2.getFrase());

		System.out.println("## Miembros estáticos ##");

		System.out.println(Estatico.getTitle());

		Estatico.setTitle("Estamos viendo Miembros Estáticos con Java");
		System.out.println(Estatico.getTitle());
	}
}

```

## Clases Abstracts

Una clase abstracta se caracteriza por que no va a poder ser instanciada o no debería ser instanciada directamente.

Estas clases solo se pueden heredar, funcionan como clase padre ( superclase ).

En una clase abstracta se definen los métodos abstractos, solo se definen, NO se implementan.

Para que una clase se abstracta, basta que uno de sus métodos sea abstracto para que está tambíen se vuelva en
abstracta.

Sus niveles de visualización deben ser public o protected ( nunca private ).

Generalmente las clases abstractas indican el "SER/ES" de un objeto.

Una clase abstracta no puede heredar de varias clases abstractas al mismo tiempo.

## Constante

Es una variable (contante) que no puede cambiar durante la ejecución del programa.

En Java una constante se define con la palabra reservada "final":

```
// 
final double PI = Math.PI;

// Dentro de una clase
public class Persona {
    private final String nombre;
}
```

## Interfaces

Las interfaces se encargan de especificar un comportamiento que luego tendrá que ser implementado, es como un
contrato que se debe cumplir.

Las interfaces NO especifican el "CÓMO" se debe hacer, sino solo el "QUÉ" se debe/puede hacer, ya que solo contiene la 
definición de los métodos y constantes, estos solo pueden ser publicos.

Contiene una serie de métodos abstractos, tambien pueden tener constantes.

Una interface solo puede extender e implementar otras interfaces (la cantidad no importa).

No es obligatorio la palabra clave "abstract" en la definición de los métodos o constantes.





























