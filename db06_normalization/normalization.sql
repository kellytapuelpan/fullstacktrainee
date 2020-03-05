-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb_normalization
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb_normalization
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb_normalization` DEFAULT CHARACTER SET utf8 ;
USE `mydb_normalization` ;

-- -----------------------------------------------------
-- Table `mydb_normalization`.`location`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb_normalization`.`location` (
  `id_location` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `address` VARCHAR(255) NOT NULL,
  `city` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_location`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb_normalization`.`dojo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb_normalization`.`dojo` (
  `id_dojo` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `created_at` VARCHAR(255) NULL,
  `updated_at` VARCHAR(255) NULL,
  `location_id` INT NOT NULL,
  PRIMARY KEY (`id_dojo`),
  INDEX `fk_dojo_location1_idx` (`location_id` ASC),
  CONSTRAINT `fk_dojo_location1`
    FOREIGN KEY (`location_id`)
    REFERENCES `mydb_normalization`.`location` (`id_location`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb_normalization`.`student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb_normalization`.`student` (
  `id_student` INT NOT NULL,
  `first_name` VARCHAR(255) NOT NULL,
  `last_name` VARCHAR(255) NOT NULL,
  `address1` VARCHAR(255) NULL,
  `address2` VARCHAR(255) NULL,
  `interests` TEXT NULL,
  `created_at` DATETIME NULL,
  `updated_at` DATETIME NULL,
  `dojo_id` INT NOT NULL,
  PRIMARY KEY (`id_student`),
  UNIQUE INDEX `created_at_UNIQUE` (`created_at` ASC),
  INDEX `fk_student_dojo1_idx` (`dojo_id` ASC),
  CONSTRAINT `fk_student_dojo1`
    FOREIGN KEY (`dojo_id`)
    REFERENCES `mydb_normalization`.`dojo` (`id_dojo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
