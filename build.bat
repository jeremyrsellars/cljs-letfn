@ECHO OFF
IF "x%~1"=="x" GOTO :USAGE
java -cp "cljs.jar;src" clojure.main %1

GOTO :eof

:USAGE
ECHO build.bat name-of-build.clj
GOTO :eof

