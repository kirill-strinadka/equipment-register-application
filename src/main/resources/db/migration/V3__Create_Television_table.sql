CREATE TABLE television (
                            id BIGSERIAL PRIMARY KEY,
                            device_model_id BIGINT,
                            category VARCHAR(255),
                            technology VARCHAR(255),
                            CONSTRAINT fk_device_model_television FOREIGN KEY (device_model_id) REFERENCES device_model(id)
);
