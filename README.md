# 💳 Alke Wallet

Alke Wallet es una aplicación desarrollada bajo el paradigma de **Programación Orientada a Objetos (POO)** que simula una **billetera digital**, permitiendo a los usuarios gestionar sus activos financieros en **pesos chilenos (CLP)** y **dólares estadounidenses (USD)**.

El sistema permite:
- Depositar y retirar dinero en CLP
- Depositar y retirar dinero en USD (conversión automática a CLP)
- Consultar saldo actualizado
- Administrar datos del cliente y su cuenta bancaria

---

## 📐 Diagrama del Proyecto

> *Sugerencia:* incluir aquí un diagrama UML de clases (`CuentaBancaria`, `CuentaUSD`, `Cliente`, `Main`) para una mejor comprensión del diseño.

---

## 🧱 Arquitectura del Proyecto

El proyecto está estructurado en base a clases que representan entidades del dominio bancario.

### 🔹 Superclase: `CuentaBancaria`

Clase base que define el comportamiento general de una cuenta bancaria.

#### Atributos
- **numeroCuenta** (`private int`)  
  Número identificador de la cuenta.  
  Se accede mediante *Getters y Setters*.  
  
- **saldo** (`protected double`)  
  Saldo disponible en CLP.  
  Se declara como `double` para permitir operaciones con decimales, especialmente al convertir montos desde USD.

#### Métodos
- `depositar(double montoCLP)`
- `retirar(double montoCLP)`
- `consultarSaldo()`

Todos los métodos operan sobre montos expresados en **CLP**.

---

### 🔹 Subclase: `CuentaUSD`

Extiende `CuentaBancaria` e implementa la interfaz `TipoCambio`.

```java
public class CuentaUSD extends CuentaBancaria implements TipoCambio
# 💱 Clase `CuentaUSD`

La clase `CuentaUSD` representa una cuenta bancaria que permite realizar operaciones en **dólares estadounidenses (USD)**, aplicando automáticamente la conversión a **pesos chilenos (CLP)** antes de afectar el saldo de la cuenta.

Esta clase es una **herencia** de `CuentaBancaria` y utiliza una **interfaz de tipo de cambio** para asegurar que las operaciones con divisas sean correctas.


#### Métodos sobreescritos
- `super.depositar(double montoUSD)`
- `auper.retirar(odouble montoUSD)`

---
### 🔹 Clase: `Cliente`

Clase `Cliente` n jereda de otras clases ni implementa interfaces. Su relación con resto del proyecto se basa en composición, ya que contiene unna referencia a un objeto de tipo `CuentaBancaria`.

#### Atributos
- **ID** (`private int`)  
  Número de dentificación cliente titular de la cuenta.  
  Se accede mediante *Getters y Setters*.  
  
- **titular** (`private String`)  
  Nombre usuario de la cuenta.  

- **cuenta** (`private CuentaBancaria`)  
  Nombre usuario de la cuenta.  
  

#### Métodos
- `consultarDatosCliente()`

Todos los métodos operan sobre montos expresados en **CLP**.

---

# 🔁 Interface `TipoCambio`

La interface `TipoCambio` define el comportamiento necesario para realizar la **conversión de moneda desde dólares estadounidenses (USD) a pesos chilenos (CLP)** dentro del proyecto **Alke Wallet**.

Su propósito principal es **separar la lógica de conversión de divisas** de las clases que realizan operaciones bancarias, promoviendo un diseño flexible, reutilizable y alineado con los principios de la Programación Orientada a Objetos.

---

## 🎯 Objetivo

- Centralizar la lógica de conversión de moneda
- Evitar errores al operar con montos en distintas divisas
- Facilitar la mantención y futura extensión del sistema
- Permitir que distintas clases implementen diferentes estrategias de conversión

---

# 🖥️ Clase Principal `Main` – Alke Wallet

## 📌 Descripción General

La clase **`Main`** es la clase principal del proyecto **Alke Wallet** y constituye el **punto de entrada de la aplicación**. En ella se controla el flujo del programa y se gestiona la interacción con el usuario a través de la consola.

Esta clase coordina la creación de objetos, la ejecución del menú principal y la invocación de los métodos que permiten realizar operaciones bancarias.

---

## 🚀 Punto de Entrada del Programa

```java
public class Main {
    public static void main(String[] args) {
        ...
    }
}




