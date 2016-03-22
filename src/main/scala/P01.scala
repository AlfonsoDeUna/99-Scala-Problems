object P01 {

  // I've used the standard functional approach. See pattern machine
  def getLastElementFromList[A](ls: List[A]) :A = ls match {
    case h :: Nil => h
    case _ :: tail => getLastElementFromList(tail)
  }
  

}
