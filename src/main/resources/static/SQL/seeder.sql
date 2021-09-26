USE webappideas_db;


TRUNCATE racers;

INSERT INTO racers (weight, acceleration, on_road_attraction, off_road_traction, mini_turbo, ground_speed, water_speed, anti_g_speed, air_speed, ground_handling, water_handling, anti_g_handling, air_handling)
VALUES (0, 4, 3, 5, 5, 0, 0, 0, 0, 10, 10, 10, 10),
       (0, 5, 4, 3, 5, 0, 0, 0, 0, 9, ),