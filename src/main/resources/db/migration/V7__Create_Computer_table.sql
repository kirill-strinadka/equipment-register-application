CREATE TABLE computer (
                          id BIGSERIAL PRIMARY KEY,
                          device_model_id BIGINT,
                          category VARCHAR(255),
                          processor_type VARCHAR(255),
                          CONSTRAINT fk_device_model_computer FOREIGN KEY (device_model_id) REFERENCES device_model(id)
);
