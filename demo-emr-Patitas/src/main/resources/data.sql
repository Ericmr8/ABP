-- INSERTS PARA LA TABLA PERSON (Base de Customer y Worker/Doctor/Nurse)
INSERT INTO Person (id, name, phone, email, address) VALUES (1, 'Carlos Ramírez', '123456789', 'carlos@example.com', 'Calle Uno 123');
INSERT INTO Person (id, name, phone, email, address) VALUES (2, 'Lucía Fernández', '234567891', 'lucia@example.com', 'Calle Dos 456');
INSERT INTO Person (id, name, phone, email, address) VALUES (3, 'Miguel Torres', '345678912', 'miguel@example.com', 'Calle Tres 789');
INSERT INTO Person (id, name, phone, email, address) VALUES (4, 'Sofía Martínez', '456789123', 'sofia@example.com', 'Calle Cuatro 101');
INSERT INTO Person (id, name, phone, email, address) VALUES (5, 'Pedro Sánchez', '567891234', 'pedro@example.com', 'Calle Cinco 202');
INSERT INTO Person (id, name, phone, email, address) VALUES (6, 'Ana Gómez', '678912345', 'ana@example.com', 'Calle Seis 303');
INSERT INTO Person (id, name, phone, email, address) VALUES (7, 'Luis Moreno', '789123456', 'luis@example.com', 'Calle Siete 404');
INSERT INTO Person (id, name, phone, email, address) VALUES (8, 'Laura Ríos', '891234567', 'laura@example.com', 'Calle Ocho 505');
INSERT INTO Person (id, name, phone, email, address) VALUES (9, 'Manuel Díaz', '912345678', 'manuel@example.com', 'Calle Nueve 606');
INSERT INTO Person (id, name, phone, email, address) VALUES (10, 'Elena Vega', '102345678', 'elena@example.com', 'Calle Diez 707');

-- INSERTS PARA CUSTOMER
INSERT INTO Customer (id, dni) VALUES (1, '12345678A');
INSERT INTO Customer (id, dni) VALUES (2, '23456789B');
INSERT INTO Customer (id, dni) VALUES (3, '34567890C');
INSERT INTO Customer (id, dni) VALUES (4, '45678901D');
INSERT INTO Customer (id, dni) VALUES (5, '56789012E');
INSERT INTO Customer (id, dni) VALUES (6, '67890123F');
INSERT INTO Customer (id, dni) VALUES (7, '78901234G');
INSERT INTO Customer (id, dni) VALUES (8, '89012345H');
INSERT INTO Customer (id, dni) VALUES (9, '90123456I');
INSERT INTO Customer (id, dni) VALUES (10, '01234567J');

-- INSERTS PARA WORKER (DOCTORES)
INSERT INTO Worker (id, salary, start_date) VALUES (1, 2000.00, '2020-01-15');
INSERT INTO Worker (id, salary, start_date) VALUES (2, 2100.50, '2021-03-10');
INSERT INTO Worker (id, salary, start_date) VALUES (3, 1900.00, '2019-11-20');
INSERT INTO Worker (id, salary, start_date) VALUES (4, 2200.00, '2022-06-01');
INSERT INTO Worker (id, salary, start_date) VALUES (5, 2500.00, '2023-01-05');
INSERT INTO Worker (id, salary, start_date) VALUES (6, 2300.75, '2021-08-12');
INSERT INTO Worker (id, salary, start_date) VALUES (7, 2400.20, '2020-09-25');
INSERT INTO Worker (id, salary, start_date) VALUES (8, 2150.00, '2022-04-14');
INSERT INTO Worker (id, salary, start_date) VALUES (9, 1950.60, '2023-03-18');
INSERT INTO Worker (id, salary, start_date) VALUES (10, 2050.40, '2022-12-30');

