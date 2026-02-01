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
