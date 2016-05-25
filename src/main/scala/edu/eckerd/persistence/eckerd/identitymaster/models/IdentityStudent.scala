package edu.eckerd.persistence.eckerd.identitymaster.models

/**
  * Created by davenpcm on 5/25/16.
  */
case class IdentityStudent(
                          pidm: String,
                          email: String,
                          googleID: String,
                          primaryAdvisor: Option[Long]
                          ) extends pidmEntity
