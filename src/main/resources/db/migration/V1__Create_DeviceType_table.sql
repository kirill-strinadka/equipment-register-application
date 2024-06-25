CREATE TABLE device_type (
                             id BIGSERIAL PRIMARY KEY,
                             name VARCHAR(255) NOT NULL,
                             country_of_origin VARCHAR(255),
                             manufacturer VARCHAR(255),
                             online_order BOOLEAN,
                             installment BOOLEAN
);
