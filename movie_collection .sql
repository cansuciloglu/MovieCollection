-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 07 Haz 2021, 14:01:54
-- Sunucu sürümü: 10.4.19-MariaDB
-- PHP Sürümü: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `movie_collection`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `movie`
--

CREATE TABLE `movie` (
  `movie_id` int(11) NOT NULL,
  `movie_name` char(50) NOT NULL,
  `movie_year` int(11) NOT NULL,
  `movie_category` char(50) NOT NULL,
  `movie_description` varchar(600) NOT NULL,
  `movie_media` char(50) NOT NULL,
  `movie_lang` char(50) NOT NULL,
  `movie_director` char(50) NOT NULL,
  `movie_lead` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Tablo döküm verisi `movie`
--

INSERT INTO `movie` (`movie_id`, `movie_name`, `movie_year`, `movie_category`, `movie_description`, `movie_media`, `movie_lang`, `movie_director`, `movie_lead`) VALUES
(1001, 'Leon', 1994, 'Dram', 'Mathilda, a 12-year-old girl, is reluctantly taken in by Léon, a professional assassin, after her family is murdered. An unusual relationship forms as she becomes his protégée and learns the assassin\'s trade.', 'ABC', 'English', 'Luc Besson', 'Jean Reno'),
(1002, 'Forrest Gumb', 1972, 'Romantic', 'The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold from the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart.', 'ABC', 'gvh', 'Robert Zemeckis', 'Tom Hanks'),
(1003, 'Godfather', 1972, 'Dram', 'An organized crime dynasty\'s aging patriarch transfers control of his clandestine empire to his reluctant son.', 'ABC', 'English', 'Francis Ford Coppola', 'Al Pacino'),
(1004, 'John Wick', 2008, 'Action', 'An ex-hit-man comes out of retirement to track down the gangsters that killed his dog and took everything from him.', 'ABC', 'English', 'Chad Stahelski', 'Keanu Reeves'),
(1005, 'Iron Man', 2008, 'Action', 'After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil.', 'ABC', 'English', 'Jon Favreau', 'Robert Downey'),
(1007, 'Mad Max', 2015, 'Adventure', 'In a post-apocalyptic wasteland, a woman rebels against a tyrannical ruler in search for her homeland with the aid of a group of female prisoners, a psychotic worshiper, and a drifter named Max.', 'ABC', 'English', 'George Miller', 'Tom Hardy'),
(1008, 'Aquaman', 2018, 'Fantasty', 'Arthur Curry, the human-born heir to the underwater kingdom of Atlantis, goes on a quest to prevent a war between the worlds of ocean and land.', 'ABC', 'English', 'James Wan', 'Jason Momoa'),
(1009, 'Interstellar', 2014, 'Adventure', 'A team of explorers travel through a wormhole in space in an attempt to ensure humanity\'s survival.', 'ABC', 'English', 'Christopher Nolan', ' Matthew McConaughey');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `movie`
--
ALTER TABLE `movie`
  ADD PRIMARY KEY (`movie_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `movie`
--
ALTER TABLE `movie`
  MODIFY `movie_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1011;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
