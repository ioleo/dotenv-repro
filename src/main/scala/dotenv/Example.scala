package dotenv

@main
def example() =
  println("Running example")
  sys.env.get("SOME_URI") match
    case Some(v) => println(s"Found SOME_URI env variable with value $v")
    case None    => println("SOME_URI env variable not found at runtime!")
