package edu.eckerd.persistence.eckerd.identitymaster.models

/**
  * Created by davenpcm on 5/25/16.
  */
case class genFaculty(
                     id: Long,
                     fStatus: Option[String],
                     fTag: Option[String],
                     fScheduledIndicator: Option[String],
                     fAdvisorIndicator: Option[String],
                     fType: Option[String]
                     ) extends genericEntity
