package models

import java.lang.Float

object DoseModel {

  case class DoseId(value: Int) extends AnyVal {
    override def toString: String = value.toString
  }

  case class DoseSize(value: Float) extends AnyVal {
    override def toString: String = value.toString
  }

  case class DoseUnit(value: String) extends AnyVal {
    override def toString: String = value
  }

  case class AdministrationMethod(value: String) extends AnyVal {
    override def toString: String = value
  }

  final val DefaultAdministrationMethod = AdministrationMethod("Tablet")

}