-- INSERTS PARA DOCTOR
INSERT INTO Doctor (id, especialidad) VALUES (1, 'Cirugía');
INSERT INTO Doctor (id, especialidad) VALUES (2, 'Dermatología');
INSERT INTO Doctor (id, especialidad) VALUES (3, 'Cardiología');
INSERT INTO Doctor (id, especialidad) VALUES (4, 'Odontología');
INSERT INTO Doctor (id, especialidad) VALUES (5, 'Neurología');
INSERT INTO Doctor (id, especialidad) VALUES (6, 'Oftalmología');
INSERT INTO Doctor (id, especialidad) VALUES (7, 'Onc<ología');
INSERT INTO Doctor (id, especialidad) VALUES (8, 'Ortopedia');
INSERT INTO Doctor (id, especialidad) VALUES (9, 'Infectología');
INSERT INTO Doctor (id, especialidad) VALUES (10, 'General');

-- INSERTS PARA ANIMAL
INSERT INTO Animal (id, name, age, gender_enum, weight, chip, sterilized, vaccinated, disease) VALUES (1, 'Luna', 4, 'HEMBRA', 12.5, TRUE, TRUE, TRUE, 'Ninguna');
INSERT INTO Animal (id, name, age, gender_enum, weight, chip, sterilized, vaccinated, disease) VALUES (2, 'Rocky', 7, 'MACHO', 30.2, TRUE, FALSE, TRUE, 'Artritis');
INSERT INTO Animal (id, name, age, gender_enum, weight, chip, sterilized, vaccinated, disease) VALUES (3, 'Milo', 2, 'MACHO', 10.0, FALSE, FALSE, TRUE, 'Gripe');
INSERT INTO Animal (id, name, age, gender_enum, weight, chip, sterilized, vaccinated, disease) VALUES (4, 'Nina', 5, 'HEMBRA', 18.3, TRUE, TRUE, FALSE, 'Otitis');
INSERT INTO Animal (id, name, age, gender_enum, weight, chip, sterilized, vaccinated, disease) VALUES (5, 'Thor', 6, 'MACHO', 25.4, TRUE, TRUE, TRUE, 'Ninguna');
INSERT INTO Animal (id, name, age, gender_enum, weight, chip, sterilized, vaccinated, disease) VALUES (6, 'Bella', 1, 'HEMBRA', 8.2, FALSE, FALSE, FALSE, 'Parasitos');
INSERT INTO Animal (id, name, age, gender_enum, weight, chip, sterilized, vaccinated, disease) VALUES (7, 'Simba', 3, 'MACHO', 22.1, TRUE, TRUE, TRUE, 'Ninguna');
INSERT INTO Animal (id, name, age, gender_enum, weight, chip, sterilized, vaccinated, disease) VALUES (8, 'Coco', 4, 'HEMBRA', 13.3, TRUE, FALSE, TRUE, 'Alergia');
INSERT INTO Animal (id, name, age, gender_enum, weight, chip, sterilized, vaccinated, disease) VALUES (9, 'Toby', 2, 'MACHO', 16.5, FALSE, FALSE, FALSE, 'Fractura');
INSERT INTO Animal (id, name, age, gender_enum, weight, chip, sterilized, vaccinated, disease) VALUES (10, 'Lola', 3, 'HEMBRA', 9.7, TRUE, TRUE, TRUE, 'Ninguna');

