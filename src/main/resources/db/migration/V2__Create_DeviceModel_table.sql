CREATE TABLE device_model (
                              id BIGSERIAL PRIMARY KEY,
                              name VARCHAR(255) NOT NULL,
                              serial_number VARCHAR(255),
                              color VARCHAR(255),
                              size VARCHAR(255),
                              price DECIMAL(10, 2),
                              available BOOLEAN,
                              device_type_id BIGINT,
                              CONSTRAINT fk_device_type FOREIGN KEY (device_type_id) REFERENCES device_type(id)
);
