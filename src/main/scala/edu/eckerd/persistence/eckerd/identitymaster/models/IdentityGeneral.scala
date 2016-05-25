package edu.eckerd.persistence.eckerd.identitymaster.models

/**
  * Created by davenpcm on 5/25/16.
  */
case class IdentityGeneral(
                          pidm: String,
                          firstName: String,
                          lastName: String,
                          ldapUsername: Option[String],
                          eckerdID: Option[String],
                          priorityEmail: Option[String],
                          priorityGoogleID: Option[String]
                          ) extends pidmEntity
