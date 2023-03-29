Create database electronic_homes;
Create SCHEMA ControlAdministrativo;
Create SCHEMA ControlPersona;
Create SCHEMA ControlVenta;
Create Table ControlAdministrativo.Sucursal(--
    id_sucursal SERIAL NOT NULL,
    nombre VARCHAR(25) NOT NULL UNIQUE,
    direccion VARCHAR(30) NOT NULL,
    PRIMARY KEY(id_sucursal)
);
Create Table ControlAdministrativo.Rol(--
    id_rol SERIAL NOT NULL,
    nombre VARCHAR(15) NOT NULL UNIQUE,    
    descripcion VARCHAR(150) NOT NULL,
    PRIMARY KEY(id_rol)
);
Create Table ControlAdministrativo.Producto(--
    codigo_producto VARCHAR(4) NOT NULL,
    nombre VARCHAR(35) NOT NULL,
    marca VARCHAR(15) NOT NULL,
    valor DECIMAL NOT NULL,
    PRIMARY KEY(codigo_producto)
);
Create Table ControlAdministrativo.Bodega(--
    id_bodega SERIAL NOT NULL,
    nombre VARCHAR(25) NOT NULL,
    direccion VARCHAR(30) NOT NULL,
    PRIMARY KEY(id_bodega)
);
Create Table ControlAdministrativo.Producto_Bodega(--
    id_bodega INT NOT NULL,
    codigo_producto VARCHAR(4) NOT NULL,  
    proveedor VARCHAR(25) NOT NULL, 
    ubicacion VARCHAR(25) NOT NULL, 
    cantidad_bodega INT NOT NULL,
    FOREIGN KEY(id_bodega) REFERENCES ControlAdministrativo.Bodega(id_bodega),
    FOREIGN KEY(codigo_producto) REFERENCES ControlAdministrativo.Producto(codigo_producto)
);
Create Table ControlAdministrativo.Producto_Sucursal(--
    id_sucursal INT NOT NULL,
    codigo_producto VARCHAR(4) NOT NULL,
    ubicacion VARCHAR(25) NOT NULL, 
    cantidad_sucursal INT NOT NULL,
    FOREIGN KEY(id_sucursal) REFERENCES ControlAdministrativo.Sucursal(id_sucursal),
    FOREIGN KEY(codigo_producto) REFERENCES ControlAdministrativo.Producto(codigo_producto)
);
Create Table ControlPersona.Cliente(--
    nit VARCHAR(9) NOT NULL,
    nombre VARCHAR(25),
    telefono VARCHAR(15),
    total_gasto DECIMAL NOT NULL,
    ultima_compra DECIMAL NOT NULL,
    PRIMARY KEY(nit)
);
Create Table ControlPersona.Empleado(--
    cui CHAR(13) NOT NULL,
    id_sucursal INT NOT NULL,
    id_rol INT NOT NULL,
    nombre VARCHAR(25) NOT NULL,
    edad INT NOT NULL,
    telefono VARCHAR(15) NOT NULL,
    usuario VARCHAR(15) NOT NULL UNIQUE,
    password_empleado VARCHAR(60) NOT NULL,
    PRIMARY KEY(cui),
    FOREIGN KEY(id_sucursal) REFERENCES ControlAdministrativo.Sucursal(id_sucursal),
    FOREIGN KEY(id_rol) REFERENCES ControlAdministrativo.Rol(id_rol)
);
Create Table ControlVenta.Factura(
    id_venta SERIAL NOT NULL,
    id_sucursal INT NOT NULL,
    cui CHAR(13) NOT NULL,
    nit VARCHAR(9) NOT NULL,
    fecha DATE DEFAULT CURRENT_DATE NOT NULL,
    subtotal_venta DECIMAL NOT NULL,
    descuento DECIMAL NOT NULL,
    total_venta DECIMAL NOT NULL,
    PRIMARY KEY(id_venta),
    FOREIGN KEY(id_sucursal) REFERENCES ControlAdministrativo.Sucursal(id_sucursal),
    FOREIGN KEY(cui) REFERENCES ControlPersona.Empleado(cui),
    FOREIGN KEY(nit) REFERENCES ControlPersona.Cliente(nit)
);
Create Table ControlVenta.Producto_Factura(
    id_venta INT NOT NULL,
    id_sucursal INT NOT NULL,
    codigo_producto VARCHAR(4) NOT NULL,
    cantidad_compra INT NOT NULL,
    total_producto_factura DECIMAL NOT NULL,
    FOREIGN KEY(id_venta) REFERENCES ControlVenta.Factura(id_venta),
    FOREIGN KEY(id_sucursal) REFERENCES ControlAdministrativo.Sucursal(id_sucursal),
    FOREIGN KEY(codigo_producto) REFERENCES ControlAdministrativo.Producto(codigo_producto)
);