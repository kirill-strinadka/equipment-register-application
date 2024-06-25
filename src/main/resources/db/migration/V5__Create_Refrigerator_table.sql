CREATE TABLE refrigerator (
                              id BIGSERIAL PRIMARY KEY,
                              device_model_id BIGINT,
                              doors_count INT,
                              compressor_type VARCHAR(255),
                              CONSTRAINT fk_device_model_refrigerator FOREIGN KEY (device_model_id) REFERENCES device_model(id)
);
