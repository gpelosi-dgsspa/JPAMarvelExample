-- Inserisce le associazioni tra film e personaggi nella tabella di associazione pfilm
INSERT INTO pfilm (id_film, id_personaggi)
VALUES
    -- The Avengers
    (1, 1), -- Iron Man
    (1, 2), -- Captain America
    (1, 3), -- Thor
    (1, 4), -- Black Widow
    (1, 5), -- Hulk
    (1, 6), -- Hawkey
    (1, 7), -- Scarlet Witch
    (1, 8), -- Vision
    (1, 9), -- Black Panther
    (1, 10), -- Falcon
    (1, 11), -- Doctor Strange
    (1, 12), -- Ant-Man
    (1, 13), -- Wasp
    (1, 14), -- Spider-Man
    (1, 15), -- Captain Marvel

    -- Avengers: Infinity War
    (2, 1), -- Iron Man
    (2, 2), -- Captain America
    (2, 3), -- Thor
    (2, 4), -- Black Widow
    (2, 5), -- Hulk
    (2, 7), -- Scarlet Witch
    (2, 8), -- Vision
    (2, 14), -- Spider-Man

    -- Avengers: Endgame
    (3, 1), -- Iron Man
    (3, 2), -- Captain America
    (3, 3), -- Thor
    (3, 4), -- Black Widow
    (3, 5), -- Hulk
    (3, 7), -- Scarlet Witch
    (3, 8), -- Vision
    (3, 9), -- Black Panther
    (3, 10), -- Falcon
    (3, 14), -- Spider-Man
    (3, 15); -- Captain Marvel
