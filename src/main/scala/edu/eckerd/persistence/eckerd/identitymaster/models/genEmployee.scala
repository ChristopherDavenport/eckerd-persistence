package edu.eckerd.persistence.eckerd.identitymaster.models

/**
  * Created by davenpcm on 5/25/16.
  */
case class genEmployee(
                      id: Long,
                      eClass: Option[String],
                      eStatus: Option[String],
                      eHomeOrg: Option[String],
                      eJobOrg: Option[String],
                      eJobPosn: Option[String],
                      eRoles: Option[String]
                      ) extends genericEntity
