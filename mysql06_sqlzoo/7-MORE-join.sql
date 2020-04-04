/* 1) List the films where the yr is 1962 [Show id, title] */

SELECT id, title FROM movie
WHERE yr=1962;


/* 2) Give year of 'Citizen Kane'. */

SELECT yr FROM movie
WHERE title = 'Citizen Kane';


/* 3) List all of the Star Trek movies, include the id, title and yr 
(all of these movies include the words Star Trek in the title). Order results by year. */

SELECT id, title, yr FROM movie
WHERE title LIKE '%Star Trek%'
ORDER BY yr;


/* 4) What id number does the actor 'Glenn Close' have? */

SELECT id FROM actor
WHERE name = 'Glenn Close';


/* 5) What is the id of the film 'Casablanca' */

SELECT id FROM movie
WHERE title = 'Casablanca';


/* 6) Obtain the cast list for 'Casablanca'. */

SELECT a.name FROM casting c
INNER JOIN actor a ON a.id = c.actorid
WHERE movieid = 11768;


/* 7) Obtain the cast list for the film 'Alien' */

SELECT a.name FROM casting c
INNER JOIN actor a ON a.id = c.actorid
INNER JOIN movie m ON m.id = c.movieid
WHERE m.title= 'Alien';


/* 8) List the films in which 'Harrison Ford' has appeared */

SELECT title FROM movie m
INNER JOIN casting c ON m.id = c.movieid
INNER JOIN actor a ON a.id = c.actorid
WHERE a.name = 'Harrison Ford';


/* 9) List the films where 'Harrison Ford' has appeared - but not in the starring role. 
[Note: the ord field of casting gives the position of the actor. If ord=1 then this actor is in the starring role] */

SELECT title FROM movie m
INNER JOIN casting c ON m.id = c.movieid
INNER JOIN actor a ON a.id = c.actorid
WHERE a.name = 'Harrison Ford' AND c.ord !=1;


/* 10) List the films together with the leading star for all 1962 films. */

SELECT title, a.name FROM movie m
INNER JOIN casting c ON m.id = c.movieid
INNER JOIN actor a ON a.id = c.actorid
WHERE yr=1962 AND c.ord =1;


/* 11) Which were the busiest years for 'Rock Hudson', show the year and the number of movies he made each year for any year in which he made more than 2 movies. */

SELECT yr, COUNT(title) FROM movie m
INNER JOIN casting c ON m.id=c.movieid
INNER JOIN actor a ON actorid=a.id
WHERE name='Rock Hudson'
GROUP BY yr
HAVING COUNT(title) > 2
ORDER BY yr;


/* 12) List the film title and the leading actor for all of the films 'Julie Andrews' played in. */

SELECT title, name FROM movie m
INNER JOIN casting c ON m.id = c.movieid
INNER JOIN actor a ON a.id = c.actorid
WHERE ord=1 AND c.movieid IN (SELECT movieid FROM casting y INNER JOIN actor ON actor.id=actorid WHERE name='Julie Andrews')


/* 13) Obtain a list, in alphabetical order, of actors who've had at least 15 starring roles. */

SELECT m.title, COUNT(*) AS actors_number FROM movie m
JOIN casting c ON m.id = c.movieid
WHERE m.yr = 1978
GROUP BY m.id
ORDER BY COUNT(*) DESC, m.title ASC;

/* 14) List the films released in the year 1978 ordered by the number of actors in the cast, then by title.*/

SELECT m.title, COUNT(*) AS actors_number FROM movie m
JOIN casting c ON m.id = c.movieid
WHERE m.yr = 1978
GROUP BY m.id
ORDER BY COUNT(*) DESC, m.title ASC;


/* 15) List all the people who have worked with 'Art Garfunkel'.*/

SELECT a.name FROM 
(SELECT movie.* FROM movie
INNER JOIN casting ON casting.movieid = movie.id
INNER JOIN actor ON actor.id = casting.actorid
WHERE actor.name = 'Art Garfunkel') AS m
INNER JOIN (SELECT actor.*, casting.movieid FROM actor
INNER JOIN casting ON casting.actorid = actor.id
WHERE actor.name != 'Art Garfunkel') as a ON m.id = a.movieid;

/**/

