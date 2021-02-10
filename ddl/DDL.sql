DROP DATABASE IF EXISTS crawling;
CREATE DATABASE IF NOT EXISTS crawling;
USE crawling;

DROP TABLE IF EXISTS word;

CREATE TABLE IF NOT EXISTS word(
    id BIGINT AUTO_INCREMENT,
    english_word VARCHAR(20) NOT NULL,
    korean_word VARCHAR(20) NOT NULL,
    count INT default 1,

    PRIMARY KEY (id)
);