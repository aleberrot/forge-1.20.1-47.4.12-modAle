# ⚔️ Mod: PaconiMod



Este mod de Minecraft fusiona mecánicas y elementos visuales inspirados en **Jojo's Bizarre Adventure** y **Hollow Knight**, ofreciendo a los jugadores nuevas formas de combate basadas en **Stands (Poder) y Esencia (Exploración)**.

## 🚀 1. Estado Actual del Proyecto (Fase Alpha)

Actualmente, el mod se encuentra en las etapas iniciales de registro y configuración de *items* y efectos.

| Categoría | Elementos Implementados | Estado |
| :--- | :--- | :--- |
| **Items Clave** | Flecha de Stand (`stand_arrow`), Nail (`nail`) | **Funcional:** Registrados con sus texturas. |
| **Minerales** | Zafiro Crudo (`raw_sapphire`), Zafiro (`sapphire`) | **Funcional:** Registrados (falta el bloque y la generación en el mundo). |
| **Efectos** | Stand Bound (`stand_bound`) | **Funcional:** Registrado, tiene ícono y se aplica correctamente al usar la Flecha. |
| **Lógica** | Uso de la Flecha de Stand | **Completa:** Consume el *item* y aplica el efecto "Stand Bound". |

---

## ⚙️ 2. Estructura y Registro

Todos los elementos del mod se registran utilizando el sistema de **Registro Diferido (`DeferredRegister`)** de Forge para garantizar la compatibilidad y la carga correcta.

### 2.1. Items y Minerales (ModItems.java)

| Nombre de Registro | Nombre en el Juego | Paquete/Clase | Descripción |
| :--- | :--- | :--- | :--- |
| `stand_arrow` | Stand Arrow | `item.StandArrow.java` | *Item* Clave para iniciar el Despertar del Stand. |
| `raw_sapphire` | Raw Sapphire | `item.ModItems.java` | Materia prima para la progresión T1/T2. |
| `sapphire` | Sapphire | `item.ModItems.java` | Cristal refinado. |
| `nail` | The Nail | `item.ModItems.java` | Inspirado en el arma del Caballero. Item de combate básico. |

### 2.2. Efectos de Poción (ModEffects.java)

| Nombre de Registro | Nombre en el Juego | Subclase | Propósito |
| :--- | :--- | :--- | :--- |
| `stand_bound` | Stand Bound | `effect.StandBoundEffect.java` | Marca al jugador como poseedor de un Stand. Sirve como *flag* (bandera) para activar las habilidades de combate. |

---

## ✨ 3. Mecánicas Implementadas

### A. El Despertar del Stand

El proceso de obtener un Stand es actualmente un *one-shot* (un solo uso) con la Flecha:

* **Activación:** El jugador hace **clic derecho** con la **Flecha de Stand** en la mano.
* **Resultado:** El *item* es consumido (`stack.shrink(1)`) y se aplica el efecto **Stand Bound** (duración larga, Nivel I).
* **Mensaje:** Un mensaje de sistema confirma el "despertar" del poder.

### B. El Nail (Hollow Knight)

El *item* `nail` está registrado y listo para ser usado. En futuras versiones, se le añadirán atributos de daño personalizados o la capacidad de canalizar Esencia (similar al concepto de Alma).

---

## 🔜 4. Próximos Pasos (Roadmap)

El desarrollo se centrará ahora en dotar de funcionalidad a los elementos existentes:

1.  **Lógica de Combate (`Stand Bound`):** Crear un `LivingAttackEvent` para que los ataques cuerpo a cuerpo del jugador con el efecto **Stand Bound** causen daño extra o apliquen un *knockback* especial ("ORA! ORA! ORA!").
2.  **Generación de Bloques:** Implementar la generación del mineral de Zafiro en el mundo.
3.  **Funcionalidad del Nail:** Hacer que el *item* `nail` sea un arma funcional con atributos de ataque únicos.
4.  **Recetas (Data Gen):** Añadir recetas de *crafteo* y *smelting* para los minerales de Zafiro.