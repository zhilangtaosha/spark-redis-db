package uk.ac.cam.cl.r244

/**
 * @author ${user.name}
 */
object App {

  def foo(x : Array[String]): String = x.foldLeft("")((a,b) => a + b)

  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}