package edu.eckerd.persistence.eckerd.identitymaster.models

/**
  * Created by davenpcm on 5/25/16.
  */
case class IdentityStar(
                    pidm: String,
                    genEmployeeFK: Option[Long],
                    genFacultyFK: Option[Long],
                    genStudentFK: Option[Long]
                    ) extends pidmEntity
