Create USER electronic WITH ENCRYPTED PASSWORD 'Elec!5923*home!';
GRANT ALL PRIVILEGES ON DATABASE electronic_homes TO electronic;
GRANT USAGE ON SCHEMA ControlAdministrativo,ControlPersona,ControlVenta TO electronic;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA ControlAdministrativo,ControlPersona,ControlVenta TO electronic;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA ControlAdministrativo,ControlPersona,ControlVenta TO electronic