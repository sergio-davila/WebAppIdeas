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
       (4, 3, ),