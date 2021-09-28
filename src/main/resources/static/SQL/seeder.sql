USE webappideas_db;


TRUNCATE racers;

INSERT INTO racers (weight, acceleration, on_road_attraction, off_road_traction, mini_turbo, ground_speed, water_speed, anti_g_speed, air_speed, ground_handling, water_handling, anti_g_handling, air_handling)
VALUES (0, 4, 3, 5, 5, 0, 0, 0, 0, 10, 10, 10, 10),
       (0, 5, 4, 3, 5, 0, 0, 0, 0, 9, 9, 9, 9),
       (1, 5, 2, 4, 4, 1, 1, 1, 1, 8, 8, 8, 8),
       (2, 5, 4, 2, 4, 2, 2, 2, 2, 7, 7, 7, 7),
       (2, 4, 1, 5, 4, 2, 2, 2, 2, 8, 8, 8, 8),
       (3, 4, 3, 4, 3, 3, 3, 3, 3, 7, 7, 7, 7),
       (3, 4, 2, 3, 3, 4, 4, 4, 4, 6, 6, 6, 6),
       (4, 3, 3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 5),
       (5, 3, 7, 1, 3, 5, 5, 5, 5, 5, 5, 5, 5),
       (6, 2, 4, 2, 2, 6, 6, 6, 6, 4, 4, 4, 4),
       (6, 2, 5, 1, 2, 6, 6, 6, 6, 5, 5, 5, 5),
       (10, 1, 8, 1, 1, 8, 8, 8, 8, 3, 3, 3, 3),
       (7, 1, 9, 3, 2, 7, 7, 7, 7, 3, 3, 3, 3),
       (8, 1, 10, 0, 1, 9, 9, 9, 9, 2, 2, 2, 2),
       (9, 0, 5, 1, 0, 10, 10, 10, 10, 1, 1, 1, 1),
       (10, 0, 6, 0, 0, 10, 10, 10, 10, 0, 0, 0, 0);

TRUNCATE kart_bodies;

INSERT INTO kart_bodies (weight, acceleration, on_road_attraction, off_road_traction, mini_turbo, ground_speed, water_speed, anti_g_speed, air_speed, ground_handling, water_handling, anti_g_handling, air_handling)
VALUES (2, 4, 3, 3, 4, 3, 3, 3, 3, 3, 2, 3, 3),
       (1, 6, 3, 4, 6, 1, 3, 1, 1, 5, 4, 4, 2),
       (3, 3, 2, 4, 4, 3, 3, 5, 4, 2, 2, 4, 2),
       (4, 1, 1, 3, 2, 4, 5, 2, 0, 1, 5, 1, 1),
       (2, 5, 4, 3, 5, 2, 2, 3, 4, 4, 2, 3, 4),
       (3, 1, 3, 1, 1, 5, 1, 4, 2, 1, 1, 2, 0),
       (4, 0, 2, 5, 0, 5, 2, 3, 1, 0, 1, 1, 0),
       (1, 2, 1, 2, 3, 4, 3, 3, 3, 3, 3, 2, 3),
       (0, 7, 1, 4, 7, 0, 1, 2, 1, 5, 4, 5, 4),
       (0, 6, 0, 6, 6, 1, 5, 0, 2, 4, 5, 2, 3),
       (2, 2, 1, 0, 3, 4, 2, 3, 3, 3, 2, 3, 2),
       (1, 5, 3, 5, 5, 2, 2, 4, 3, 4, 3, 4, 3),
       (0, 3, 1, 3, 3, 4, 2, 4, 3, 2, 3, 5, 1),
       (3, 0, 4, 7, 3, 2, 4, 3, 3, 4, 4, 3, 3);

TRUNCATE tires;

INSERT INTO tires (weight, acceleration, on_road_attraction, off_road_traction, mini_turbo, ground_speed, water_speed, anti_g_speed, air_speed, ground_handling, water_handling, anti_g_handling, air_handling)
VALUES (),