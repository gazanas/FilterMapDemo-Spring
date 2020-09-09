INSERT INTO authors (id, name) VALUES
(1, 'Stephen King'),
(2, 'H. P. Lovecraft'),
(3, 'Isaac Asimov'),
(4, 'Arthur C. Clarke'),
(5, 'Agatha Christie');

INSERT INTO information (id, genre, image, author_id) VALUES
(1, 'horror', 'the_outsider.jpg', 1),
(2, 'horror', 'at_the_mountains_of_madness.jpg', 2),
(3, 'science fiction', 'foundation.jpg', 3),
(4, 'science fiction', '2001_a_space_odyssey.jpg', 4),
(5, 'crime', 'murder_on_the_orient_express.jpg', 5);

INSERT INTO books (id, title, published, information_id) VALUES
(1, 'The Outsider', 2018, 1),
(2, 'At the mountains of Madness', 1936, 2),
(3, 'Foundation', 1951, 3),
(4, '2001 A Space Odyssey', 1968, 4),
(5, 'Murder on the orient express', 1934, 5);

