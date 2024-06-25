CREATE TABLE vacuum_cleaner (
                                id BIGSERIAL PRIMARY KEY,
                                device_model_id BIGINT,
                                dust_collector_volume VARCHAR(255),
                                modes_count INT,
                                CONSTRAINT fk_device_model_vacuum_cleaner FOREIGN KEY (device_model_id) REFERENCES device_model(id)
);
