package edu.eckerd.persistence.eckerd.identitymaster.models

/**
  * Created by davenpcm on 5/25/16.
  */
case class genStudent(
                     id: Long,
                     sStatus: Option[String],
                     sLevel: Option[String],
                     sClass: Option[String],
                     sMajors: Option[String],
                     sMinors: Option[String]
                     ) extends genericEntity
