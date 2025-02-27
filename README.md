Ejercicio de despliegue: servicio rest

Servicio REST 


Tecnologías:
Spring Data Rest
Java
HATEOAS


{
  "_embedded": {
    "productos": [
  {
        "nombre": "Producto 1",
        "precio": 100.00,
        "_links": {
          "self": {"href": "/productos/1"},
          "producto:compras": {"href": "/productos/1/compras"}
        }
      },
      {
        "nombre": "Producto 2",
        "precio": 150.00,
        "_links": {
          "self": {"href": "/productos/2"},
          "producto:compras": {"href": "/productos/2/compras"}
        }
      }
    ]
  },
  "_links": {
    "self": {"href": "/productos"}
  }
}

