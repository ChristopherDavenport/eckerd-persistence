package edu.eckerd.persistence.eckerd.identitymaster.models

/**
  * Created by davenpcm on 5/25/16.
  */
case class IdentityEmployee(
                           pidm: String,
                           email: String,
                           googleID: String,
                           bannerUsername: Option[String]
                           ) extends pidmEntity
