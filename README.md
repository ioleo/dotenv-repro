# dotenv-repro

Bug reproduction for dotenv plugin. Run `sbt run`.

On my local machine results in:

```
[info] Configured .env environment
[info] sbt server started at local:///home/user/.sbt/1.0/server/5e997c0092ee13b98960/sock
[info] started sbt server
sbt:dotenv> run
[info] compiling 1 Scala source to /home/user/Projects/dotenv-repro/target/scala-3.2.0/classes ...
[info] running dotenv.example 
Running example
SOME_URI env variable not found at runtime!
```