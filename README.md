# SISGECM - Sistema de Gestión de Citas Médicas

SISGECM es un software de gestión de citas médicas diseñado para clínicas y consultorios médicos. Facilita la reserva, edición y gestión de citas médicas, así como la administración de datos de pacientes y médicos, y la gestión de horarios.

## Tabla de Contenidos

1. [Instalación](#instalación)
2. [Uso](#uso)
3. [Características](#características)
4. [Capturas de Pantalla](#capturas-de-pantalla)
5. [Contribución](#contribución)
6. [Licencia](#licencia)

## Instalación

**Requisitos Previos:**
- Java SE 8 o superior.
- MySQL para la base de datos.

**Pasos de Instalación:**
1. Clone este repositorio: `git clone https://github.com/bnino/SISGECM.git`.
2. Configure la conexión a la base de datos en `configuracion.properties`.
3. Compile y ejecute la aplicación.

## Uso

### Configuración Inicial
1. Inicie la aplicación.
2. Ingrese como administrador.
3. Configure médicos y horarios.

### Reserva de Citas
1. Ingrese como paciente o administrador.
2. Seleccione un médico y elija una fecha y hora disponible para la cita.
3. Complete los datos del paciente.

### Edición de Citas
1. Acceda a su lista de citas.
2. Edite la cita según sea necesario.

## Características

- Reserva y edición de citas médicas.
- Administración de pacientes y médicos.
- Gestión de horarios de médicos.
- Autenticación de usuarios (pacientes y administradores).
- Historial de citas médicas.
- Notificaciones de citas próximas.

## Capturas de Pantalla

![Pantalla de Inicio](screenshots/pantalla_inicio.png)
![Reserva de Cita](screenshots/reserva_cita.png)
![Panel de Administración](screenshots/panel_admin.png)

## Contribución

¡Agradecemos tu interés en contribuir al proyecto! Si deseas contribuir, sigue estos pasos:
1. Haz un fork del repositorio.
2. Crea una rama para tu función: `git checkout -b mi-nueva-funcion`.
3. Realiza tus cambios y haz commit: `git commit -m "Agrega mi nueva función"`.
4. Haz push a tu rama: `git push origin mi-nueva-funcion`.
5. Envía una solicitud de extracción (pull request) para que revisemos tus cambios.

## Licencia

Este proyecto está bajo la [Licencia MIT](LICENSE).
