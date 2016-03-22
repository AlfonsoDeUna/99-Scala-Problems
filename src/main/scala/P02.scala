

object P02 {

  // In my first approach I've used again pattern matching
  // In this case the key was h:: _ ::tail
  def getPenultimate[A] (l: List[A]): A = l match {
   case h :: _ :: Nil => h
    case _ :: tail => getPenultimate(tail)
  }
  
}