-- INSERTS PARA APPOINTMENT
INSERT INTO Citas (id, fecha_hora, hora_llegada, hora_salida, motivo, animal_id, customer_id, doctor_id) VALUES (1, '2024-06-01T10:00:00', '09:55', '10:30', 'Consulta general', 1, 1, 1);
INSERT INTO Citas (id, fecha_hora, hora_llegada, hora_salida, motivo, animal_id, customer_id, doctor_id) VALUES (2, '2024-06-02T11:00:00', '10:45', '11:20', 'Vacunación', 2, 2, 2);
INSERT INTO Citas (id, fecha_hora, hora_llegada, hora_salida, motivo, animal_id, customer_id, doctor_id) VALUES (3, '2024-06-03T12:00:00', '11:50', '12:25', 'Cirugía menor', 3, 3, 3);
INSERT INTO Citas (id, fecha_hora, hora_llegada, hora_salida, motivo, animal_id, customer_id, doctor_id) VALUES (4, '2024-06-04T13:00:00', '12:50', '13:30', 'Consulta dermatológica', 4, 4, 4);
INSERT INTO Citas (id, fecha_hora, hora_llegada, hora_salida, motivo, animal_id, customer_id, doctor_id) VALUES (5, '2024-06-05T14:00:00', '13:50', '14:35', 'Chequeo anual', 5, 5, 5);
INSERT INTO Citas (id, fecha_hora, hora_llegada, hora_salida, motivo, animal_id, customer_id, doctor_id) VALUES (6, '2024-06-06T15:00:00', '14:50', '15:20', 'Tratamiento', 6, 6, 6);
INSERT INTO Citas (id, fecha_hora, hora_llegada, hora_salida, motivo, animal_id, customer_id, doctor_id) VALUES (7, '2024-06-07T16:00:00', '15:45', '16:30', 'Revisión postoperatoria', 7, 7, 7);
INSERT INTO Citas (id, fecha_hora, hora_llegada, hora_salida, motivo, animal_id, customer_id, doctor_id) VALUES (8, '2024-06-08T17:00:00', '16:50', '17:20', 'Desparasitación', 8, 8, 8);
INSERT INTO Citas (id, fecha_hora, hora_llegada, hora_salida, motivo, animal_id, customer_id, doctor_id) VALUES (9, '2024-06-09T18:00:00', '17:55', '18:35', 'Examen de rutina', 9, 9, 9);
INSERT INTO Citas (id, fecha_hora, hora_llegada, hora_salida, motivo, animal_id, customer_id, doctor_id) VALUES (10, '2024-06-10T19:00:00', '18:50', '19:25', 'Consulta por fiebre', 10, 10, 10);

-- INSERTS PARA PRESCRIPTION
INSERT INTO Prescription (id, medicamento, dosis, frecuencia, duracion, animal_id, doctor_id) VALUES (1, 'Amoxicilina', '500mg', 'Cada 8h', 7, 1, 1);
INSERT INTO Prescription (id, medicamento, dosis, frecuencia, duracion, animal_id, doctor_id) VALUES (2, 'Prednisona', '20mg', 'Cada 12h', 5, 2, 2);
INSERT INTO Prescription (id, medicamento, dosis, frecuencia, duracion, animal_id, doctor_id) VALUES (3, 'Enrofloxacina', '50mg', 'Diario', 10, 3, 3);
INSERT INTO Prescription (id, medicamento, dosis, frecuencia, duracion, animal_id, doctor_id) VALUES (4, 'Metronidazol', '250mg', 'Cada 12h', 5, 4, 4);
INSERT INTO Prescription (id, medicamento, dosis, frecuencia, duracion, animal_id, doctor_id) VALUES (5, 'Furosemida', '40mg', 'Cada 24h', 3, 5, 5);
INSERT INTO Prescription (id, medicamento, dosis, frecuencia, duracion, animal_id, doctor_id) VALUES (6, 'Carprofeno', '25mg', 'Cada 8h', 6, 6, 6);
INSERT INTO Prescription (id, medicamento, dosis, frecuencia, duracion, animal_id, doctor_id) VALUES (7, 'Doxiciclina', '100mg', 'Cada 12h', 4, 7, 7);
INSERT INTO Prescription (id, medicamento, dosis, frecuencia, duracion, animal_id, doctor_id) VALUES (8, 'Ketoconazol', '200mg', 'Diario', 2, 8, 8);
INSERT INTO Prescription (id, medicamento, dosis, frecuencia, duracion, animal_id, doctor_id) VALUES (9, 'Clindamicina', '150mg', 'Cada 12h', 1, 9, 9);
INSERT INTO Prescription (id, medicamento, dosis, frecuencia, duracion, animal_id, doctor_id) VALUES (10, 'Meloxicam', '15mg', 'Cada 24h', 7, 10, 10);

ALTER TABLE Person ALTER COLUMN id RESTART WITH 11;

