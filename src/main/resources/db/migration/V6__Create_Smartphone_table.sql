CREATE TABLE smartphone (
                            id BIGSERIAL PRIMARY KEY,
                            device_model_id BIGINT,
                            memory VARCHAR(255),
                            cameras_count INT,
                            CONSTRAINT fk_device_model_smartphone FOREIGN KEY (device_model_id) REFERENCES device_model(id)
);
